package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sameedshah_squadtech.babyguro.Adapters.HomeFragmentAdapter;
import com.sameedshah_squadtech.babyguro.R;

public class MoreProductFragment extends Fragment {

    private RecyclerView mRecycler;
    public MoreProductFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.more_product_fragment, container, false);


        mRecycler = view.findViewById(R.id.more_product_recycler);
        int[] images = {R.drawable.asset_one,R.drawable.asset_one,R.drawable.asset_one
                ,R.drawable.asset_one,R.drawable.asset_one,R.drawable.asset_one,
                R.drawable.asset_one};

        mRecycler.setLayoutManager(new GridLayoutManager(getActivity(),2));
        HomeFragmentAdapter adapter = new HomeFragmentAdapter(getContext(),images);
        mRecycler.setAdapter(adapter);

        return view;
    }
}
