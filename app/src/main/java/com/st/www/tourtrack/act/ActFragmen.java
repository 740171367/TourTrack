package com.st.www.tourtrack.act;

import com.st.www.tourtrack.R;
import com.st.www.tourtrack.utils.ui.BaseFragment;

public class ActFragmen extends BaseFragment {
    private static ActFragmen instance;
    public static ActFragmen getInstance() {
        if (instance == null) {
            synchronized (ActFragmen.class) {
                if (instance == null) {
                    return new ActFragmen();
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
        return R.layout.activity_act_fragmen;
    }
}
