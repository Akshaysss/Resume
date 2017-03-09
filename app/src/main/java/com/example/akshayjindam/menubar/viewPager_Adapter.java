package com.example.akshayjindam.menubar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.akshayjindam.menubar.ViewPager.project_tab1;
import com.example.akshayjindam.menubar.ViewPager.project_tab2;

/**
 * Created by Akshay Jindam on 04-03-2017.
 */

public class viewPager_Adapter extends FragmentStatePagerAdapter {
    public viewPager_Adapter(FragmentActivity activity, FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if (i==0)
        {
            fragment = new project_tab1();
        }
        if (i==1)
        {
            fragment = new project_tab2();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
