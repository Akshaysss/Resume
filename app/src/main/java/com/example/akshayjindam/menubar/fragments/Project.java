package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akshayjindam.menubar.R;
import com.example.akshayjindam.menubar.ViewPager.project_tab1;
import com.example.akshayjindam.menubar.ViewPager.project_tab2;
import com.example.akshayjindam.menubar.viewPager_Adapter;

import java.util.ArrayList;
import java.util.List;


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

        ViewPager pager = (ViewPager) v.findViewById(R.id.pager);


        pager.setAdapter(buildAdapter());

        return v;
    }

    private PagerAdapter buildAdapter() {

        List<Fragment> fragmentsList = new ArrayList<>();
        fragmentsList.add(new project_tab1());
        fragmentsList.add(new project_tab2());
        fragmentsList.add(new project_tab1());

        return (new viewPager_Adapter(getActivity(), getChildFragmentManager(), fragmentsList));
    }

}




