package com.example.akshayjindam.menubar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akshayjindam.menubar.R;


public class Experience extends Fragment implements View.OnClickListener {

    TextView txt1, txt2, txt3, txt4;
    LinearLayout layout1, layout2, layout3;

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


        txt1 = (TextView) v.findViewById(R.id.more1);
        txt2 = (TextView) v.findViewById(R.id.more2);
        txt3 = (TextView) v.findViewById(R.id.more3);

        layout1 = (LinearLayout) v.findViewById(R.id.jj_layout1);
        layout2 = (LinearLayout) v.findViewById(R.id.jj_layout2);
        layout3 = (LinearLayout) v.findViewById(R.id.jj_layout3);

        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);


        return v;
    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.more1:

                if (layout1.getVisibility() == View.VISIBLE) {
                    layout1.setVisibility(View.GONE);
                    txt1.setText("...more");
                    Toast.makeText(getActivity(), "show less", Toast.LENGTH_SHORT).show();

                } else {
                    layout1.setVisibility(View.VISIBLE);
                    txt1.setText("...less");

                    Toast.makeText(getContext(), "show more", Toast.LENGTH_SHORT).show();
                }
                //whatever
                break;

            case R.id.more2:

                if(layout2.getVisibility()== View.VISIBLE){
                    layout2.setVisibility(View.GONE);
                    txt2.setText("...more");
                    Toast.makeText(getContext(),"show less",Toast.LENGTH_SHORT).show();
                } else {
                    layout2.setVisibility(View.VISIBLE);
                    txt2.setText("...less");
                }


                break;

            case R.id.more3:

                if (layout3.getVisibility() == View.VISIBLE) {
                    layout3.setVisibility(View.GONE);
                    txt3.setText("...more");
                    Toast.makeText(getActivity(), "show less", Toast.LENGTH_SHORT).show();

                } else {
                    layout3.setVisibility(View.VISIBLE);
                    txt3.setText("...less");
                    Toast.makeText(getContext(), "show more", Toast.LENGTH_SHORT).show();

                }


        }




    }
}

