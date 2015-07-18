package com.quinn.githubknife.ui.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quinn.githubknife.R;
import com.quinn.githubknife.utils.L;

/**
 * Created by Quinn on 7/15/15.
 */
public class FollowingFragment extends Fragment {


    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.i("onCreate FollowingFragment");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends, container, false);
        //ButterKnife.inject(this, view);
        L.i("onCreateView FollowingFragment");

        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        L.i("onResume FollowingFragment");

    }

}