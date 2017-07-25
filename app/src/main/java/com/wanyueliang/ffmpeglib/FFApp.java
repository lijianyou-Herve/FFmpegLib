package com.wanyueliang.ffmpeglib;

import android.app.Application;

public class FFApp extends Application {

    static {
        System.loadLibrary("native-lib");
    }

}