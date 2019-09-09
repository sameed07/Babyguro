package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sameedshah_squadtech.babyguro.Adapters.BestSellingAdapter;
import com.sameedshah_squadtech.babyguro.Adapters.HomeFragmentAdapter;
import com.sameedshah_squadtech.babyguro.R;

public class ShopFragment extends Fragment {

    RecyclerView best_selling_recycler,buy_product_recycler;
    Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.shop_fragment, container, false);

        best_selling_recycler = view.findViewById(R.id.best_selling_prduct_recycler);
        buy_product_recycler = view.findViewById(R.id.shop_product_recycler);
//        toolbar = view.findViewById(R.id.toolbar);
//        toolbar.setTitle("Shop");

        //dummy images list
        int[] images = {R.drawable.asset_one,R.drawable.asset_one,R.drawable.asset_one
                ,R.drawable.asset_one,R.drawable.asset_one,R.drawable.asset_one,
                R.drawable.asset_one};

        //horizontal recyclerview
        best_selling_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        BestSellingAdapter adapter = new BestSellingAdapter(getActivity(),images);
        best_selling_recycler.setAdapter(adapter);
        //second recyclerview with grid layout
        buy_product_recycler.setLayoutManager(new GridLayoutManager(getActivity(),2));
        HomeFragmentAdapter buyProduct = new HomeFragmentAdapter(getActivity(),images);
        buy_product_recycler.setAdapter(buyProduct);
        return view;
    }
}
