package com.mysdk;

import android.app.Activity;
import android.content.Intent;

import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.OrderInfo;
import com.mysdk.entity.UserInfo;
import com.mysdk.notifier.IChargeNotifier;
import com.mysdk.notifier.IExitNotifier;
import com.mysdk.notifier.IInitNotifier;
import com.mysdk.notifier.ILoginNotifier;
import com.mysdk.notifier.ILogoutNotifier;
import com.mysdk.notifier.IPayNotifier;
import com.mysdk.notifier.ISwitchAccountNotifier;
import com.mysdk.notifier.SwitchAccountNotifier;


public class MbSdkProxy {
        private static MbSdkProxy a = null;
        private Activity b = null;

        public MbSdkProxy() {
        }

        public static MbSdkProxy getInstance() {
            if (a == null) {
                a = new MbSdkProxy();
            }

            return a;
        }

        public MbSdkProxy setInitNotifier(IInitNotifier notifier) {
            MbSDK.getInstance().setInitNotifier(notifier);
            return a;
        }

        public MbSdkProxy setLoginNotifier(ILoginNotifier notifier) {
            MbSDK.getInstance().setLoginNotifier(notifier);
            return a;
        }

        public MbSdkProxy setLogoutNotifier(ILogoutNotifier notifier) {
            MbSDK.getInstance().setLogoutNotifier(notifier);
            return a;
        }

        public MbSdkProxy setExitNotifier(IExitNotifier notifier) {
            MbSDK.getInstance().setExitNotifier(notifier);
            return a;
        }

        public  MbSdkProxy setPayNotifier(IPayNotifier notifier) {
            MbSDK.getInstance().setPayNotifier(notifier);
            return a;
        }

        public MbSdkProxy setChargeNotifier(IChargeNotifier notifier) {
            //MbSDK.getInstance().setChargeNotifier(notifier);
            return a;
        }

        public MbSdkProxy setSwitchAccountNotifier(ISwitchAccountNotifier notifier) {
            MbSDK.getInstance().setSwitchAccountNotifier(notifier);
            return a;
        }

        public void onCreate(Activity activity) {
            Sdk.getInstance().onCreate(activity);
        }

        public void onStart(Activity activity) {
            Sdk.getInstance().onStart(activity);
        }

        public void onRestart(Activity activity) {
            Sdk.getInstance().onRestart(activity);
        }

        public void onResume(Activity activity) {
            Sdk.getInstance().onResume(activity);
        }

        public void onPause(Activity activity) {
            Sdk.getInstance().onPause(activity);
        }

        public void onStop(Activity activity) {
            Sdk.getInstance().onStop(activity);
        }

        public void onDestroy(Activity activity) {
            Sdk.getInstance().onDestroy(activity);
        }

        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
            Sdk.getInstance().onActivityResult(activity, requestCode, resultCode, data);
        }

        public void onNewIntent(Intent intent) {
            Sdk.getInstance().onNewIntent(intent);
        }

        public void init(final Activity activity) {
            this.b = activity;
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    Sdk.getInstance().init(activity);
                }
            });
        }

        public void init(final Activity activity, final String productCode, final String productKey) {
            this.b = activity;
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    Sdk.getInstance().init(activity, productCode, productKey);
                }
            });
        }

        public void login() {
            this.b.runOnUiThread(new Runnable() {
                public void run() {
                    User.getInstance().login(MbSdkProxy.this.b);
                }
            });
        }

        public UserInfo getUserInfo() {
            return User.getInstance().getUserInfo();
        }

        public void createRole(GameRoleInfo roleInfo) {
            User.getInstance().setGameRoleInfo(this.b, roleInfo, true);
        }

        public void enterGame(GameRoleInfo roleInfo) {
            User.getInstance().setGameRoleInfo(this.b, roleInfo, false);
        }

        public void updateRole(GameRoleInfo roleInfo) {
            User.getInstance().setGameRoleInfo(this.b, roleInfo, false);
        }

        public void pay(final OrderInfo orderInfo, final GameRoleInfo roleInfo) {
            this.b.runOnUiThread(new Runnable() {
                public void run() {
                    Payment.getInstance().pay(MbSdkProxy.this.b, orderInfo, roleInfo);
                }
            });
        }

        public void logout() {
            this.b.runOnUiThread(new Runnable() {
                public void run() {
                    User.getInstance().logout(MbSdkProxy.this.b);
                }
            });
        }

        public boolean channelHasExitDialog() {
            return MbSDK.getInstance().isShowExitDialog();
        }

        public void exit() {
            this.b.runOnUiThread(new Runnable() {
                public void run() {
                    Sdk.getInstance().exit(MbSdkProxy.this.b);
                }
            });
        }

        public int getChannelType() {
            return Extend.getInstance().getChannelType();
        }

        public String getExtrasConfig(String key) {
            return Extend.getInstance().getExtrasConfig(key);
        }

        public boolean isFunctionSupported(int funcType) {
            return Extend.getInstance().isFunctionSupported(funcType);
        }

        public String callFunction(Activity activity, int funcType) {
            return Extend.getInstance().callFunction(activity, funcType);
        }
}
