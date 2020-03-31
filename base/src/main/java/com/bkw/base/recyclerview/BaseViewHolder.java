package com.bkw.base.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bkw.base.customview.BaseCustomViewModel;
import com.bkw.base.customview.ICustomView;


/**
 * RecyclerView  ViewHolder基类
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    ICustomView view;

    public BaseViewHolder(ICustomView view) {
        super((View) view);
        this.view = view;
    }

    public void bind(@NonNull BaseCustomViewModel item) {
        view.setData(item);
    }
}