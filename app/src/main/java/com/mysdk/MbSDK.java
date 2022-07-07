package com.mysdk;

import android.util.Log;
import android.widget.Toast;

import com.mysdk.entity.UserInfo;
import com.mysdk.notifier.ChargeNotifier;
import com.mysdk.notifier.ExitNotifier;
import com.mysdk.notifier.IChargeNotifier;
import com.mysdk.notifier.IExitNotifier;
import com.mysdk.notifier.IInitNotifier;
import com.mysdk.notifier.ILoginNotifier;
import com.mysdk.notifier.ILogoutNotifier;
import com.mysdk.notifier.IPayNotifier;
import com.mysdk.notifier.ISwitchAccountNotifier;
import com.mysdk.notifier.InitNotifier;
import com.mysdk.notifier.LoginNotifier;
import com.mysdk.notifier.LogoutNotifier;
import com.mysdk.notifier.PayNotifier;
import com.mysdk.notifier.SwitchAccountNotifier;
import com.mysdk.utility.AppConfig;

public class MbSDK {
    private static MbSDK a = null;
    private IInitNotifier b = null;
    private ILoginNotifier c = null;
    private ILogoutNotifier d = null;
    private IExitNotifier e = null;
    private IPayNotifier f = null;
    private IChargeNotifier g = null;
    private ISwitchAccountNotifier h = null;

    private MbSDK() {
    }

    public static MbSDK getInstance() {
        if(a == null){
            a = new MbSDK();
        }
        return a;
    }

    public MbSDK setDebugMode(boolean debugMode) {
        AppConfig.getInstance().setDebugMode(true);
        return a;
    }

    public MbSDK setIsLandScape(boolean isLandScape) {
        AppConfig.getInstance().setIsLandScape(isLandScape);
        return a;
    }

    public MbSDK setInitNotifier(IInitNotifier notifier) {
        Log.e("MbSDk setInitNotifier",""+notifier.toString());
        this.b = new InitNotifier(notifier);
        return a;
    }

    public MbSDK setLoginNotifier(ILoginNotifier notifier) {
        this.c = new LoginNotifier(notifier);
        return a;
    }

    public MbSDK setLogoutNotifier(ILogoutNotifier notifier) {
        this.d = new LogoutNotifier(notifier);
        return a;
    }

    public MbSDK setExitNotifier(IExitNotifier notifier) {
        this.e = new ExitNotifier(notifier);
        return a;
    }
    public MbSDK setPayNotifier(IPayNotifier notifier) {
        this.f = new PayNotifier(notifier);
        return a;
    }

    public MbSDK setSwitchAccountNotifier(ISwitchAccountNotifier notifier) {
        return a;
    }

    /** @deprecated */
    @Deprecated
    public MbSDK setShowExitDialog(boolean dialogShow) {
        AppConfig.getInstance().setShowExistDialog(dialogShow);
        return a;
    }

    public boolean isShowExitDialog() {
       return Sdk.getInstance().isSDKShowExitDialog();
    }

    public Boolean isLandscape() {
        return AppConfig.getInstance().isLandScape();
    }

    public IInitNotifier getInitNotifier() {
        return this.b;
    }

    public ILoginNotifier getLoginNotifier() {
        return this.c;
    }

    public ILogoutNotifier getLogoutNotifier() {
        return this.d;
    }

    public IExitNotifier getExitNotifier() {
        return this.e;
    }

    public IPayNotifier getPayNotifier() {
        return f;
    }

    public IChargeNotifier getChargeNotifier() {
        return this.g;
    }



}

