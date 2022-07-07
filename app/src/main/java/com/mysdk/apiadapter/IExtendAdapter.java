package com.mysdk.apiadapter;

import android.app.Activity;

import com.mysdk.BaseCallBack;

public interface IExtendAdapter {
    boolean isFunctionSupported(int var1);

    String callFunction(Activity var1, int var2);

    void callFunctionWithParams(Activity var1, int var2, Object... var3);

    void callFunctionWithParamsCallBack(Activity var1, int var2, BaseCallBack var3, Object... var4);
}
