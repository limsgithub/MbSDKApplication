package com.mysdk.apiadapter;

import android.app.Activity;

public interface ISdkAdapter {

    void init(Activity var1);

    void checkUpdate(Activity var1);

    void exit(Activity var1);

    String getSdkSubVersion();

    String getChannelSdkVersion();

    boolean isShowExitDialog();
}
