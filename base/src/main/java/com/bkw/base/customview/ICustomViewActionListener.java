package com.bkw.base.customview;

import android.view.View;

/**
 * 列表Item点击事件回调
 */
public interface ICustomViewActionListener {
    String ACTION_ROOT_VIEW_CLICKED = "action_root_view_clicked";

    void onAction(String action, View view, BaseCustomViewModel viewModel);
}
