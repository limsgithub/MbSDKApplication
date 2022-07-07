package com.mysdk.notifier;

import com.mysdk.apiadapter.IExtendAdapter;

public final class ExitNotifier implements IExitNotifier {
    private static final String a = "BaseLib.Notifier";
    private IExitNotifier b = null;

    public ExitNotifier(IExitNotifier exitNotifier) {
        this.b = exitNotifier;
    }


    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailed(String var1, String var2) {

    }
}
