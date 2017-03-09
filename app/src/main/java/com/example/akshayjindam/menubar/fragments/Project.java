package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akshayjindam.menubar.R;
import com.example.akshayjindam.menubar.viewPager_Adapter;


public class Project extends Fragment {

    ViewPager viewpager;

    public Project() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_project, container, false);

        ViewPager pager=(ViewPager) v.findViewById(R.id.pager);

        pager.setAdapter(buildAdapter());

        return v;
    }

    private PagerAdapter buildAdapter() {
        return(new viewPager_Adapter(getActivity(), getChildFragmentManager()));
    }

}




