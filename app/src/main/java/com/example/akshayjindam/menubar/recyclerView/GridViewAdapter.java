package com.example.akshayjindam.menubar.recyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.akshayjindam.menubar.R;

import java.util.List;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.ViewHolder> {
    private Context context;
    private List<skillsModel> list;


    public GridViewAdapter(List<skillsModel> list, Context context) {

        this.list = list;
        this.context = context;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.name);
            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }

    @Override
    public GridViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.skills_row, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GridViewAdapter.ViewHolder holder, int position) {
            holder.Name.setText(list.get(position).getName());

        // for image
        holder.imageView.setImageResource(list.get(position).getPhotoID());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
