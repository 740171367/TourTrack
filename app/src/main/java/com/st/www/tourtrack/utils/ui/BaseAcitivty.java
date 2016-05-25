package com.st.www.tourtrack.utils.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.st.www.tourtrack.R;

/**
 * Created by Administrator on 2016/5/25.
 */
public abstract class BaseAcitivty extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        initData();
        initEven();
    }

    protected abstract void initEven();
    
    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayout() ;

}
