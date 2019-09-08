package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sameedshah_squadtech.babyguro.Adapters.HomeFragmentAdapter;
import com.sameedshah_squadtech.babyguro.R;

public class HomeFragment extends Fragment {


    private RecyclerView mRecycler;
    RecyclerView.LayoutManager manager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_fragment, container, false);

        int[] images = {R.drawable.asset_one,R.drawable.asset_one,R.drawable.asset_one
                ,R.drawable.asset_one,R.drawable.asset_one,R.drawable.asset_one,
                R.drawable.asset_one};

        mRecycler = view.findViewById(R.id.home_recycler);
        mRecycler.setLayoutManager(new GridLayoutManager(getActivity(),2));
        HomeFragmentAdapter adapter = new HomeFragmentAdapter(getActivity(),images);
        mRecycler.setAdapter(adapter);


        return view;
    }
}
