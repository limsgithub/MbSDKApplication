package com.mysdk;

import android.app.Activity;
import android.util.Log;

import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.OrderInfo;
import com.mysdk.entity.UserInfo;
import com.mysdk.net.Connect;
import com.mysdk.notifier.IPayNotifier;

public class Payment {
    private static final String a = "BaseLib.Payment";
    private static Payment b = null;
    private Payment() {
    }

    public static Payment getInstance() {
        if (b == null) {
            b = new Payment();
        }

        return b;
    }

    public void pay(Activity activity, OrderInfo orderInfo, GameRoleInfo roleInfo) {
        UserInfo userInfo;
        if ((userInfo = User.getInstance().getUserInfo()) == null) {
           MbSDK.getInstance().getPayNotifier().onFailed(orderInfo.getCpOrderID(),"用户未登录","");

        } else {
            this.doPay(activity,orderInfo,roleInfo,userInfo);
        }
    }

    public void doPay(final Activity activity, final OrderInfo orderInfo, final GameRoleInfo roleInfo,final UserInfo userInfo) {
        try {
            IPayNotifier connectNotifier = new IPayNotifier() {
                public void onSuccess(String sdkOrderID, String cpOrderID, String extrasParams) {
                    Log.w("BaseLib.Payment", "mb sdk pay success, call channel pay");
                }

                public void onCancel(String cpOrderID) {
                    Log.w("BaseLib.Payment", "mb sdk pay cancel");
                }

                public void onFailed(String cpOrderID, String message, String trace) {
                    Log.e("BaseLib.Payment", "mb sdk pay failed");
                    if (MbSDK.getInstance().getPayNotifier() != null) {
                    }
                }
            };
            String payParams = "";;
            Connect.getInstance().a(activity,
                    userInfo.getUID(), userInfo.getUserName(), userInfo.getToken(),
                    orderInfo, roleInfo, payParams, connectNotifier
            );
        } catch (Exception var7) {
            Log.e("BaseLib.Payment", "=>doPay Exception = " + var7.getMessage());
        }
    }
}
