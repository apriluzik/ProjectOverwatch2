package com.apriluzikgmail.m.projectoverwatch2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mapri on 2017-06-26.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    Fragment[] frags = new Fragment[2];
    String[] titles = new String[]{"OVER VIEW","BIOGRAPHY"};


    public FragmentAdapter(FragmentManager fm) {
        super(fm);

        frags[0]=new SecondTab1Fragment();
        frags[1]=new SecondTab2Fragment();

//        ((SecondTab2Fragment)frags[1]).setIndex(((SecondTab1Fragment)frags[0]).getHeroIndex());
    }

    @Override
    public Fragment getItem(int position) {
        return frags[position];
    }

    @Override
    public int getCount() {
        return frags.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
