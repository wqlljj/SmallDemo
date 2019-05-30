package com.example.cloud.smalldemo;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by cloud on 2019/5/29.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Small.preSetUp(this);
    }

    }
