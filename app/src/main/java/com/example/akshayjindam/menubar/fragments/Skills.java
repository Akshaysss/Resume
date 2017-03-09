package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akshayjindam.menubar.R;
import com.example.akshayjindam.menubar.recyclerView.GridViewAdapter;
import com.example.akshayjindam.menubar.recyclerView.skillsModel;

import java.util.ArrayList;
import java.util.List;


public class Skills extends Fragment {

    private static final int skills_row = 100;
    GridViewAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_skills, container, false);

        RecyclerView mskills_row = (RecyclerView) v.findViewById(R.id.my_recycler_view);
        mskills_row.setHasFixedSize(true);

        mskills_row.setLayoutManager(new GridLayoutManager(getActivity(),2));


        List<skillsModel>list= new ArrayList<>();
        skillsModel s1=new skillsModel();
        s1.setName("Android");
        s1.setPhotoID(R.drawable.ic_education);
        list.add(s1);


        skillsModel s2=new skillsModel();
        s2.setName("Java");
        s2.setPhotoID(R.drawable.ic_education);
        list.add(s2);


        skillsModel s3=new skillsModel();
        s3.setName("HTML");
        s3.setPhotoID(R.drawable.ic_education);
        list.add(s3);

        skillsModel s4=new skillsModel();
        s4.setName("CSS");
        s4.setPhotoID(R.drawable.ic_education);
        list.add(s4);


        GridViewAdapter mAdapter;
        mAdapter = new GridViewAdapter(list, getContext());
        mskills_row.setAdapter(mAdapter);

        return v;



    }




}
