package com.sameedshah_squadtech.babyguro.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sameedshah_squadtech.babyguro.R;

public class ProductDetailFragment extends Fragment  {

    Button btnAdd,btnMinus;
    TextView text_item;

    int count = 0;

    public ProductDetailFragment(){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.product_detail_fragment, container, false);
        btnAdd  = view.findViewById(R.id.btnAdd);
        btnMinus = view.findViewById(R.id.btnMinus);

        text_item = view.findViewById(R.id.text_item);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = Integer.parseInt(text_item.getText().toString());
                count ++;
                text_item.setText(""+count);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(count <=0){
                    Toast.makeText(getActivity(), "0 Item", Toast.LENGTH_SHORT).show();
                }else{
                    count --;
                    text_item.setText(""+count);
                }
            }
        });

        return view;
    }

}
