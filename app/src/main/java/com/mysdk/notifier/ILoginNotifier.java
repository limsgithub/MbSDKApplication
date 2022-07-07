package com.mysdk.notifier;

import com.mysdk.entity.UserInfo;

public interface ILoginNotifier {
    void onSuccess(UserInfo var1);

    void onCancel();

    void onFailed(String var1, String var2);
}
