package com.mysdk;

import android.app.Application;
import android.content.Context;

import com.mysdk.apiadapter.IAdapterFactory;
import com.mysdk.utility.AppConfig;
import com.mysdk.Sdk;
public class MbSDKApplication extends Application {
    private IAdapterFactory a = null;
    public MbSDKApplication(){

    }

    protected void attachBaseContext(Context base){
        AppConfig.getInstance().init(base);
        Sdk.getInstance().registerGlobalReceiver(base);
        super.attachBaseContext(base);
    }


    public void onCreate() {
        this.a = com.mysdk.utility.a.a();
        this.a.adtActivity().onApplicationInit(this);
        super.onCreate();
    }
}
