package com.mysdk.notifier;

public interface ILogoutNotifier {
    void onSuccess();

    void onFailed(String var1, String var2);
}
