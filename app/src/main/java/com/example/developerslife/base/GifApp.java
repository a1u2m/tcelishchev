package com.example.developerslife.base;

import android.app.Application;

import com.example.developerslife.network.Api;

public class GifApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Api.init();
    }
}
