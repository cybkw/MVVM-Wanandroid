package com.bkw.network.interceptor;


import com.bkw.network.base.INetworkRequiredInfo;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 请求头参数通用拦截器
 */
public class CommonRequestInterceptor implements Interceptor {
    private INetworkRequiredInfo requiredInfo;

    public CommonRequestInterceptor(INetworkRequiredInfo requiredInfo) {
        this.requiredInfo = requiredInfo;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        //builder.cacheControl(CacheControl.FORCE_CACHE);
        builder.addHeader("os", "android");
        builder.addHeader("appVersion", this.requiredInfo.getAppVersionCode());
        return chain.proceed(builder.build());
    }
}
