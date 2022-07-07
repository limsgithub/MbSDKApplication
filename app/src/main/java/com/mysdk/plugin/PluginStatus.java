package com.mysdk.plugin;

public enum PluginStatus {
    ONAPPLICATION_ONCREATE,
    INIT_SUCCESS,
    INIT_FAILED,
    LOGIN_SUCCESS,
    LOGIN_CANCEL,
    LOGIN_FAILED,
    LOGOUT_SUCCESS,
    LOGOUT_FAILED,
    PAY_SUCCESS,
    PAY_CANCEL,
    PAY_FAILED,
    EXIT_SUCCESS,
    EXIT_FAILED;

    private PluginStatus() {
    }
}
