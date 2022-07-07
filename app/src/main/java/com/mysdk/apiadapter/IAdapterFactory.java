package com.mysdk.apiadapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public interface IAdapterFactory {
    IActivityAdapter adtActivity();

    IExtendAdapter adtExtend();

    IPayAdapter adtPay();

    ISdkAdapter adtSdk();

    IUserAdapter adtUser();
}
