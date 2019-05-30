package com.yangwenb.taoappl.gou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yangwenb.taoappl.R;

public class GouwuActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar gou_tool;
    private RecyclerView gou_rv;
    private SmartRefreshLayout gou_sm;
    private CheckBox gou_ck_box;
    private TextView gou_zongjia;
    private Button gou_bt_jeisuan;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gouwu);
        initView();
    }

    private void initView() {
        gou_tool = (Toolbar) findViewById(R.id.toolbar);
        gou_rv = (RecyclerView) findViewById(R.id.gou_rv);
        gou_sm = (SmartRefreshLayout) findViewById(R.id.gou_sm);
        gou_ck_box = (CheckBox) findViewById(R.id.gou_ck_box);
        gou_zongjia = (TextView) findViewById(R.id.gou_zongjia);
        gou_bt_jeisuan = (Button) findViewById(R.id.gou_bt_jeisuan);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        //初始化Tool
        initTool();
        gou_bt_jeisuan.setOnClickListener(this);
    }

    //初始化Tool
    private void initTool() {
        gou_tool.setTitle("");
        setSupportActionBar(gou_tool);
        //设置返回图标
        gou_tool.setNavigationIcon(R.drawable.fanhui);
        //点击事件
        gou_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gou_bt_jeisuan:

                break;
        }
    }
}
