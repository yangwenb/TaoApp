package com.yangwenb.taoappl.base;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public interface BaseCallBack<T> {
    void onSuccess(T data);

    void onFail(String e);
}
