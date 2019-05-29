package com.yangwenb.taoappl.lindang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

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
    }
}
