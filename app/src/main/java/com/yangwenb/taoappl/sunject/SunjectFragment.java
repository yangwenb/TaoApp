package com.yangwenb.taoappl.sunject;


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
public class SunjectFragment extends BaseFragment {


    public SunjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sunject, container, false);
    }

}
