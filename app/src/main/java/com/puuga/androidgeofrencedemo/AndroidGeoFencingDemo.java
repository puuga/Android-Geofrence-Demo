package com.puuga.androidgeofrencedemo;

import android.app.Application;

import com.puuga.androidgeofrencedemo.util.Contextor;

/**
 * Created by siwaweswongcharoen on 2/3/2017 AD.
 */

public class AndroidGeoFencingDemo extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().init(getApplicationContext());
    }
}
