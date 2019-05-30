package com.yangwenb.taoappl.home.imp.home_biao_banner;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yangwenb.taoappl.home.bean.HomeBannerBean;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.List;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class BannerUtil {

    private static volatile BannerUtil sBannerUtil;

    private BannerUtil() {
    }

    public static BannerUtil getBannerUtil() {
        if (sBannerUtil == null) {
            synchronized (BannerUtil.class) {
                if (sBannerUtil == null) {
                    sBannerUtil = new BannerUtil();
                }
            }
        }
        return sBannerUtil;
    }

    public static BannerUtil setHomeBannerPic(List<HomeBannerBean.TopicBean> list, Banner banner) {
        if (list != null && list.size() > 0) {
           banner.setIndicatorGravity(BannerConfig.NUM_INDICATOR);
            //设置banner图片
            banner.setBannerAnimation(Transformer.ForegroundToBackground);
            banner.setImages(list);
            banner.setImageLoader(new JiaZaiPic());
            banner.start();
        }
        return null;
    }

    static class JiaZaiPic extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            HomeBannerBean.TopicBean tpo = (HomeBannerBean.TopicBean) path;
            String image = tpo.getImage();
            Glide.with(imageView.getContext()).load(image).into(imageView);
        }
    }
}
