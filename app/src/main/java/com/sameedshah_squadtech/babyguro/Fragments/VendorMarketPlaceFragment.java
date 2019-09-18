package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


        return view;
    }
}
