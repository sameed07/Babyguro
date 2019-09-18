package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sameedshah_squadtech.babyguro.Adapters.VendorMarketplaceAdapter;
import com.sameedshah_squadtech.babyguro.R;

public class VendorMarketPlaceFragment extends Fragment {

    private RecyclerView marketplace_recycler;

    public VendorMarketPlaceFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.vendor_market_place_fragment, container, false);

        marketplace_recycler = view.findViewById(R.id.vendor_market_recycler);
        marketplace_recycler.setLayoutManager(new GridLayoutManager(getActivity(),2));
        //dummy images list
        int[] images = {R.drawable.dummy_photo,R.drawable.asset_six,R.drawable.dummy_photo
                ,R.drawable.asset_six,R.drawable.asset_one,R.drawable.asset_one,
                R.drawable.dummy_photo};

        VendorMarketplaceAdapter adapter = new VendorMarketplaceAdapter(getActivity(), images);
        marketplace_recycler.setAdapter(adapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
}
