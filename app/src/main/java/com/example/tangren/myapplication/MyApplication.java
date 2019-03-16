package com.example.tangren.myapplication;

import android.app.Application;

/**
 * 作者：tangren on 2019/3/16
 * 包名：com.example.tangren.myapplication
 * 邮箱：996489865@qq.com
 * TODO:一句话描述
 */

public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }

    public static MyApplication getInstance() {
        return instance;
    }
}
