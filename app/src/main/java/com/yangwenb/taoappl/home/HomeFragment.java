package com.yangwenb.taoappl.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.base.BaseFragment;
import com.youth.banner.Banner;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements View.OnClickListener {


    private Banner home_banner;
    private ImageButton home_imbt_qiandao;
    private ImageButton home_imbt_huati;
    private ImageButton home_imbt_youxuan;
    private ImageButton home_imbt_tehui;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_homw, container, false);
        // Inflate the layout for this fragment
        initView(inflate);

        return inflate;
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

                break;
            case R.id.home_imbt_youxuan:

                break;
            case R.id.home_imbt_tehui:

                break;
        }
    }
}
