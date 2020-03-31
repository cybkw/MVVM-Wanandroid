package com.bkw.cysample.application;


import android.app.Application;

import com.bkw.cysample.BuildConfig;
import com.bkw.network.base.INetworkRequiredInfo;


/**
 * 获取app环境信息
 */
public class NetworkRequestInfo implements INetworkRequiredInfo {
    private Application mApplication;

    public NetworkRequestInfo(Application application) {
        this.mApplication = application;
    }

    @Override
    public String getAppVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    @Override
    public String getAppVersionCode() {
        return String.valueOf(BuildConfig.VERSION_CODE);
    }

    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    @Override
    public Application getApplicationContext() {
        return mApplication;
    }

}
