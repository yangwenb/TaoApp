package com.yangwenb.taoappl.mine.tab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import com.yangwenb.taoappl.R;

public class DingdanActivity extends AppCompatActivity {

    private Toolbar mine_tab_din_tool;
    private TabLayout mine_tab_din_tab;
    private FrameLayout mine_tab_din_frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dingdan);
        initView();
    }

    private void initView() {
        mine_tab_din_tool = (Toolbar) findViewById(R.id.mine_tab_din_tool);
        mine_tab_din_tab = (TabLayout) findViewById(R.id.mine_tab_din_tab);
        mine_tab_din_frag = (FrameLayout) findViewById(R.id.mine_tab_din_frag);
        //设置tool
        initTool();
    }

    private void initTool() {
        mine_tab_din_tool.setTitle("");
        setSupportActionBar(mine_tab_din_tool);
        mine_tab_din_tool.setNavigationIcon(R.drawable.pic_mine_fanhui);
        mine_tab_din_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
