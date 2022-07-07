package com.mysdk.net;

import android.content.Context;
import com.mysdk.entity.GameRoleInfo;
import com.mysdk.entity.OrderInfo;
import com.mysdk.utility.AppConfig;
import com.mysdk.net.b;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public final class a {
        protected b a = new b();
        private List<String> c = new ArrayList();

        public a() {
        }

        public final void a(Context context, String eventCode, String result, String params) throws Exception {
            String productCode = AppConfig.getInstance().getProductCode();
            String postUrl;

        }

        public final void a() {
            this.c.clear();
            this.c.addAll(AppConfig.getInstance().getAPIServers());
        }

        public final ApiResult<JSONObject> a(Context ctx) throws Exception {
            return null;
        }

        public final ApiResult<JSONObject> b(Context ctx, String uid, String userName, String token) throws Exception {

            return null;
        }

        public final ApiResult<JSONObject> a(Context ctx, String uid, String userName, String token, GameRoleInfo roleInfo) throws Exception {


            return null;
        }

        public final ApiResult<JSONObject> a(Context ctx, String uid, String userName, String token, OrderInfo orderInfo, GameRoleInfo roleInfo, String payParams) throws Exception {




            return null;
        }

        public final ApiResult<JSONObject> a(Context ctx, String openId, String openKey, String payToken, String appId, String ts, String pf, String pfKey, String zoneId, String usertype) throws Exception {

            return null;
        }

        public final ApiResult<JSONObject> a(Context ctx, String orderId, String openId, String openKey, String pf, String pfKey, String zoneId, String usertype) throws Exception {

            return null;
        }

        public final ApiResult<JSONObject> a(Context ctx, String uid, String userName, String roleName, String eType, String eTrace, String eNum, String crashNode, String isCrash) throws Exception {


            return null;
        }

        public final ApiResult<JSONObject> b(Context ctx) throws Exception {


            return null;
        }

        public final ApiResult<JSONObject> a(Context ctx, String userId, String gameRoleId) throws Exception {
            return null;
        }

        public final ApiResult<JSONObject> c(Context ctx) throws Exception {

            return null;
        }

        public final ApiResult<JSONObject> c(Context ctx, String uid, String platformUid, String platform) throws Exception {
            return null;
        }
}
