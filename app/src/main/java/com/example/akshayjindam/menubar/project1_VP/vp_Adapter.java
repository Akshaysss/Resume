package com.example.akshayjindam.menubar.project1_VP;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.akshayjindam.menubar.R;

import java.util.List;

/**
 * Created by Akshay Jindam on 11-03-2017.
 */

public class vp_Adapter extends PagerAdapter {

    Context context;
    TextView title, description, pageNumber;
    List<project_model> data;

    public vp_Adapter(Context context, List<project_model> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ViewGroup layout = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.project1_row, collection, false);
        collection.addView(layout);

        title = (TextView) layout.findViewById(R.id.project_topic);
        description = (TextView) layout.findViewById(R.id.project_descrip);
        pageNumber = (TextView) layout.findViewById(R.id.ppg1);

        title.setText(data.get(position).getTopic());
        description.setText(data.get(position).getDescription());
        int pgno = position + 1;
        pageNumber.setText(pgno + "/"+ data.size());

        return layout;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

}
