package com.yangwenb.taoappl.monogr;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonogerFragment extends BaseFragment {


    public MonogerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_monoger, container, false);
    }

}
