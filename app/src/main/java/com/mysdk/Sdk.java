package com.mysdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.mysdk.b.a;
import com.mysdk.net.Connect;
import com.mysdk.utility.AppConfig;


public class Sdk {
    private static final String a = "BaseLib.Sdk";
    private static Sdk b = null;
    private static a c = null;
    private Activity e;
    private Context f = null;
    private Boolean g = false;

    private Sdk() {
    }

    public static Sdk getInstance() {
        if (b == null) {
            b = new Sdk();
        }

        return b;
    }

    public void init(Activity activity) {
        this.a(activity, AppConfig.getInstance().getProductCode(), AppConfig.getInstance().getProductKey());

    }

    public void init(Activity activity, String productCode, String productKey) {
        Log.e("Sdk","init params,son transfer MbSDK "+productCode+":"+productKey+":调用API 校验");
        this.a(activity, TextUtils.isEmpty(AppConfig.getInstance().getProductCode()) ? productCode : (AppConfig.getInstance().getChannelType() == 0 ? productCode : AppConfig.getInstance().getProductCode()), TextUtils.isEmpty(AppConfig.getInstance().getProductKey()) ? productKey : (AppConfig.getInstance().getChannelType() == 0 ? productKey : AppConfig.getInstance().getProductKey()));
    }

    @SuppressLint({"HandlerLeak"})
    private void a(Activity activity, String productCode, String productKey) {
        this.e = activity;
        try {
            MbSDK.getInstance().setIsLandScape(activity.getResources().getConfiguration().orientation == 2);
            AppConfig.getInstance().setProductCode(productCode);
            AppConfig.getInstance().setProductKey(productKey);
            AppConfig.getInstance().setSdkSubVersion("1.0");
            AppConfig.getInstance().setChannelSdkVersion("2.0");

            Log.e("BaseLib.Sdk", "BaseLib Version:" + AppConfig.getInstance().getSdkVersion());
            Log.e("BaseLib.Sdk", "Channel SDK Version:" + AppConfig.getInstance().getChannelSdkVersion());
            // ok
            Connect.getInstance().a(activity);

        } catch (Exception var5) {
            Log.e("BaseLib.Sdk", "=>init Exception = " + var5.getMessage());
            //ExUtils.printThrowableInfo(var5);
        }
    }

    public boolean isSDKShowExitDialog() {
        return true;
    }
    public void exit(Activity activity) {
        Log.e("BaseLib.Sdk", "exit Exception = ");
    }

    public void onCreate(Activity activity) {
    }

    public void onPause(Activity activity) {
    }

    public void onResume(Activity activity) {
    }

    public void onStop(Activity activity) {
    }

    public void onRestart(Activity activity) {
    }

    public void onStart(Activity activity) {
        this.e = activity;
    }

    public void onDestroy(Activity activity) {
        this.unregisterGlobalReceiver();
    }

    public void registerGlobalReceiver(Context context) {
        if (context != null) {
            c = new a();
            IntentFilter filter;
            (filter = new IntentFilter()).addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(c, filter);
        }

    }

    public void unregisterGlobalReceiver() {
    }

    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {

    }

    public void onNewIntent(Intent intent) {

    }

    public Activity getActivity() {
        return this.e;
    }

    public Boolean getSwitchToQuickGame() {
        return this.g;
    }

    public void setSwitchToQuickGame() {

    }
}
