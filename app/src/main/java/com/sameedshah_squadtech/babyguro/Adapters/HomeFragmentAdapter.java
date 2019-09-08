package com.sameedshah_squadtech.babyguro.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sameedshah_squadtech.babyguro.HomeActivity;
import com.sameedshah_squadtech.babyguro.R;

public class HomeFragmentAdapter extends  RecyclerView.Adapter<HomeFragmentAdapter.ViewHolder> {

        int[] images ;
        String[] title ;
        String[] price ;
private Context mContext;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder  {

        ImageView mImage;
        TextView mTitle;
        TextView mPrice;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }


    }

}
