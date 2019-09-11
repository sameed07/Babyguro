package com.sameedshah_squadtech.babyguro;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.sameedshah_squadtech.babyguro.Adapters.MyViewPageAdapter;
import com.sameedshah_squadtech.babyguro.Fragments.MoreProductFragment;
import com.sameedshah_squadtech.babyguro.Fragments.ProductDetailFragment;
import com.sameedshah_squadtech.babyguro.Fragments.ProductReviews;
import com.sameedshah_squadtech.babyguro.Fragments.VendorInfoFragment;

public class ProductActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout MyTabs;
    ViewPager MyPage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        MyTabs = (TabLayout)findViewById(R.id.MyTabs);
        MyPage = (ViewPager)findViewById(R.id.MyPage);
        MyTabs.setSelectedTabIndicatorColor(Color.parseColor("#FF0000"));
        MyTabs.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        MyTabs.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"));

        MyTabs.setupWithViewPager(MyPage);
        SetUpViewPager(MyPage);
    }
    public void SetUpViewPager (ViewPager viewpage){
        MyViewPageAdapter Adapter = new MyViewPageAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new ProductDetailFragment(), "Product Detail");
        Adapter.AddFragmentPage(new ProductReviews(), "Review");
        Adapter.AddFragmentPage(new VendorInfoFragment(), "Vendor Info");
        Adapter.AddFragmentPage(new MoreProductFragment(), "More Products");
        //We Need Fragment class now

        viewpage.setAdapter(Adapter);

    }

}

