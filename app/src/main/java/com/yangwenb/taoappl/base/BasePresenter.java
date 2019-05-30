package com.yangwenb.taoappl.base;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public interface BasePresenter<T extends BaseView> {
    void attachView(T view);

    void detachView(T view);
}
