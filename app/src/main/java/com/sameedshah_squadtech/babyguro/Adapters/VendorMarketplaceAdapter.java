package com.sameedshah_squadtech.babyguro.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sameedshah_squadtech.babyguro.R;

public class VendorMarketplaceAdapter extends RecyclerView.Adapter<VendorMarketplaceAdapter.ViewHolder> {

    int[] images ;
    Context mContext;


    public VendorMarketplaceAdapter(Context context, int[] images){
        this.mContext = context;
        this.images = images;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vendor_market_place_adapter,
                viewGroup, false);
        return new VendorMarketplaceAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
