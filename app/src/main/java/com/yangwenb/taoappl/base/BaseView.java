package com.yangwenb.taoappl.base;

import android.content.Context;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);

    Context getContextObject();
}
