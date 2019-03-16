package com.example.tangren.myapplication.work.db.manager;

import com.example.tangren.myapplication.work.db.dao.MQttMessageEntityDao;
import com.example.tangren.myapplication.work.entity.MQttMessageEntity;

/**
 * 作者：tangren on 2019/3/16
 * 包名：com.example.tangren.myapplication.work.db.manager
 * 邮箱：996489865@qq.com
 * TODO:一句话描述
 */

public class DBManager {

    public static MQttMessageEntity getMQttMessageENtity(String target) {
        MQttMessageEntityDao mQttMessageEntityDao = DBCore.getDaoSession().getMQttMessageEntityDao();
        return mQttMessageEntityDao.queryBuilder()
                .orderDesc(MQttMessageEntityDao.Properties.Id)
                .where(MQttMessageEntityDao.Properties.Url.eq(target))
                .limit(1).build().unique();
    }

    public static void updateDownload(MQttMessageEntity mQttMessageENtity) {
        MQttMessageEntityDao mQttMessageEntityDao = DBCore.getDaoSession().getMQttMessageEntityDao();
        mQttMessageEntityDao.update(mQttMessageENtity);
    }

    public static void removeDownload(MQttMessageEntity mQttMessageENtity) {
        MQttMessageEntityDao mQttMessageEntityDao = DBCore.getDaoSession().getMQttMessageEntityDao();
        mQttMessageEntityDao.delete(mQttMessageENtity);
    }
}
