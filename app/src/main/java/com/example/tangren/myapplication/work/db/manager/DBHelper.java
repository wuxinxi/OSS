package com.example.tangren.myapplication.work.db.manager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.tangren.myapplication.work.db.dao.DaoMaster;


/**
 * 作者：Tangren_ on 2017/3/23 0023.
 * 邮箱：wu_tangren@163.com
 * TODO：更新数据库
 */


public class DBHelper extends DaoMaster.OpenHelper {
    DBHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        update(db, oldVersion, newVersion);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        super.onDowngrade(db, oldVersion, newVersion);
        update(db, oldVersion, newVersion);
    }

    private void update(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
