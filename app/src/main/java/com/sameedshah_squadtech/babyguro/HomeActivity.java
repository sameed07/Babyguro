package com.sameedshah_squadtech.babyguro;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;

    ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         drawerLayout =   findViewById(R.id.drawer_layout);
//        //changed from here
//        mToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close);
//        drawerLayout.addDrawerListener(mToggle);
//        mToggle.syncState();
//
//
//        configureNavigationDrawer();
//        setToolbar();

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Home");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        actionBar.setHomeAsUpIndicator(R.drawable.ic_side_menu_24dp);
    }

    private void setToolbar(){
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setTitle("Home");
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setHomeAsUpIndicator(R.drawable.ic_side_menu_24dp);
    }
    private void configureNavigationDrawer() {
        NavigationView navView =  findViewById(R.id.navigation);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                //f  = null;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.action_home) {
                   // f = new HomeFragment();
                } else if (itemId == R.id.action_cat) {
                    //f = new CategoryFragment();
                }
//                if (f != null) {
//                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                    transaction.replace(R.id.frame, f);
//                    transaction.commit();
//                    drawerLayout.closeDrawers();
//                    return true;
//                }
                 return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case android.R.id.home:{
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            }
        }

        return super.onOptionsItemSelected(item);

}
}
