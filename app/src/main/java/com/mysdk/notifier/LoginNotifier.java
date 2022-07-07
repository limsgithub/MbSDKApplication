package com.mysdk.notifier;

import com.mysdk.entity.UserInfo;

public class LoginNotifier implements ILoginNotifier{
    private static final String a= "BaseLib.Notifier";

    private ILoginNotifier b =null;

    public LoginNotifier(ILoginNotifier loginNotifier){
        this.b =loginNotifier;
    }


    @Override
    public void onSuccess(UserInfo var1) {

    }

    @Override
    public void onCancel() {

    }

    @Override
    public void onFailed(String var1, String var2) {

    }
}
