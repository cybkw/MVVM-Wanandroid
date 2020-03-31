package com.bkw.cysample.application;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bkw.base.loadsir.CustomCallback;
import com.bkw.base.loadsir.EmptyCallback;
import com.bkw.base.loadsir.ErrorCallback;
import com.bkw.base.loadsir.LoadingCallback;
import com.bkw.base.loadsir.TimeoutCallback;
import com.bkw.base.preference.PreferencesUtil;
import com.bkw.base.utils.ToastUtil;
import com.bkw.network.base.NetworkApi;
import com.kingja.loadsir.core.LoadSir;

/**
 * Appliaction
 */
public class WanandroidApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化首选项工具
        PreferencesUtil.init(this);
        NetworkApi.init(new NetworkRequestInfo(this));
        ToastUtil.init(this);

        //阿里路由框架
        ARouter.init(this);
        ARouter.openDebug();
        ARouter.openLog();

        LoadSir.beginBuilder()
                .addCallback(new ErrorCallback())//添加各种状态页
                .addCallback(new EmptyCallback())
                .addCallback(new LoadingCallback())
                .addCallback(new TimeoutCallback())
                .addCallback(new CustomCallback())
                .setDefaultCallback(LoadingCallback.class)//设置默认状态页
                .commit();
    }
}
