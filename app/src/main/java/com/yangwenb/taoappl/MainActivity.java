package com.yangwenb.taoappl;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.yangwenb.taoappl.base.BaseActivity;
import com.yangwenb.taoappl.gou.GouwuActivity;
import com.yangwenb.taoappl.home.HomeFragment;
import com.yangwenb.taoappl.lindang.LindangActivity;
import com.yangwenb.taoappl.mine.MineFragment;
import com.yangwenb.taoappl.monogr.MonogerFragment;
import com.yangwenb.taoappl.seek.SeekActivity;
import com.yangwenb.taoappl.sunject.SunjectFragment;

public class MainActivity extends BaseActivity {

    private Toolbar main_tool;
    private FrameLayout main_frag;
    private TabLayout main_tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        main_tool = (Toolbar) findViewById(R.id.main_tool);
        main_frag = (FrameLayout) findViewById(R.id.main_frag);
        main_tab = (TabLayout) findViewById(R.id.main_tab);
        //初始化tool,fragmnet
        initTool();
        //设置tab自定义栏
        initTab();
    }

    private void initTab() {
        main_tab.setSelectedTabIndicator(0);
        //添加自定义tab栏
        main_tab.addTab(main_tab.newTab().setCustomView(R.layout.tab_home));
        main_tab.addTab(main_tab.newTab().setCustomView(R.layout.tab_monogr));
        main_tab.addTab(main_tab.newTab().setCustomView(R.layout.tab_sonject));
        main_tab.addTab(main_tab.newTab().setCustomView(R.layout.tab_mine));
        //设置切换
        main_tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //获取下标
                int position = tab.getPosition();
                if (position == 0) {
                    addFragment(getSupportFragmentManager(), HomeFragment.class, R.id.main_frag, null);
                } else if (position == 1) {
                    addFragment(getSupportFragmentManager(), MonogerFragment.class, R.id.main_frag, null);
                } else if (position == 2) {
                    addFragment(getSupportFragmentManager(), SunjectFragment.class, R.id.main_frag, null);
                } else if (position == 3) {
                    addFragment(getSupportFragmentManager(), MineFragment.class, R.id.main_frag, null);
                } else {
                    position = 0;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    //初始化tool
    private void initTool() {
        //设置Tool标题
        main_tool.setTitle("");
        setSupportActionBar(main_tool);
        //设置侧滑图标
        main_tool.setNavigationIcon(R.drawable.lindang);
        //点击事件
        main_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LindangActivity.class));
            }
        });

        //添加初始显示fragmnet
        addFragment(getSupportFragmentManager(), HomeFragment.class, R.id.main_frag, null);
    }

    //添加选项菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //选项菜单点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main_seek:
                startActivity(new Intent(MainActivity.this, SeekActivity.class));
                break;
            case R.id.menu_main_gouwu:
                startActivity(new Intent(MainActivity.this, GouwuActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
