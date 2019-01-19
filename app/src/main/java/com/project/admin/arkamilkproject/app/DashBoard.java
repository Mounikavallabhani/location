package com.project.admin.arkamilkproject.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.project.admin.arkamilkproject.R;
import com.project.admin.arkamilkproject.fragmentsdata.Delivary;
import com.project.admin.arkamilkproject.fragmentsdata.Me;
import com.project.admin.arkamilkproject.fragmentsdata.Plans;
import com.project.admin.arkamilkproject.fragmentsdata.Store;

public class DashBoard extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment=null;
            switch (item.getItemId()) {
                case R.id.navigation_store:

                    fragment=new Store();

                    break;
                case R.id.navigation_delivary:

                    fragment=new Delivary();
                    break;
                case R.id.navigation_plans:

                    fragment=new Plans();

                    break;

                case R.id.navigation_me:

                    fragment=new Me();

                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new Store()).commit();
    }

}
