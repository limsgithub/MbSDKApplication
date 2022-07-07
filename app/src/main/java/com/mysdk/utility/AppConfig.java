package com.mysdk.utility;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppConfig {
    private static final String c = "AppConfig";
    private static AppConfig d = null;
    private Context e;
    private boolean f = false;
    private boolean g = false;
    private int h = 0;
    private int i = 0;
    private String j = "0";
    private String k = "0";
    private String l = "";
    private String m = "";
    private String n = "1.0.1";
    private String o = "0.0.1";
    private String p = "";
    private int q = 0;
    private String r = "1";
    private String s = "";
    private String t = "游戏还未正式开服，请关注游戏官网了解开服详情";
    private Boolean u = false;
    public HashMap<String, String> a = new HashMap();
    public HashMap<String, List<String>> b = new HashMap();

    public AppConfig() {
    }
    public static AppConfig getInstance() {
        if (d == null) {
            d = new AppConfig();
        }
        return d;
    }

    public void init(Context ctx) {
        this.e = ctx;
        AppConfig var2 = this;

        this.j = this.getConfigValue("check_version").trim();
        this.k = this.getConfigValue("uid_prefix").trim();
        this.k = this.k.equalsIgnoreCase("0") ? "" : this.k;

    }

    private void a() {
        String configProductCode;
        if (!TextUtils.isEmpty(configProductCode = this.getConfigValue("product_code").trim())) {
            this.l = configProductCode;
        }
        String configProductKey;
        if (!TextUtils.isEmpty(configProductKey = this.getConfigValue("product_key").trim())) {
            this.m = configProductKey;
        }


    }

    public void setIsLandScape(boolean isLandScape) {
        this.f = isLandScape;
    }

    public boolean isLandScape() {
        return this.f;
    }

    public void setDebugMode(boolean debugMode) {
        this.g = debugMode;
    }

    public boolean getDebugMode() {
        return this.g;
    }


    public int getNetType() {
        return this.h;
    }

    public void setNetType(int netType) {
        this.h = netType;
    }

    ///ProductCode
    public void setProductCode(String productCode) {
        this.l = productCode;
    }

    public String getProductCode() {
        return this.l;
    }

    ///Product Key
    public String getProductKey() {
        return this.m;
    }

    public void setProductKey(String productKey) {
        this.m = productKey;
    }

    public String getSdkVersion() {
        return this.n;
    }

    public void setSdkVersion(String sdkVersion) {
        this.n = sdkVersion;
    }

    public String getSdkSubVersion() {
        return this.o;
    }

    public void setSdkSubVersion(String sdkSubVersion) {
        this.o = sdkSubVersion;
    }

    public String getChannelSdkVersion() {
        return this.p;
    }

    public void setChannelSdkVersion(String channelSdkVersion) {
        this.p = channelSdkVersion;
    }

    public String getSessionID() {
        return this.r;
    }

    public int getProductVersionCode() {
        return this.q;
    }

    public int getChannelType() {
        return this.i;
    }

    public Boolean isCheckVersion() {
        return "1".equals(this.j);
    }

    public String getUidPrefix() {
        return this.k;
    }

    public String getServerIPConfigURL() {
        return this.s;
    }

    public String getColseServerMsg() {
        return this.t;
    }

    public void setCloseServerMsg(String colseServerMsg) {
        this.t = colseServerMsg;
    }

    public Boolean getIsCloseServer() {
        return this.u;
    }

    public void setIsCloseServer(Boolean isCloseServer) {
        this.u = isCloseServer;
    }

    public String getConfigValue(String configKey) {
        if (configKey == null) {
            return "AppConfig" + configKey + "参数不存在";
        } else {
            return (String) this.a.get("configKey");
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setShowExistDialog(boolean dialogShow) {
    }

    /**
     * @deprecated
     */
    @Deprecated
    public boolean isShowExistDialog() {
        return false;
    }

    public List<String> getAPIServers() {

        String serverHost = "sdk.diopoo.com";
        String serverIp = "47.96.126.86";

        List<String> list = new ArrayList();
        if (!((List) list).contains(serverHost)) {
            ((List) list).add(serverHost);
        }
        if (!((List) list).contains(serverIp)) {
            ((List) list).add(serverIp);
        }
        return (List) list;
    }

    public void addConfigValue(String key, String value) {
        if (this.a.containsKey(key)) {
            this.a.remove(key);
        }
        this.a.put(key, value);
    }

    public void addConfigArrays(String key, List<String> arrays) {
        if (this.b.containsKey(key)) {
            this.b.remove(key);
        }
        this.b.put(key, arrays);
    }

}