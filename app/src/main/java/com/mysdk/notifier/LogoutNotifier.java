package com.mysdk.notifier;

public class LogoutNotifier implements ILogoutNotifier{
    private static final String a ="BaseLib.Notifier";
    private ILogoutNotifier b =null;

    public LogoutNotifier(ILogoutNotifier logoutNotifier){
        this.b = logoutNotifier;
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailed(String var1, String var2) {

    }
}
