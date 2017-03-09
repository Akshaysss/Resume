package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.akshayjindam.menubar.R;
import com.example.akshayjindam.menubar.recyclerView2.educationAdapter;
import com.example.akshayjindam.menubar.recyclerView2.educationModel;

import java.util.ArrayList;
import java.util.List;

public class Education extends Fragment {

    private static final int NUM_LIST_ITEMS = 100;

    private Toast mToast;

    public Education() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_education, container, false);

        RecyclerView meducatoin = (RecyclerView) v.findViewById(R.id.rv_education);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        meducatoin.setLayoutManager(layoutManager);

        meducatoin.setHasFixedSize(true);

        List<educationModel> list = new ArrayList<>();

        educationModel A1 = new educationModel();
        A1.setName("AIET");
        A1.setCls("Mechanical Engineering");
        A1.setYear(2015);
        list.add(A1);

        educationModel A2 = new educationModel();
        A2.setName("BNN");
        A2.setCls("SCIENCE");
        A2.setYear(2011);
        list.add(A2);

        educationModel A3 = new educationModel();
        A3.setName("S.J.P");
        A3.setCls("English");
        A3.setYear(2009);
        list.add(A3);


        educationAdapter mAdapter = new educationAdapter(list, getContext());

        meducatoin.setAdapter(mAdapter);

        return v;
    }


}
