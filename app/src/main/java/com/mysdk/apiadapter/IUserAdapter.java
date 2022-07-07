package com.mysdk.apiadapter;

import android.app.Activity;

import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.UserInfo;

public interface IUserAdapter {
    void login(Activity var1);

    void logout(Activity var1);

    UserInfo getUserInfo(Activity var1);

    void setGameRoleInfo(Activity var1, GameRoleInfo var2, boolean var3);
}
