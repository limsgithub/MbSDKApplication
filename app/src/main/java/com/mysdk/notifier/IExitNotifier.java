package com.mysdk.notifier;

public interface IExitNotifier {
    void onSuccess();

    void onFailed(String var1,String var2);
}
