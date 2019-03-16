package com.example.tangren.myapplication.work;

import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSS;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.GetObjectResult;
import com.alibaba.sdk.android.oss.model.Range;
import com.example.tangren.myapplication.MyApplication;
import com.example.tangren.myapplication.util.IOUtils;
import com.example.tangren.myapplication.work.db.manager.DBManager;
import com.example.tangren.myapplication.work.entity.MQttMessageEntity;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/**
 * 作者：tangren on 2019/3/16
 * 包名：com.example.tangren.myapplication.work
 * 邮箱：996489865@qq.com
 * TODO:下载类
 */

public abstract class DownloadThread extends Thread {

    protected abstract void downloadFinish(String filePath, MQttMessageEntity entity);

    protected abstract void downloadFail(String errorMsg, MQttMessageEntity entity);

    protected abstract void downloadProgress(int progress, MQttMessageEntity entity);

    private MQttMessageEntity entity;
    private String endpoint = "oss-cn-beijing.aliyuncs.com";
    //是否删除老的文件
    private boolean isDeleteOld;
    //是否支持断点
    private boolean isRange;

    public DownloadThread(MQttMessageEntity entity, boolean isDeleteOld, boolean isRange) {
        this.entity = entity;
        this.isDeleteOld = isDeleteOld;
        this.isRange = isRange;
    }

    @Override
    public void run() {
        super.run();
        MQttMessageEntity mQttMessageENtity = DBManager.getMQttMessageENtity(entity.getUrl());
        if (mQttMessageENtity == null) {
            //新的任务
            newDownloadTask(mQttMessageENtity);
        } else {
            long lastDownloadPosition = mQttMessageENtity.getDownloadPosition();
            long maxPosition = mQttMessageENtity.getMaxPosition();
            String fileLocalPath = mQttMessageENtity.getFileFolder() + "/" + mQttMessageENtity.getFileName();
            File localFile = new File(fileLocalPath);
            boolean localFileExists = localFile.exists();
            if (!localFileExists) {
                //文件不存在,则移除任务从头开始下载
                newDownloadTask(mQttMessageENtity);
                return;
            }
            //已存在的任务,检查下载进度
            if (lastDownloadPosition == maxPosition) {
                //如果已下载完成
                if (isDeleteOld) {
                    //删除已经下载完毕的并且移除重新下载
                    boolean delete = localFile.delete();
                    newDownloadTask(mQttMessageENtity);
                    return;
                }
            }

            OSSLog.enableLog();
            ClientConfiguration configuration = new ClientConfiguration();
            configuration.setConnectionTimeout(30 * 1000);
            configuration.setSocketTimeout(30 * 1000);
            configuration.setMaxErrorRetry(5);
            OSSCredentialProvider provider = new OSSStsTokenCredentialProvider(entity.getAccessKeyId(), entity.getAccessKeySercet(), entity.getToken());
            OSS oss = new OSSClient(MyApplication.getInstance().getApplicationContext(), endpoint, provider, configuration);
            GetObjectRequest request = new GetObjectRequest(entity.getBucketName(), entity.getFilePath());
            request.setRange(new Range(lastDownloadPosition, maxPosition));
            int resCode = 404;
            RandomAccessFile randomAccessFile = null;
            InputStream inputStream = null;
            try {
                GetObjectResult getResult = oss.getObject(request);
                resCode = getResult.getStatusCode();
                inputStream = getResult.getObjectContent();
                byte[] buf = new byte[2048];
                int len = -1;
                File tempFile=null;
                randomAccessFile = new RandomAccessFile(tempFile, "rws");
                randomAccessFile.seek(lastDownloadPosition);
                while ((len = inputStream.read(buf)) != -1) {
                    lastDownloadPosition += len;
                }
            } catch (Exception e) {
                e.printStackTrace();
                String msg;
                if (e instanceof ClientException) {
                    msg = "客户端异常";
                    mQttMessageENtity.setDownloadPosition(lastDownloadPosition);
                    DBManager.updateDownload(mQttMessageENtity);
                } else if (e instanceof UnknownHostException
                        || e instanceof MalformedURLException) {
                    msg = e.getClass().getName();
                    DBManager.updateDownload(mQttMessageENtity);
                } else if (e instanceof SocketTimeoutException) {
                    msg = "网络超时";
                    mQttMessageENtity.setDownloadPosition(lastDownloadPosition);
                    DBManager.updateDownload(mQttMessageENtity);
                } else {
                    if (resCode >= 400) {
                        msg = "服务器异常[" + resCode + "]";
                    } else {
                        msg = e.getClass().getName();
                    }
                    DBManager.updateDownload(mQttMessageENtity);
                }
                downloadFail(msg, entity);
            } finally {
                IOUtils.closeQuietly(randomAccessFile);
                IOUtils.closeQuietly(inputStream);
            }
        }
    }

    private void newDownloadTask(MQttMessageEntity mQttMessageENtity) {
    }


}
