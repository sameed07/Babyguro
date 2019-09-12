package com.sameedshah_squadtech.babyguro.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sameedshah_squadtech.babyguro.R;

public class ProductReviewAdapter extends RecyclerView.Adapter<ProductReviewAdapter.ViewHolder> {


    Context mContext;
    String[] user_name;

    public ProductReviewAdapter(Context context,String[] user_name){

        mContext = context;
        this.user_name = user_name;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_review_adapter,
                viewGroup, false);
        return new ProductReviewAdapter.ViewHolder(v);    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.txt_user_name.setText(user_name[i]);
    }

    @Override
    public int getItemCount() {
        return user_name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_user_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_user_name = itemView.findViewById(R.id.text_user_name);
        }
    }
}
