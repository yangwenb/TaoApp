package com.yangwenb.taoappl.home;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.base.BaseFragment;
import com.yangwenb.taoappl.home.bean.HomeBannerBean;
import com.yangwenb.taoappl.home.imp.home_biao_banner.BannerUtil;
import com.yangwenb.taoappl.home.imp.HomeConstract;
import com.yangwenb.taoappl.home.imp.home_biao_banner.ImpHomeBanPresenter;
import com.yangwenb.taoappl.huati.HuatiActivity;
import com.yangwenb.taoappl.youxuan.YouxuanActivity;
import com.youth.banner.Banner;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements View.OnClickListener, HomeConstract.HomeBiaoBanView {


    private Banner home_banner;
    private ImageButton home_imbt_qiandao;
    private ImageButton home_imbt_huati;
    private ImageButton home_imbt_youxuan;
    private ImageButton home_imbt_tehui;
    private HomeConstract.HomeBiaoBanPresenter mPresenter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_homw, container, false);
        // Inflate the layout for this fragment
        initView(inflate);
        //数据加载
        initData();

        return inflate;
    }

    //数据加载
    private void initData() {
        //加载首页标题banner
        setPresenter(new ImpHomeBanPresenter());
        mPresenter.getHomeBanJsonP();

    }

    private void initView(View inflate) {
        home_banner = (Banner) inflate.findViewById(R.id.home_banner);
        home_imbt_qiandao = (ImageButton) inflate.findViewById(R.id.home_imbt_qiandao);
        home_imbt_huati = (ImageButton) inflate.findViewById(R.id.home_imbt_huati);
        home_imbt_youxuan = (ImageButton) inflate.findViewById(R.id.home_imbt_youxuan);
        home_imbt_tehui = (ImageButton) inflate.findViewById(R.id.home_imbt_tehui);

        home_imbt_qiandao.setOnClickListener(this);
        home_imbt_huati.setOnClickListener(this);
        home_imbt_youxuan.setOnClickListener(this);
        home_imbt_tehui.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_imbt_qiandao:

                break;
            case R.id.home_imbt_huati:
                startActivity(new Intent(getContext(), HuatiActivity.class));

                break;
            case R.id.home_imbt_youxuan:
                startActivity(new Intent(getContext(), YouxuanActivity.class));
                break;
            case R.id.home_imbt_tehui:

                break;
        }
    }

    @Override
    public void onBanSuccess(HomeBannerBean data) {
        if (data.getTopic() != null && data.getTopic().size() > 0) {
            //设置banner
            List<HomeBannerBean.TopicBean> topic = data.getTopic();
            BannerUtil bannerUtil = BannerUtil.getBannerUtil().setHomeBannerPic(topic, home_banner);
        }
    }

    @Override
    public void onBanFail(String e) {
        Log.d("HomeFragment", e);
    }

    @Override
    public void setPresenter(HomeConstract.HomeBiaoBanPresenter presenter) {
        mPresenter = presenter;
        mPresenter.attachView(this);
    }

    @Override
    public Context getContextObject() {
        return getContext();
    }
}
