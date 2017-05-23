package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akshayjindam.menubar.MainActivity;
import com.example.akshayjindam.menubar.R;
import com.example.akshayjindam.menubar.skills_rv.Skills_Adapter;
import com.example.akshayjindam.menubar.skills_rv.skillsModel;

import java.util.ArrayList;
import java.util.List;


public class Skills extends Fragment {

    private static final int skills_row = 100;
    Skills_Adapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Skills");
        View v = inflater.inflate(R.layout.fragment_skills, container, false);

        RecyclerView mskills_row = (RecyclerView) v.findViewById(R.id.skills_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mskills_row.setLayoutManager(layoutManager);


        mskills_row.setHasFixedSize(true);


        List<skillsModel>list= new ArrayList<>();
        skillsModel s1=new skillsModel();
        s1.setName("Android");
        s1.setPhotoID(R.drawable.skills_android);
        s1.setRating((float) 4.5);
        list.add(s1);


        skillsModel s2=new skillsModel();
        s2.setName("Java");
        s2.setPhotoID(R.drawable.skills_java);
        s2.setRating (3.0f);
        list.add(s2);


        skillsModel s3=new skillsModel();
        s3.setName("HTML");
        s3.setPhotoID(R.drawable.skills_html);
        s3.setRating (4.0f);
        list.add(s3);

        skillsModel s4=new skillsModel();
        s4.setName("CSS");
        s4.setPhotoID(R.drawable.skills_css);
        s4.setRating (3.0f);
        list.add(s4);


        Skills_Adapter mAdapter;
        mAdapter = new Skills_Adapter(list, getContext());
        mskills_row.setAdapter(mAdapter);

        return v;



    }




}
