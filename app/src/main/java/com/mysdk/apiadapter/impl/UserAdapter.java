package com.mysdk.apiadapter.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.mysdk.User;
import com.mysdk.apiadapter.IUserAdapter;
import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter implements IUserAdapter {
    public Context ctx;
    private List<String> a;
    private List<String> b;
    private List<String> c;
    private List<String> d;
    private GameRoleInfo g;
    private boolean h;

    public UserAdapter(Context ctx){
        this.ctx = ctx;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
    }
    @Override
    public void login(Activity var1) {

    }

    @Override
    public void logout(Activity var1) {

    }

    @Override
    public UserInfo getUserInfo(Activity var1) {
        return null;
    }

    @Override
    public void setGameRoleInfo(Activity activity, GameRoleInfo roleInfo, boolean createRole) {
        Log.e("mbsdk apiadapter.impl","UserAdapter setGameRoleInfo");
        activity.runOnUiThread(new Runnable() {
            public final void run() {
                StringBuilder var6;
                (var6 = new StringBuilder()).append("setGameRoleInfo\r\n");

                if (createRole) {
                    var6.append("创建角色\r\n");
                }
                var6.append("调用次数:").append(1).append("\r\n");
                var6.append("createRole: ").append(createRole).append("\r\n");
                var6.append("createRoleTime: ").append(roleInfo.getRoleCreateTime()).append("\r\n");
                var6.append("ServerID: ").append(roleInfo.getServerID()).append("\r\n");
                var6.append("GameBalance: ").append(roleInfo.getGameBalance()).append("\r\n");
                var6.append("GameRoleID: ").append(roleInfo.getGameRoleID()).append("\r\n");
                var6.append("GameRoleLevel: ").append(roleInfo.getGameRoleLevel()).append("\r\n");
                var6.append("GameRoleName: ").append(roleInfo.getGameRoleName()).append("\r\n");
                var6.append("PartyName: ").append(roleInfo.getPartyName()).append("\r\n");
                var6.append("VipLevel: ").append(roleInfo.getVipLevel()).append("\r\n");
                var6.append("ServerID: ").append(roleInfo.getServerID()).append("\r\n");
                var6.append("ServerName: ").append(roleInfo.getServerName());
                String var7 = var6.toString();
                UserAdapter.show(ctx, var7).show();
                d.add(var7);
                g = roleInfo;
                h = createRole;
            }
        });
    }

    @SuppressLint("WrongConstant")
    public static Toast show(Context context, String text) {
        Toast toast = new Toast(context);
        TextView textView = new TextView(context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(1);
        textView.setText(text);
        toast.setView(textView);
        return toast;
    }
}
