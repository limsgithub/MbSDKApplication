package com.mysdk.apiadapter.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.mysdk.apiadapter.IActivityAdapter;

public class ActivityAdapter implements IActivityAdapter {
    @Override
    public void onApplicationInit(Context var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onActivityResult(Activity var1, int var2, int var3, Intent var4) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onCreate(Activity var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onDestroy(Activity var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onNewIntent(Intent var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onPause(Activity var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onStart(Activity var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onRestart(Activity var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onResume(Activity var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }

    @Override
    public void onStop(Activity var1) {
        Log.d("mbsdk apiadapter.impl", "onCreate");
    }
}
