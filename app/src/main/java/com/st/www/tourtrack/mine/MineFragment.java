package com.st.www.tourtrack.mine;

import com.st.www.tourtrack.R;
import com.st.www.tourtrack.utils.ui.BaseFragment;

public class MineFragment extends BaseFragment {
    private static MineFragment instance;
    public static MineFragment getInstance() {
        if (instance == null) {
            synchronized (MineFragment.class) {
                if (instance == null) {
                    return new MineFragment();
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
        return R.layout.activity_mine_fragment;
    }
}
