package com.st.www.tourtrack.utils.ui;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.st.www.tourtrack.R;
import com.st.www.tourtrack.utils.adapter.SimpleFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseAcitivty {
    @ViewInject(R.id.id_home_vp)
    private ViewPager mviewPager;

    @ViewInject(R.id.id_home_tl)

    private TabLayout mtabLayout;
    private List<String> listoftitle;

    @Override
    protected void initEven() {

    }

    @Override
    protected void initData() {
        listoftitle=new ArrayList<>();
        listoftitle.add("tour");
        listoftitle.add("world");
        listoftitle.add("act");
        listoftitle.add("mine");

        SimpleFragmentPagerAdapter adapter=new SimpleFragmentPagerAdapter(getSupportFragmentManager(),listoftitle);
        mviewPager.setAdapter(adapter);
        mtabLayout.setBackgroundResource(R.mipmap.ic_launcher);
        mtabLayout.setupWithViewPager(mviewPager);
        mtabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    @Override
    protected void initView() {
        ViewUtils.inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }
}
