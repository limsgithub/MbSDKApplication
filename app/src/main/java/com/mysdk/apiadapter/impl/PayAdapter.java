package com.mysdk.apiadapter.impl;

import android.app.Activity;
import android.util.Log;

import com.mysdk.apiadapter.IPayAdapter;
import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.OrderInfo;
import com.mysdk.net.Connect;

public class PayAdapter implements IPayAdapter {
    @Override
    public String getPayParams() {
        Log.d("mbsdk apiadapter.impl", "payAdapter charge");
        return "";
    }

    @Override
    public void pay(Activity activity, String orderID, String var3, OrderInfo var4, GameRoleInfo var5) {
        Connect.getInstance().a(activity, "9", "0", "Amount");
    }

    @Override
    public void charge(Activity var1, OrderInfo var2, GameRoleInfo var3) {
        Log.d("mbsdk apiadapter.impl", "payAdapter charge");
    }
}
