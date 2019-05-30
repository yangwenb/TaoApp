package com.yangwenb.taoappl.youxuan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.gou.GouwuActivity;

public class YouxuanActivity extends AppCompatActivity {

    private Toolbar you_tool;
    private RecyclerView you_rv;
    private SmartRefreshLayout you_sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youxuan);
        initView();
    }

    private void initView() {
        you_tool = (Toolbar) findViewById(R.id.you_tool);
        you_rv = (RecyclerView) findViewById(R.id.you_rv);
        you_sm = (SmartRefreshLayout) findViewById(R.id.you_sm);

        //设置tool
        initTool();
    }

    //设置tool
    private void initTool() {
        you_tool.setTitle("");
        setSupportActionBar(you_tool);
        you_tool.setNavigationIcon(R.drawable.fanhui);
        you_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //选项菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_you_op, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.you_menu_gou:
                startActivity(new Intent(YouxuanActivity.this, GouwuActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
