package com.example.akshayjindam.menubar.skills_rv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.akshayjindam.menubar.R;

import java.util.List;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class Skills_Adapter extends RecyclerView.Adapter<Skills_Adapter.ViewHolder> {
    private Context context;
    private List<skillsModel> list;


    public Skills_Adapter(List<skillsModel> list, Context context) {

        this.list = list;
        this.context = context;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        ImageView imageView;
        RatingBar Rating;

        public ViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.name);
            imageView = (ImageView) itemView.findViewById(R.id.img);
            Rating = (RatingBar) itemView.findViewById(R.id.ratingBar);
        }
    }

    @Override
    public Skills_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.skills_row, parent, false);
        /*float d= (float) (50);
        RatingBar rb = (RatingBar) v.findViewById(R.id.ratingBar);
        rb.setRating(d);*/
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Skills_Adapter.ViewHolder holder, int position) {
        holder.Name.setText(list.get(position).getName());
        holder.Rating.setRating(list.get(position).getRating());

//        holder.Rating.setRating((float) 2.5);

        // for image
        holder.imageView.setImageResource(list.get(position).getPhotoID());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
