package com.example.tangren.myapplication.work.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

/**
 * 作者：tangren on 2019/3/16
 * 包名：com.example.tangren.myapplication.work.entity
 * 邮箱：996489865@qq.com
 * TODO:一句话描述
 */
@Entity
public class MQttMessageEntity {
    @Id(autoincrement = true)
    private Long id;
    @Unique
    private String url;
    private String subKind;
    private String subTime;
    private String filePath;
    private String fileName;
    private String fileVersion;
    private String fileCheckMode;
    private String fileCheckCode;
    private String token;
    private String tokenExTime;
    private String accessKeyId;
    private String accessKeySercet;
    private String endpoint = "unk";
    private String bucketName;
    private String vehicleID;
    private String fileFolder;
    private String filename;
    //下载的当前位置
    private long downloadPosition;
    //文件最大位置,即文件大小
    private long maxPosition;
    //是否支持断点
    private boolean isReTry;
    //00:更新成功
    //01:消息接收成功
    //02:下载成功
    //03:下载出错
    //04：安装出错
    //05：下载错误移除任务
    private String processResult;
    private String processMsg;
    private String taskId;
    private String reserve_1;
    private String reserve_2;
    private String reserve_3;

    @Generated(hash = 1930485338)
    public MQttMessageEntity(Long id, String url, String subKind, String subTime, String filePath,
            String fileName, String fileVersion, String fileCheckMode, String fileCheckCode,
            String token, String tokenExTime, String accessKeyId, String accessKeySercet,
            String endpoint, String bucketName, String vehicleID, String fileFolder, String filename,
            long downloadPosition, long maxPosition, boolean isReTry, String processResult,
            String processMsg, String taskId, String reserve_1, String reserve_2, String reserve_3) {
        this.id = id;
        this.url = url;
        this.subKind = subKind;
        this.subTime = subTime;
        this.filePath = filePath;
        this.fileName = fileName;
        this.fileVersion = fileVersion;
        this.fileCheckMode = fileCheckMode;
        this.fileCheckCode = fileCheckCode;
        this.token = token;
        this.tokenExTime = tokenExTime;
        this.accessKeyId = accessKeyId;
        this.accessKeySercet = accessKeySercet;
        this.endpoint = endpoint;
        this.bucketName = bucketName;
        this.vehicleID = vehicleID;
        this.fileFolder = fileFolder;
        this.filename = filename;
        this.downloadPosition = downloadPosition;
        this.maxPosition = maxPosition;
        this.isReTry = isReTry;
        this.processResult = processResult;
        this.processMsg = processMsg;
        this.taskId = taskId;
        this.reserve_1 = reserve_1;
        this.reserve_2 = reserve_2;
        this.reserve_3 = reserve_3;
    }

    @Generated(hash = 1039113104)
    public MQttMessageEntity() {
    }

    public boolean isReTry() {
        return isReTry;
    }

    public void setReTry(boolean reTry) {
        isReTry = reTry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSubKind() {
        return subKind;
    }

    public void setSubKind(String subKind) {
        this.subKind = subKind;
    }

    public String getSubTime() {
        return subTime;
    }

    public void setSubTime(String subTime) {
        this.subTime = subTime;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getFileCheckMode() {
        return fileCheckMode;
    }

    public void setFileCheckMode(String fileCheckMode) {
        this.fileCheckMode = fileCheckMode;
    }

    public String getFileCheckCode() {
        return fileCheckCode;
    }

    public void setFileCheckCode(String fileCheckCode) {
        this.fileCheckCode = fileCheckCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenExTime() {
        return tokenExTime;
    }

    public void setTokenExTime(String tokenExTime) {
        this.tokenExTime = tokenExTime;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySercet() {
        return accessKeySercet;
    }

    public void setAccessKeySercet(String accessKeySercet) {
        this.accessKeySercet = accessKeySercet;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getFileFolder() {
        return fileFolder;
    }

    public void setFileFolder(String fileFolder) {
        this.fileFolder = fileFolder;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }

    public String getProcessMsg() {
        return processMsg;
    }

    public void setProcessMsg(String processMsg) {
        this.processMsg = processMsg;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getReserve_1() {
        return reserve_1;
    }

    public void setReserve_1(String reserve_1) {
        this.reserve_1 = reserve_1;
    }

    public String getReserve_2() {
        return reserve_2;
    }

    public void setReserve_2(String reserve_2) {
        this.reserve_2 = reserve_2;
    }

    public String getReserve_3() {
        return reserve_3;
    }

    public void setReserve_3(String reserve_3) {
        this.reserve_3 = reserve_3;
    }

    public long getDownloadPosition() {
        return this.downloadPosition;
    }

    public void setDownloadPosition(long downloadPosition) {
        this.downloadPosition = downloadPosition;
    }

    public boolean getIsReTry() {
        return this.isReTry;
    }

    public void setIsReTry(boolean isReTry) {
        this.isReTry = isReTry;
    }

    public long getMaxPosition() {
        return this.maxPosition;
    }

    public void setMaxPosition(long maxPosition) {
        this.maxPosition = maxPosition;
    }
}
