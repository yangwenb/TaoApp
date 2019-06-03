package com.yangwenb.taoappl.mine;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.base.BaseFragment;
import com.yangwenb.taoappl.mine.adapter.MineRecyAdapter;
import com.yangwenb.taoappl.mine.bean.MineRecyBean;
import com.yangwenb.taoappl.mine.tab.DingdanActivity;
import com.yangwenb.taoappl.mine.tab.FukuanActivity;
import com.yangwenb.taoappl.mine.tab.PinglunActivity;
import com.yangwenb.taoappl.mine.tab.ShouhouActivity;
import com.yangwenb.taoappl.mine.tab.ShouhuoActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends BaseFragment {


    private RecyclerView mime_rv;
    private TabLayout mine_tab;
    private TextView mine_tv_jifen;
    private TextView mine_tv_youhui;
    private TextView mine_tv_guanzhu;
    private TextView mine_tv_jifen_text;
    private TextView mine_tv_youhui_text;
    private TextView mine_tv_guanzhuw_text;
    private ImageView mine_tou_pic;
    private TextView mine_tv_name;
    private TextView mine_tv_vip;
    private ImageView mine_tou_jin;
    private ArrayList<MineRecyBean> mineRvList = new ArrayList<>();
    private int zijuShu;

    public MineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_mine, container, false);
        // Inflate the layout for this fragment
        initView(inflate);
        return inflate;
    }


    private void initView(View inflate) {
        mime_rv = (RecyclerView) inflate.findViewById(R.id.mime_rv);
        mine_tab = (TabLayout) inflate.findViewById(R.id.mine_tab);
        mine_tv_jifen = (TextView) inflate.findViewById(R.id.mine_tv_jifen);
        mine_tv_youhui = (TextView) inflate.findViewById(R.id.mine_tv_youhui);
        mine_tv_guanzhu = (TextView) inflate.findViewById(R.id.mine_tv_guanzhu);
        mine_tv_jifen_text = (TextView) inflate.findViewById(R.id.mine_tv_jifen_text);
        mine_tv_youhui_text = (TextView) inflate.findViewById(R.id.mine_tv_youhui_text);
        mine_tv_guanzhuw_text = (TextView) inflate.findViewById(R.id.mine_tv_guanzhuw_text);
        mine_tou_pic = (ImageView) inflate.findViewById(R.id.mine_tou_pic);
        mine_tv_name = (TextView) inflate.findViewById(R.id.mine_tv_name);
        mine_tv_vip = (TextView) inflate.findViewById(R.id.mine_tv_vip);
        mine_tou_jin = (ImageView) inflate.findViewById(R.id.mine_tou_jin);
        //设置recycleView
        initRecy();
        //设置tab栏
        initTab();
    }

    private void initTab() {
        //隐藏下划线
        mine_tab.setSelectedTabIndicator(0);
        //添加自定义tab栏
        mine_tab.addTab(mine_tab.newTab().setCustomView(R.layout.tab_mine_dindan));
        mine_tab.addTab(mine_tab.newTab().setCustomView(R.layout.tab_mine_fukuan));
        mine_tab.addTab(mine_tab.newTab().setCustomView(R.layout.tab_mine_shouhuo));
        mine_tab.addTab(mine_tab.newTab().setCustomView(R.layout.tab_mine_pinjia));
        mine_tab.addTab(mine_tab.newTab().setCustomView(R.layout.tab_mine_shouhou));
        //点击事件
        mine_tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    startActivity(new Intent(getContext(), DingdanActivity.class));
                } else if (position == 1) {
                    startActivity(new Intent(getContext(), FukuanActivity.class));
                } else if (position == 2) {
                    startActivity(new Intent(getContext(), ShouhuoActivity.class));
                } else if (position == 3) {
                    startActivity(new Intent(getContext(), PinglunActivity.class));
                } else if (position == 4) {
                    startActivity(new Intent(getContext(), ShouhouActivity.class));
                } else {
                    position = 0;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    startActivity(new Intent(getContext(), DingdanActivity.class));
                }
            }
        });
    }

    private void initRecy() {
        //加载数据
        inindata();
        //设置显示方式
        mime_rv.setLayoutManager(new LinearLayoutManager(getContext()));
        //设置适配器
        MineRecyAdapter mineRecyAdapter = new MineRecyAdapter(mineRvList);
        mime_rv.setAdapter(mineRecyAdapter);
    }

    private void inindata() {
        mineRvList = new ArrayList<>();
        if (zijuShu > 0) {
            mineRvList.add(new MineRecyBean(R.drawable.zuji, "我的足迹", String.valueOf(zijuShu)));
        } else {
            mineRvList.add(new MineRecyBean(R.drawable.zuji, "我的足迹", ""));
        }
        mineRvList.add(new MineRecyBean(R.drawable.ziwopingjia, "自我评价", ""));
        mineRvList.add(new MineRecyBean(R.drawable.dizhi, "地址管理", ""));
        String s = mine_tv_vip.getText().toString();
        if (s.isEmpty()) {
            mineRvList.add(new MineRecyBean(R.drawable.huiyuan, "会员中心", ""));
        } else {
            mineRvList.add(new MineRecyBean(R.drawable.huiyuan, "会员中心", s));
        }
        mineRvList.add(new MineRecyBean(R.drawable.kefu, "客服中心", ""));
        mineRvList.add(new MineRecyBean(R.drawable.shehzi, "系统设置", ""));
    }
}
