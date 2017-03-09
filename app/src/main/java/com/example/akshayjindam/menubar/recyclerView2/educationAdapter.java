package com.example.akshayjindam.menubar.recyclerView2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.akshayjindam.menubar.R;

import java.util.List;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class educationAdapter extends RecyclerView.Adapter<educationAdapter.MyViewHolder> {
    private Context context;
    private List<educationModel> list;

    public educationAdapter(List<educationModel> list, Context context) {

        this.list = list;
        this.context = context;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        TextView cls;
        TextView year;

        public MyViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.name2);
            cls = (TextView) itemView.findViewById(R.id.cls);
            year = (TextView) itemView.findViewById(R.id.year);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.education_row, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(list.get(position).getName());
        holder.cls.setText(list.get(position).getCls());
        holder.year.setText(list.get(position).getYear()+"");

        holder.Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });



    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
