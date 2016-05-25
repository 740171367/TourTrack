package com.st.www.tourtrack.world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.st.www.tourtrack.R;
import com.st.www.tourtrack.utils.ui.BaseFragment;

public class WorldFragment extends BaseFragment {
    private static WorldFragment instance;
    public static WorldFragment getInstance() {
        if (instance == null) {
            synchronized (WorldFragment.class) {
                if (instance == null) {
                    return new WorldFragment();
                } else {
                    return instance;
                }
            }
        } else {
            return instance;
        }

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_world_fragment;
    }
}
