package com.mysdk.apiadapter;

import android.app.Activity;

import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.OrderInfo;

public interface IPayAdapter {
    String getPayParams();

    void pay(Activity var1, String var2 , String var3, OrderInfo var4, GameRoleInfo var5);

    void charge(Activity var1,OrderInfo var2, GameRoleInfo var3);
}
