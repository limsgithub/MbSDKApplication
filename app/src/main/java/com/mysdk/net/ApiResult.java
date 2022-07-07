package com.mysdk.net;

import org.json.JSONException;
import org.json.JSONObject;

public class ApiResult <T> {
    private boolean result;
    private JSONObject error;
    private T data;

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public JSONObject getError() {
        return this.error;
    }

    public void setError(JSONObject error) {
        this.error = error;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResult() {
    }

    public ApiResult(boolean result, JSONObject error, T data) {
        this.result = result;
        this.error = error;
        this.data = data;
    }

    public ApiResult(JSONObject json) throws Exception {
        this.a(json);
    }

    private void a(JSONObject json) throws Exception {
        try {
            this.result = json.getBoolean("result");
            this.error = json.getJSONObject("error");


        } catch (JSONException var5) {
            throw new Exception(var5.getMessage() + ":" + json.toString(), var5);
        }
    }
}
