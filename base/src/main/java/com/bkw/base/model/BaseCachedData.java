package com.bkw.base.model;

import java.io.Serializable;

/**
 * 预制或缓存数据
 *
 * @param <T>
 */
public class BaseCachedData<T> implements Serializable {
    public long updateTimeInMills;
    public T data;
}
