package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sameedshah_squadtech.babyguro.R;

public class MoreProductFragment extends Fragment {

    public MoreProductFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTree = inflater.inflate(R.layout.more_product_fragment, container, false);



        return PageTree;
    }
}
