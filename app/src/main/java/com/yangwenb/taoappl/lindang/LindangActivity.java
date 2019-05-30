package com.yangwenb.taoappl.lindang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yangwenb.taoappl.R;

public class LindangActivity extends AppCompatActivity {

    private Toolbar lin_tool;
    private RecyclerView lin_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lindang);
        initView();
    }

    private void initView() {
        lin_tool = (Toolbar) findViewById(R.id.lin_tool);
        lin_rv = (RecyclerView) findViewById(R.id.lin_rv);

        //设置tool
        initTool();
    }

    //设置tool
    private void initTool() {
        lin_tool.setTitle("");
        setSupportActionBar(lin_tool);
        lin_tool.setNavigationIcon(R.drawable.fanhui);
        lin_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
