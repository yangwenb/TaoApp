package com.yangwenb.taoappl.home.imp.home_biao_banner;

import com.trello.rxlifecycle2.components.support.RxFragment;
import com.yangwenb.taoappl.base.BaseCallBack;
import com.yangwenb.taoappl.home.bean.HomeBannerBean;
import com.yangwenb.taoappl.home.imp.HomeConstract;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class ImpHomeBanPresenter implements HomeConstract.HomeBiaoBanPresenter {

    private HomeConstract.HomeBiaoRepostior mRepostior;
    private HomeConstract.HomeBiaoBanView mView;

    public ImpHomeBanPresenter() {
        this.mRepostior = new ImpHomeBanRepositor();
    }

    @Override
    public void getHomeBanJsonP() {
        if (mRepostior != null) {
            mRepostior.getHomeBanJsonM((RxFragment) mView, new BaseCallBack<HomeBannerBean>() {
                @Override
                public void onSuccess(HomeBannerBean data) {
                    if (mView != null) {
                        mView.onBanSuccess(data);
                    }
                }

                @Override
                public void onFail(String e) {
                    if (mView != null) {
                        mView.onBanFail(e);
                    }
                }
            });
        }
    }

    @Override
    public void attachView(HomeConstract.HomeBiaoBanView view) {
        mView = view;
    }

    @Override
    public void detachView(HomeConstract.HomeBiaoBanView view) {
        mView = null;
    }
}
