package com.bkw.network.base;

import android.app.Application;

/**
 * 网络客户端需求辅助接口
 */
public interface INetworkRequiredInfo {
    /**
     * @return 返回当前APP版本 名称
     */
    String getAppVersionName();

    /**
     * @return 返回当前app版本号
     */
    String getAppVersionCode();

    /**
     * @return 当前开发环境
     */
    boolean isDebug();

    /**
     * @return 全局App context
     */
    Application getApplicationContext();
}
