package com.mysdk.net;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.mysdk.Sdk;
import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.OrderInfo;
import com.mysdk.entity.UserInfo;
import com.mysdk.notifier.ILoginNotifier;
import com.mysdk.notifier.IPayNotifier;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Connect {
    private static String a;
    private static Connect b = null;
    private a c = new a();


    @SuppressLint({"HandlerLeak"})
    private Handler l = new Handler() {
        public final void handleMessage(Message msg) {
            HashMap map;
            IPayNotifier notifier;
            String cpOrderID;
            String error;
            String trace;
            ILoginNotifier notifierx;
            switch(msg.what) {
                case 3:
                    try {
                        notifierx = (ILoginNotifier)(map = (HashMap)msg.obj).get("notifier");
                        UserInfo userInfo = (UserInfo)map.get("userInfo");
                        notifierx.onSuccess(userInfo);
                        return;
                    } catch (Exception var13) {
                        return;
                    }
                case 4:
                    try {
                        notifierx = (ILoginNotifier)(map = (HashMap)msg.obj).get("notifier");
                        cpOrderID = (String)map.get("error");
                        error = (String)map.get("trace");
                        notifierx.onFailed(cpOrderID, error);
                        return;
                    } catch (Exception var12) {
                        return;
                    }
                case 5:
                    try {
                        notifier = (IPayNotifier)(map = (HashMap)msg.obj).get("notifier");
                        cpOrderID = (String)map.get("sdkOrderID");
                        error = (String)map.get("cpOrderID");
                        trace = (String)map.get("extrasParams");
                        notifier.onSuccess(cpOrderID, error, trace);
                        return;
                    } catch (Exception var11) {
                        return;
                    }
                case 6:
                    try {
                        notifier = (IPayNotifier)(map = (HashMap)msg.obj).get("notifier");
                        cpOrderID = (String)map.get("cpOrderID");
                        error = (String)map.get("error");
                        trace = (String)map.get("trace");
                        notifier.onFailed(cpOrderID, error, trace);
                        return;
                    } catch (Exception var10) {
                        return;
                    }
                case 7:
                    try {
                        return;
                    } catch (Exception var9) {
                        return;
                    }
                case 8:
                case 9:
                case 10:
                    try {
                        return;
                    } catch (Exception var14) {
                    }
                default:
            }
        }
    };

    private Connect() {
        String className = this.getClass().getCanonicalName();
        a = "BaseLib " + className.substring(className.lastIndexOf(".") + 1, className.length());
    }

    public static Connect getInstance() {
        if (b == null) {
            b = new Connect();
        }
        return b;
    }

    public final void a(final Context ctx) {
        Runnable task = new Runnable() {
            public final void run() {
                try {
                    Connect.this.c.a();
                } catch (Exception var9) {

                } finally {
                }

            }
        };
    }

    public void login(final Context ctx, final UserInfo userInfo, final ILoginNotifier notifier) {
        Runnable task = new Runnable() {
            public final void run() {
                try {
                    return;
                } catch (Exception var11) {
                    Log.e(Connect.a, "login request failed, Exception = " + var11.getMessage());

                } finally {

                }

            }
        };
    }

    public final void a(final Context ctx, final String uid, final String userName, final String token, final GameRoleInfo roleInfo) {
        Runnable task = new Runnable() {
            public final void run() {
                try {
                    return;
                } catch (Exception var7) {
                    Log.e(Connect.a, "ug Exception = " + var7.getMessage());
                } finally {
                }

            }
        };
    }

    public final void a(final Context ctx, final String uid, final String userName, final String token, final OrderInfo orderInfo,
                        final GameRoleInfo roleInfo, final String payParams, final IPayNotifier notifier) {
        Runnable task = new Runnable() {
            public final void run() {
                try {
                    if (notifier != null) {
                        String sdkOrderID;
                            Log.e(Connect.a, "p failed, code = , error = ");
                            return;
                    }
                    return;
                } catch (Exception var13) {
                    Log.e(Connect.a, "p Exception = " + var13.getMessage());
                } finally {
                }
            }
        };
        this.l.sendEmptyMessage(9);
        BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque();
         ThreadPoolExecutor e =new ThreadPoolExecutor(5, 8, 0L, TimeUnit.SECONDS, workQueue);
         e.execute(task);
    }

    public ApiResult<JSONObject> checkCoins(Context ctx, String openId, String openKey, String payToken, String appId, String ts,
                                            String pf, String pfKey, String zoneId, String usertype) throws Exception {
        return null;
    }

    public ApiResult<JSONObject> tencentPay(Context ctx, String orderId, String openId, String openKey, String pf, String pfKey, String zoneId,
                                            String usertype) throws Exception {
        return null;
    }

    public final void a(final Context ctx, final String uid, final String userName, final String roleName, final String eType,
                        final String eTrace, final String eNum, final String crashNode, final String isCrash) {
        Runnable task = new Runnable() {
            public final void run() {
                HashMap map;
                Message msg;
                try {

                } catch (Exception var4) {

                }
            }
        };
    }

    public final void a(final Context ctx, final Handler updateHandler) {
        Runnable task = new Runnable() {
            public final void run() {
                try {
                    ApiResult result;

                    String error = "未知错误";
                    String code = "-1";

                    Log.e(Connect.a, "cv failed, code = " + code + ", error = " + error);
                    return;

                } catch (Exception var15) {
                    Log.e(Connect.a, "cv Exception = " + var15.getMessage());
                } finally {
                }

            }
        };
    }

    public void getGameRoleData(final Context ctx, final String userId, final String gameRoleId, final Handler handler) {
        Runnable task = new Runnable() {
            public final void run() {
                try {
                    ApiResult result;
                    Message msgxx;
                    Bundle bundle = new Bundle();
                    try {
                        JSONObject json;

                    } catch (Exception var6) {
                        Log.e(Connect.a, "ggri failed analyse json Exception = " + var6.getMessage());
                        (msgxx = handler.obtainMessage()).what = 0;
                        handler.sendMessage(msgxx);
                        return;
                    }

                    Message msg;
                    (msg = handler.obtainMessage()).setData(bundle);
                    msg.what = 1;
                    handler.sendMessage(msg);

                } catch (Exception var7) {
                    Log.e(Connect.a, "ggri Exception = " + var7.getMessage());
                }
            }
        };
    }

    public void getDeviceUsers(final Context ctx, final Handler handler) {
        Runnable task = new Runnable() {
            public final void run() {
                try {
                    ApiResult result;
                    String code;
                    Message msgxx;

                } catch (Exception var6) {

                }
            }
        };
    }

    public void bindPlatformUser(final Context ctx, final String uid, final String platformUid, final String platform) {
        Runnable task = new Runnable() {
            public final void run() {
                try {

                } catch (Exception var2) {
                    Log.e(Connect.a, "bp Exception = " + var2.getMessage());
                }
            }
        };
    }

    public final void a(final Context ctx, final String eventCode, final String result, final String params) {
        Runnable task = new Runnable() {
            public final void run() {
                try {

                } catch (Exception var2) {
                    Log.e(Connect.a, "ck Exception = " + var2.getMessage());
                }
            }
        };
    }
}
