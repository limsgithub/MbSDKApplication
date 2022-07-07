package com.mysdk.notifier;

public interface IPayNotifier {
    void onSuccess(String var1, String var2, String var3);

    void onCancel(String var1);

    void onFailed(String var1, String var2, String var3);
}
