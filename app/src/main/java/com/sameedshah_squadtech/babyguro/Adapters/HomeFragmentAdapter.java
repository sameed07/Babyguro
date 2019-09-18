package com.sameedshah_squadtech.babyguro.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sameedshah_squadtech.babyguro.ProductActivity;
import com.sameedshah_squadtech.babyguro.R;

public class HomeFragmentAdapter extends  RecyclerView.Adapter<HomeFragmentAdapter.ViewHolder> {

        int[] images ;


        private Context mContext;

        public HomeFragmentAdapter(Context context, int[] images){
            this.mContext = context;
            this.images = images;

        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_adapter,
                viewGroup, false);
        return new HomeFragmentAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

            viewHolder.mProdictImage.setImageResource(images[i]);
            viewHolder.mProdictImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, ProductActivity.class);
                    mContext.startActivity(intent);
                }
            });

    }

    @Override
    public int getItemCount() {
        return images.length ;
    }


    public class ViewHolder extends RecyclerView.ViewHolder  {

        ImageView mProdictImage,mCartButton;
        TextView txtRating,txtProductName,txtVendorsName,txtPrice;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mProdictImage = itemView.findViewById(R.id.item_image);
            mCartButton = itemView.findViewById(R.id.addToCartBtn);
            txtProductName = itemView.findViewById(R.id.txt_product_name);
            txtVendorsName = itemView.findViewById(R.id.txt_vendor_name);
            txtRating = itemView.findViewById(R.id.txtRating);
            txtPrice = itemView.findViewById(R.id.txt_Price_name);

        }


    }

}
