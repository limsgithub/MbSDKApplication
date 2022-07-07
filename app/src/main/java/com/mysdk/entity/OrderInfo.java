package com.mysdk.entity;

public class OrderInfo {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private double f;
    private int g;
    private double h;
    private String i;
    private String j;
    private String k;

    public OrderInfo() {
    }

    public String getGoodsID() {
        return this.a;
    }

    public void setGoodsID(String goodsID) {
        this.a = goodsID;
    }

    public String getGoodsName() {
        return this.b;
    }

    public void setGoodsName(String goodsName) {
        this.b = goodsName;
    }

    public String getGoodsDesc() {
        return this.c;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.c = goodsDesc;
    }

    public String getCpOrderID() {
        return this.e;
    }

    public void setCpOrderID(String cpOrderID) {
        this.e = cpOrderID;
    }

    public double getPrice() {
        return this.f;
    }

    public void setPrice(double price) {
        this.f = price;
    }

    public int getCount() {
        return this.g;
    }

    public void setCount(int count) {
        this.g = count;
    }

    public double getAmount() {
        return this.h;
    }

    public void setAmount(double amount) {
        this.h = amount;
    }

    public String getCallbackUrl() {
        return this.i;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.i = callbackUrl;
    }

    public String getExtrasParams() {
        return this.j;
    }

    public void setExtrasParams(String extrasParams) {
        this.j = extrasParams;
    }

    public String getQuantifier() {
        return this.d;
    }

    public void setQuantifier(String quantifier) {
        this.d = quantifier;
    }

    public String getExternalParams() {
        return this.k;
    }

    public void setExternalParams(String externalParams) {
        this.k = externalParams;
    }
}


