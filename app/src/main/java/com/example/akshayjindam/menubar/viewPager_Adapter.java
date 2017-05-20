package com.example.akshayjindam.menubar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Akshay Jindam on 04-03-2017.
 */

public class viewPager_Adapter extends FragmentStatePagerAdapter {

    List<Fragment> fragmentList;

    public viewPager_Adapter(FragmentActivity activity, FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }


    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
