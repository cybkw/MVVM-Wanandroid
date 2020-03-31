package com.bkw.base.model;

/**
 * 数据结果是否存在分页
 */
public class PagingResult {
    public PagingResult(boolean isEmpty, boolean isFirstPage, boolean hasNextPage) {
        this.isEmpty = isEmpty;
        this.isFirstPage = isFirstPage;
        this.hasNextPage = hasNextPage;
    }

    public boolean isFirstPage;
    public boolean isEmpty;
    public boolean hasNextPage;
}
