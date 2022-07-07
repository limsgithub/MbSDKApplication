package com.mysdk;

import android.app.Activity;
import android.os.Build;
import android.util.Log;

import com.mysdk.apiadapter.IAdapterFactory;
import com.mysdk.utility.AppConfig;

import java.util.Random;

public class Extend {
    private static Extend a = null;
    private IAdapterFactory b = null;

    private Extend() {

    }

    public static Extend getInstance() {
        if (a == null) {
            a = new Extend();
        }
        return a;
    }

    public int getChannelType() {
        return AppConfig.getInstance().getChannelType();
    }

    public String getExtrasConfig(String key) {
        return AppConfig.getInstance().getConfigValue(key);
    }

    public String getDeviceID(Activity activity) {
        try {
            //制造商 （Manufacturer）
            String manufacturer = Build.MANUFACTURER;
            ///型号（Model）
            String model = android.os.Build.MODEL;
            ///品牌（Brand）
            String brand = android.os.Build.BRAND;
            ///设备名 （Device）
            String device = android.os.Build.DEVICE;
            return "deviceID-"+manufacturer+"-Model"+model+"-Brand-"+brand;
        } catch (Exception var3) {
            Log.e("mingboSDK", "getDeviceID erro" + var3.toString());
            return "";
        }
    }

    public boolean isFunctionSupported(int funcType) {
        return false;
    }

    public void uploadNode(Activity activity, String eventCode, String eventParams) {
    }

    public void callPlugin(Activity activity, int funcType, Object... infos) {
        Log.d("mingbo", "callPlugin funcType: " + funcType);
    }

    public String callFunction(Activity activity, int funcType) {
        return "callFunction";
    }

    public void callFunctionWithParams(Activity activity, int funcType, Object... infos) {

    }

    public void callFunctionWithParamsCallBack(Activity activity, int funcType, BaseCallBack callBack, Object... infos) {

    }
}
