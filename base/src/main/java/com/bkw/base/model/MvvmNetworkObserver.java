package com.bkw.base.model;

/**
 * 网络数据观察者接口
 *
 * @param <F>
 */
public interface MvvmNetworkObserver<F> {
    void onSuccess(F t, boolean isFromCache);

    void onFailure(Throwable e);
}
