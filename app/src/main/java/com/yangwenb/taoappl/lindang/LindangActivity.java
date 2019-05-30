package com.yangwenb.taoappl.lindang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.lindang.adapter.LinRecAdapter;
import com.yangwenb.taoappl.lindang.bean.LinRecyBean;

import java.util.ArrayList;

public class LindangActivity extends AppCompatActivity {

    private Toolbar lin_tool;
    private RecyclerView lin_rv;
    private ArrayList<LinRecyBean> mRecyBeans = new ArrayList<>();

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
        //设置列表
        initRecy();
    }

    //设置列表
    private void initRecy() {
        //添加集合数据
        ininData();
        //设置列表
        lin_rv.setLayoutManager(new LinearLayoutManager(LindangActivity.this));
        //设置适配器
        LinRecAdapter linRecAdapter = new LinRecAdapter(mRecyBeans);
        lin_rv.setAdapter(linRecAdapter);
    }

    //添加集合数据
    private void ininData() {
        mRecyBeans = new ArrayList<>();
        mRecyBeans.add(new LinRecyBean(R.drawable.kefu, "在线客服", "查看与客服的沟通记录"));
        mRecyBeans.add(new LinRecyBean(R.drawable.huod, "活动消息", "您的地球日福利来了"));
        mRecyBeans.add(new LinRecyBean(R.drawable.fuwu, "服务消息", "您有一张优惠卷到账"));
        mRecyBeans.add(new LinRecyBean(R.drawable.xit, "系统消息", "秒杀专区下线公告"));
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
