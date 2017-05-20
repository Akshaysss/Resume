package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akshayjindam.menubar.R;
import com.example.akshayjindam.menubar.project1_VP.project_model;
import com.example.akshayjindam.menubar.project1_VP.vp_Adapter;

import java.util.ArrayList;
import java.util.List;


public class Project1 extends Fragment {


    public Project1() {
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
       /* return inflater.inflate(R.layout.fragment_project1, container, false);*/

        View v = inflater.inflate(R.layout.fragment_project1, container, false);
        ViewPager pager = (ViewPager) v.findViewById(R.id.Project1_vp);

        List<project_model> data = new ArrayList<>();

        data.add(new project_model("Topic 1", "Something about Project"));
        data.add(new project_model("Topic 2", "Description"));
        data.add(new project_model("Topic 3", "Description"));
        data.add(new project_model("Topic 4", "Description"));

        vp_Adapter adapter = new vp_Adapter(getActivity(), data);
        pager.setAdapter(adapter);

        return v;
    }

}
