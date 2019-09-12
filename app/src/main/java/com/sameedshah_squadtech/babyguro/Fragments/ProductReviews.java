package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sameedshah_squadtech.babyguro.Adapters.ProductReviewAdapter;
import com.sameedshah_squadtech.babyguro.R;

public class ProductReviews extends Fragment {

    private RecyclerView product_review_recycler;

    public ProductReviews(){}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.product_review, container, false);


        String[] user_name = {"Dagny Solem ","Aida Christner","Lajuana Taubman","Glennie Stoltz"};

        product_review_recycler = view.findViewById(R.id.product_review_recycler);
        product_review_recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        ProductReviewAdapter adapter = new ProductReviewAdapter(getContext(),user_name);
        product_review_recycler.setAdapter(adapter);

        return view;
    }
}
