package com.mysdk.plugin;

import android.app.Activity;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PluginManager {
    private static final String a = "channel.PM";
    private static PluginManager b = null;
    private HashMap<PluginNode, ArrayList> c = new HashMap();
    private List<String> d = new ArrayList();

    private PluginManager() {
    }
    public static PluginManager a() {
        if (b == null) {
            Class var0 = PluginManager.class;
            synchronized(PluginManager.class) {
                if (b == null) {
                    b = new PluginManager();
                }
            }
        }
        return b;
    }

    public final void a(Activity activity) {
        if (activity == null) {
            Log.e("channel.PM", "IP error, activity is null");
        } else {
            Activity var3 = activity;
            PluginManager var2 = this;

            try {
                String[] var8;
                int var7 = (var8 = var3.getAssets().list("")).length;

                for(int var6 = 0; var6 < var7; ++var6) {
                    String var5;
                    if ((var5 = var8[var6]).startsWith("com.qk.plugin")) {
                        var2.d.add(var5);
                    }
                }
            } catch (IOException var10) {
                this.d = null;
            }
            var2 = this;
            try {
                if (var2.d != null && var2.d.size() > 0) {
                    Iterator var4 = var2.d.iterator();

                    while(var4.hasNext()) {
                        String var11 = (String)var4.next();
                        Log.d("channel.PM", "pluginName = " + var11);
                        Class var12;
                        Object var13 = (var12 = Class.forName(var11)).newInstance();
                        var12.getDeclaredMethod("registerPlugins", PluginManager.class).invoke(var13, a());
                    }
                } else {
                    Log.d("channel.PM", "no plugin");
                }
            } catch (Exception var9) {
            }
        }
    }

    public final void a(PluginNode node, Object... objs) {
        try {
            ArrayList pluginList;
            if ((pluginList = (ArrayList)this.c.get(node)) != null && pluginList.size() > 0) {
                Iterator var4 = pluginList.iterator();

                while(var4.hasNext()) {

                }

                return;
            }
        } catch (Exception var5) {
        }

    }

}
