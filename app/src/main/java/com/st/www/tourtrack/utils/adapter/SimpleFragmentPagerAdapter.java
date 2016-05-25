package com.st.www.tourtrack.utils.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.st.www.tourtrack.act.ActFragmen;
import com.st.www.tourtrack.mine.MineFragment;
import com.st.www.tourtrack.tour.TourFragment;
import com.st.www.tourtrack.world.WorldFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public class SimpleFragmentPagerAdapter  extends FragmentPagerAdapter {
    private List<String> titls;

    public SimpleFragmentPagerAdapter(FragmentManager fm,  List<String> titls) {
        super(fm);

        this.titls = titls;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        switch(getPageTitle(position).toString() ){
            case  "tour":
                fragment= TourFragment.getInstance();
                break;
            case  "mine":
                fragment= MineFragment.getInstance();
                break;
            case  "world":
                fragment= WorldFragment.getInstance();
                break;
            case  "act":
                fragment= ActFragmen.getInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return titls.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titls.get(position);
    }
}
