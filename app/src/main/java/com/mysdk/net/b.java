package com.mysdk.net;

import android.os.Build;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b implements Serializable {
    private static final long a = 808018030183407996L;
    private static String b;
    private List<String> c = new ArrayList();
    private static final int d = 200;
    private static final int e = 304;
    private static final int f = 400;
    private static final int g = 401;
    private static final int h = 403;
    private static final int i = 404;
    private static final int j = 406;
    private static final int k = 500;
    private static final int l = 502;
    private static final int m = 503;
    private int n = 0;
    private int o = 200;
    private int p = 5000;
    private int q = 5000;
    private static boolean r;
    private String s = null;
    private Map<String, String> t = new HashMap();

    static {
        r = 1.5D > (double) Build.VERSION.SDK_INT;
    }

    public b() {
        String var3 = "gzip";
        String var2 = "Accept-Encoding";
        this.t.put(var2, var3);
        String className = this.getClass().getCanonicalName();
        b = "BaseLib " + className.substring(className.lastIndexOf(".") + 1, className.length());
    }
}