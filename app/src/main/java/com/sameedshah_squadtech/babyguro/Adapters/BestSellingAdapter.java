package com.sameedshah_squadtech.babyguro.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sameedshah_squadtech.babyguro.R;

public class BestSellingAdapter  extends  RecyclerView.Adapter<BestSellingAdapter.ViewHolder> {

    int[] images ;


    private Context mContext;

    public BestSellingAdapter(Context context, int[] images){
        this.mContext = context;
        this.images = images;

    }

    @NonNull
    @Override
    public BestSellingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.best_selling_adapter,
                viewGroup, false);
        return new BestSellingAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BestSellingAdapter.ViewHolder viewHolder, int i) {

        viewHolder.mProdictImage.setImageResource(images[i]);

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
