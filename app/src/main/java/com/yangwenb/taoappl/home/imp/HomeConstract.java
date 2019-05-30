package com.yangwenb.taoappl.home.imp;

import com.trello.rxlifecycle2.components.support.RxFragment;
import com.yangwenb.taoappl.base.BaseCallBack;
import com.yangwenb.taoappl.base.BasePresenter;
import com.yangwenb.taoappl.base.BaseView;
import com.yangwenb.taoappl.home.bean.HomeBannerBean;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public interface HomeConstract {
    //定义标题banner的view
    public interface HomeBiaoBanView extends BaseView<HomeBiaoBanPresenter> {
        void onBanSuccess(HomeBannerBean data);

        void onBanFail(String e);
    }

    public interface HomeBiaoBanPresenter extends BasePresenter<HomeBiaoBanView> {
        void getHomeBanJsonP();
    }

    public interface HomeBiaoRepostior {
        void getHomeBanJsonM(RxFragment rxFragment, BaseCallBack<HomeBannerBean> hBanCallBack);
    }
}
