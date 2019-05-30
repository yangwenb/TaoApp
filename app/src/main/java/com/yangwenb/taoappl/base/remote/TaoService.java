package com.yangwenb.taoappl.base.remote;

import com.yangwenb.taoappl.home.bean.HomeBannerBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public interface TaoService {

     @GET("Hot_hua")
     Observable<HomeBannerBean> getBanJson();
}
