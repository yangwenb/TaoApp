package com.yangwenb.taoappl.home.imp.home_biao_banner;

import com.trello.rxlifecycle2.android.FragmentEvent;
import com.trello.rxlifecycle2.components.support.RxFragment;
import com.yangwenb.taoappl.base.BaseCallBack;
import com.yangwenb.taoappl.base.remote.OkhttpRetro;
import com.yangwenb.taoappl.base.remote.TaoUrlPath;
import com.yangwenb.taoappl.home.bean.HomeBannerBean;
import com.yangwenb.taoappl.home.imp.HomeConstract;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class ImpHomeBanRepositor implements HomeConstract.HomeBiaoRepostior {
    @Override
    public void getHomeBanJsonM(RxFragment rxFragment, final BaseCallBack<HomeBannerBean> hBanCallBack) {
        OkhttpRetro.getTaoService(TaoUrlPath.HomeBanUrl).getBanJson()
                .flatMap(new Function<HomeBannerBean, ObservableSource<HomeBannerBean>>() {
                    @Override
                    public ObservableSource<HomeBannerBean> apply(HomeBannerBean homeBannerBean) throws Exception {
                        if (homeBannerBean.getCode() == 200) {
                            return Observable.just(homeBannerBean);
                        } else {
                            return Observable.error(new NullPointerException("返回数据为空异常"));
                        }
                    }
                }).subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .compose(rxFragment.<HomeBannerBean>bindUntilEvent(FragmentEvent.DESTROY))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeBannerBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBannerBean homeBannerBean) {
                        if (homeBannerBean != null && homeBannerBean.getTopic().size() > 0) {
                            hBanCallBack.onSuccess(homeBannerBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        hBanCallBack.onFail(e.getMessage() + "网络错误");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
