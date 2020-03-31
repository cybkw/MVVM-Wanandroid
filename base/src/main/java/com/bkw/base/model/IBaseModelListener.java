package com.bkw.base.model;

/**
 * Model基类回调接口
 *
 * @param <T>
 */
public interface IBaseModelListener<T> {
    void onLoadFinish(MvvmBaseModel model, T data, PagingResult... pageResult);

    void onLoadFail(MvvmBaseModel model, String prompt, PagingResult... pageResult);
}