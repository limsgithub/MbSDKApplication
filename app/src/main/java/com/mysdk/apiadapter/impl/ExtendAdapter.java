package com.mysdk.apiadapter.impl;

import android.app.Activity;
import android.util.Log;

import com.mysdk.BaseCallBack;
import com.mysdk.apiadapter.IExtendAdapter;

public class ExtendAdapter implements IExtendAdapter {
    @Override
    public boolean isFunctionSupported(int var1) {
        return false;
    }

    @Override
    public String callFunction(Activity var1, int funcType) {

        Log.d("mnsdk apiadapter.impl", "callFunctionWithParams funcType:" + funcType);
        return null;
    }

    @Override
    public void callFunctionWithParams(Activity var1, int funcType, Object... var3) {

        Log.d("mnsdk apiadapter.impl", "callFunctionWithParams funcType:" + funcType);

    }

    @Override
    public void callFunctionWithParamsCallBack(Activity var1, int funcType, BaseCallBack var3, Object... var4) {

        Log.d("mnsdk apiadapter.impl", "callFunctionWithParams funcType:" + funcType);

    }
}
