package com.mysdk.apiadapter.impl;

import android.content.Context;

import com.mysdk.apiadapter.IActivityAdapter;
import com.mysdk.apiadapter.IAdapterFactory;
import com.mysdk.apiadapter.IExtendAdapter;
import com.mysdk.apiadapter.IPayAdapter;
import com.mysdk.apiadapter.ISdkAdapter;
import com.mysdk.apiadapter.IUserAdapter;

public class AdapterFactory implements IAdapterFactory {
    private Context ctx;
    @Override
    public IActivityAdapter adtActivity() {
        return new ActivityAdapter();
    }

    @Override
    public IExtendAdapter adtExtend() {
        return new ExtendAdapter();
    }

    @Override
    public IPayAdapter adtPay() {
        return new PayAdapter();
    }

    @Override
    public ISdkAdapter adtSdk() {
        return new SdkAdapter();
    }

    @Override
    public IUserAdapter adtUser() {
        return new UserAdapter(ctx);
    }
}
