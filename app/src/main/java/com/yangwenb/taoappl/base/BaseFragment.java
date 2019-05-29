package com.yangwenb.taoappl.base;

import android.app.Activity;

import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.text.TextUtils;

import com.trello.rxlifecycle2.components.support.RxFragment;

/*
 * created by taofu on 2019/5/5
 **/
public class BaseFragment extends RxFragment {

    private BaseActivity mBaseActivity;

    private String mTag;


    public boolean isNeedAnimation() {
        return true;
    }

    protected boolean isNeedToAddBackStack() {
        return true;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BaseActivity) {
            mBaseActivity = (BaseActivity) activity;
        }
    }


    protected void addFragment(FragmentManager manager, Class<? extends BaseFragment> aClass, int containerId, Bundle args) {
        if (mBaseActivity != null) {
            mBaseActivity.addFragment(manager, aClass, containerId, args);
        }
    }


    protected String getTAG() {

        if (TextUtils.isEmpty(mTag)) {
            mTag = getClass().getSimpleName();
        }

        return mTag;
    }


}
