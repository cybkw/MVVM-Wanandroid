package com.bkw.network.environment;

/**
 * 开发环境切换接口
 */
public interface IEnvironment {
    /**
     * @return 正式环境
     */
    String getFormal();

    /**
     * @return 开发环境
     */
    String getTest();
}
