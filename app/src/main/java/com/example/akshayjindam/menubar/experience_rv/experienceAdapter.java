package com.example.akshayjindam.menubar.experience_rv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.akshayjindam.menubar.R;

import java.util.List;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class experienceAdapter extends RecyclerView.Adapter<experienceAdapter.MyViewHolder> {
    private Context context;
    private List<experienceModel> list;

    public experienceAdapter(List<experienceModel> list, Context context) {

        this.list = list;
        this.context = context;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView CompanyName, Designation, Period, Content1, Content2, Content3;
        ImageView imageView1;
        LinearLayout linearlayout, description;


        public MyViewHolder(View itemView) {
            super(itemView);
            CompanyName = (TextView) itemView.findViewById(R.id.ex_companyname);
            Designation = (TextView) itemView.findViewById(R.id.ex_designation);
            Period = (TextView) itemView.findViewById(R.id.ex_period);
            Content1 = (TextView) itemView.findViewById(R.id.content_1);
            Content2 = (TextView) itemView.findViewById(R.id.content_2);
            Content3 = (TextView) itemView.findViewById(R.id.content_3);
            imageView1 = (ImageView) itemView.findViewById(R.id.ex_img);
            linearlayout = (LinearLayout) itemView.findViewById(R.id.ex_linearlayout);
            description = (LinearLayout) itemView.findViewById(R.id.ex_hiddenlayout);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.experience_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.CompanyName.setText(list.get(position).getCompanyName());
        holder.Designation.setText(list.get(position).getDesignation());
        holder.Period.setText(list.get(position).getPeriod() + "");
        holder.Content1.setText(list.get(position).getContent1());
        holder.Content2.setText(list.get(position).getContent2());
        holder.Content3.setText(list.get(position).getContent3());
        holder.imageView1.setImageResource(list.get(position).getPhotoID1());


        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (holder.description.getVisibility() == View.VISIBLE) {
                    holder.description.setVisibility(View.GONE);

                } else {
                    holder.description.setVisibility(View.VISIBLE);
                }
            }


        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
