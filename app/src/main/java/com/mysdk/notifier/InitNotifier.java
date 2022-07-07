package com.mysdk.notifier;

import android.util.Log;

import com.mysdk.Sdk;
import com.mysdk.plugin.PluginManager;
import com.mysdk.plugin.PluginNode;
import com.mysdk.plugin.PluginStatus;

public final class InitNotifier implements IInitNotifier{

    private static final String a ="BaseLib.Notifier";

    private IInitNotifier b =null;

    public InitNotifier(IInitNotifier initNotifier){
        Log.e("MbSDk InitNotifier impl",""+initNotifier.toString());
        this.b = initNotifier;
    }

    public void onSuccess() {
        Log.d("BaseLib.BIN", "=>BIN onSuccess");
        if (this.b != null) {
            this.b.onSuccess();
        }
        PluginManager.a().a(PluginNode.AFTER_INIT, new Object[]{Sdk.getInstance().getActivity(), PluginStatus.INIT_SUCCESS});
    }

    @Override
    public void onFailed(String message, String trace) {
        Log.d("BaseLib.BIN", "=>BIN onFailed message = " + message + ", trace = " + trace);
        if (this.b != null) {
            this.b.onFailed(message, trace);
        }
        PluginManager.a().a(PluginNode.AFTER_INIT, new Object[]{Sdk.getInstance().getActivity(), PluginStatus.INIT_SUCCESS});
    }
}