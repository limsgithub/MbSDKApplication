package com.mysdk.utility;
import android.text.TextUtils;
import com.mysdk.apiadapter.IAdapterFactory;


public final class a {
    private static final String a = "impl";

    public a() {
    }

    public static IAdapterFactory a() {
        String channelName = "impl";

        String channelAdapterName;
        try {
            //if (!TextUtils.isEmpty(channelAdapterName = AppConfig.getInstance().getConfigValue("_channel_name"))) {
            channelAdapterName = AppConfig.getInstance().getConfigValue("_channel_name");
                channelName = channelAdapterName.trim();
           // }
        } catch (Exception var3) {
            channelName = "impl";
        }

        if (TextUtils.isEmpty(channelName)) {
            channelName = "impl";
        }

        channelAdapterName ="com.mysdk.apiadapter."+channelName+".AdapterFactory";

        try {
            return (IAdapterFactory)Class.forName(channelAdapterName).newInstance();
        } catch (Exception var2) {
            return null;
        }
    }

}