package com.mysdk.notifier;

public class PayNotifier implements IPayNotifier{
    private static final String a ="BaseLib.Notifier";
    private IPayNotifier b =null;

    public PayNotifier(IPayNotifier payNotifier){
        this.b = payNotifier;
    }

    @Override
    public void onSuccess(String var1, String var2, String var3) {

    }

    @Override
    public void onCancel(String var1) {

    }

    @Override
    public void onFailed(String var1, String var2, String var3) {

    }
}
