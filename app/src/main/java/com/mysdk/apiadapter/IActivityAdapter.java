package com.mysdk.apiadapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public interface IActivityAdapter {
    void onApplicationInit(Context var1);

    void onActivityResult(Activity var1, int var2, int var3, Intent var4);

    void onCreate(Activity var1);

    void onDestroy(Activity var1);

    void onNewIntent(Intent var1);

    void onPause(Activity var1);

    void onStart(Activity var1);

    void onRestart(Activity var1);

    void onResume(Activity var1);

    void onStop(Activity var1);
}
