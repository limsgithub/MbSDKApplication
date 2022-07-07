package com.mysdk.apiadapter.impl;

import android.app.Activity;

import com.mysdk.apiadapter.ISdkAdapter;

public class SdkAdapter implements ISdkAdapter {
    @Override
    public void init(Activity var1) {

    }

    @Override
    public void checkUpdate(Activity var1) {

    }

    @Override
    public void exit(Activity var1) {

    }

    @Override
    public String getSdkSubVersion() {
        return null;
    }

    @Override
    public String getChannelSdkVersion() {
        return null;
    }

    @Override
    public boolean isShowExitDialog() {
        return false;
    }
}
