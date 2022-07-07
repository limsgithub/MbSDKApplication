package com.mysdk;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.mysdk.apiadapter.IAdapterFactory;
import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.UserInfo;
import com.mysdk.net.Connect;
import com.mysdk.utility.AppConfig;

import java.util.Random;
import java.util.UUID;

public class User {
    private static final String a = "BaseLib.User";
    private static User b = null;
    private IAdapterFactory c = null;
    private UserInfo d = null;

    private User() {

    }
    public static User getInstance() {
        if (b == null) {
            b = new User();
        }

        return b;
    }

    public void login(Activity activity) {
        this.doLogin(activity);
    }

    public void doLogin(final Activity activity) {
        Log.e("BaseLib.User", "=>doLogin server, msg = " + AppConfig.getInstance().toString());
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(activity,AppConfig.getInstance().getChannelType(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setGameRoleInfo(Activity activity, GameRoleInfo roleInfo, boolean createRole) {
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setUID(UUID.randomUUID().toString());
            userInfo.setUserName("mb_"+ new Random(1999999999));
            getInstance().setUserInfo(userInfo);

            if ((userInfo = getInstance().getUserInfo()) != null) {
                Connect.getInstance().a(activity, userInfo.getUID(), userInfo.getUserName(),
                        userInfo.getToken(),roleInfo);
            }else{
                Log.e("BaseLib.User", "用户未登陆，无法更新RoleInfo");
            }

            if(roleInfo !=null && roleInfo.getGameRoleName()!=null ){
                Log.e("BaseLib.User.roleInfo", "doExLogUpload roleInfo onSuccess"+ roleInfo.getGameRoleName());
            }
            ////创建角色
            if((userInfo.getUID())==null){
                Log.e("BaseLib.UserInfo",userInfo.toString());
            }
            this.c.adtUser().setGameRoleInfo(activity,roleInfo, createRole);
        } catch (Exception var5) {
            Log.e("BaseLib.User", "=>setGameRoleInfo Exception = " + var5.getMessage());
        }
    }

    /** @deprecated */
    @Deprecated
    public UserInfo getUserInfo(Activity activity) {
        return this.d;
    }

    public UserInfo getUserInfo() {
        return this.d;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.d = userInfo;
    }

    public boolean isLogin(Activity activity) {
        return getInstance().getUserInfo() != null;
    }

    public void logout(Activity activity) {
        Log.e("BaseLib.User", "用户未登陆，无法更新RoleInfo");
    }
}
