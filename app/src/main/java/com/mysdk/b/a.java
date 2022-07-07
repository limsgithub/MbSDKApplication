package com.mysdk.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.mysdk.utility.AppConfig;

public final class a extends BroadcastReceiver {
    public a(){

    }
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkInfo info;
            if ((info = ((ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo()) != null) {
                if (info.getType() == 1) {
                    AppConfig.getInstance().setNetType(1);
                    return;
                }

                String simOperator = ((TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE)).getSimOperator();
                switch(info.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        if ("46002".equals(simOperator) || "46000".equals(simOperator)) {
                            AppConfig.getInstance().setNetType(2);
                            return;
                        }

                        if ("46001".equals(simOperator)) {
                            AppConfig.getInstance().setNetType(5);
                            return;
                        }

                        if ("46003".equals(simOperator)) {
                            AppConfig.getInstance().setNetType(8);
                            return;
                        }
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        if (!"46002".equals(simOperator) && !"46000".equals(simOperator)) {
                            if ("46001".equals(simOperator)) {
                                AppConfig.getInstance().setNetType(6);
                                return;
                            }

                            if ("46003".equals(simOperator)) {
                                AppConfig.getInstance().setNetType(9);
                                return;
                            }
                            break;
                        }

                        AppConfig.getInstance().setNetType(3);
                        return;
                    case 13:
                        if ("46002".equals(simOperator) || "46000".equals(simOperator)) {
                            AppConfig.getInstance().setNetType(4);
                            return;
                        }

                        if ("46001".equals(simOperator)) {
                            AppConfig.getInstance().setNetType(7);
                            return;
                        }

                        if ("46003".equals(simOperator)) {
                            AppConfig.getInstance().setNetType(10);
                            return;
                        }
                        break;
                    default:
                        AppConfig.getInstance().setNetType(0);
                        return;
                }
            } else {
                AppConfig.getInstance().setNetType(-1);
            }
        }
    }
}
