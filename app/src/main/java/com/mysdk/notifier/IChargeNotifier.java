package com.mysdk.notifier;

public interface IChargeNotifier{
    //交易成功
    void onSuccess();
    //交易取消
    void onCancel();

    ///交易失败
    void onFailed(String var1,String var2);
}
