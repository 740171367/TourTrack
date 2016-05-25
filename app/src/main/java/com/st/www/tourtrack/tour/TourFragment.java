package com.st.www.tourtrack.tour;

import com.st.www.tourtrack.R;
import com.st.www.tourtrack.utils.ui.BaseFragment;

public class TourFragment extends BaseFragment{
    private static TourFragment instance;
    public static TourFragment getInstance() {
        if (instance == null) {
            synchronized (TourFragment.class) {
                if (instance == null) {
                    return new TourFragment();
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
        return R.layout.activity_tour_fragment;
    }
}
