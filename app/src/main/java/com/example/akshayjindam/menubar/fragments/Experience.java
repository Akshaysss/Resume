package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.akshayjindam.menubar.MainActivity;
import com.example.akshayjindam.menubar.R;
import com.example.akshayjindam.menubar.experience_rv.experienceAdapter;
import com.example.akshayjindam.menubar.experience_rv.experienceModel;

import java.util.ArrayList;


public class Experience extends Fragment {

    TextView txt4;
    LinearLayout layout1, layout2, layout3, layout4;

    public Experience() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_experience, container, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Experience");
        RecyclerView mexperience = (RecyclerView) v.findViewById(R.id.ex_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mexperience.setLayoutManager(layoutManager);

        mexperience.setHasFixedSize(true);


        ArrayList<experienceModel> list = new ArrayList<>();

        experienceModel e1 = new experienceModel();
        e1.setCompanyName("Johnson & Johnson");
        e1.setDesignation("Maintenance Engineer");
        e1.setPeriod(0.8f);
        e1.setContent1(getResources().getString(R.string.w11));
        e1.setContent2(getResources().getString(R.string.w12));
        e1.setContent3(getResources().getString(R.string.w13));
        e1.setPhotoID1(R.drawable.ic_experience);
        list.add(e1);

        experienceModel e2 = new experienceModel();
        e2.setCompanyName("Johnson & Johnson");
        e2.setDesignation("Maintenance Engineer");
        e2.setPeriod(0.8f);
        e2.setContent1(getResources().getString(R.string.w21));
        e2.setContent2(getResources().getString(R.string.w22));
        e2.setContent3(getResources().getString(R.string.w23));
        e2.setPhotoID1(R.drawable.ic_experience);
        list.add(e2);

        experienceAdapter mAdapter = new experienceAdapter(list, getContext());
        mexperience.setAdapter(mAdapter);


        return v;
    }
}



