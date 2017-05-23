package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akshayjindam.menubar.MainActivity;
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
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Projects");
        View v = inflater.inflate(R.layout.fragment_project1, container, false);
        ViewPager pager = (ViewPager) v.findViewById(R.id.Project1_vp);

        List<project_model> data = new ArrayList<>();

        data.add(new project_model("Coal Pulveriser", "The Mini project deals with the case study about Coal Pulverisers, which the ones used coal for combustion in the steam-generating furnaces of fossil.\n" +
                "By using different types of pulveriser machines to smash materials into tiny shards or granules e.g. Hammer mills, ring mills, etc."));
        data.add(new project_model("CNC Machining", "The Major project deals with the manufacturing of various Engineering components on conventional machines involves machine accuracy and operator skill,\n" +
                "which are used in the CNC lathe machine. The machine covers all operations in the components."));
        data.add(new project_model("Project Title", "Description"));

        vp_Adapter adapter = new vp_Adapter(getActivity(), data);
        pager.setAdapter(adapter);

        return v;
    }

}
