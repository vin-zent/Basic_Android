package com.example.module2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Fragment_Activity extends AppCompatActivity {{}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_);

        BottomNavigationView botm =findViewById(R.id.bot_nav);
        botm.setOnNavigationItemSelectedListener(navlistner);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navlistner = new BottomNavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFrag= null;
            switch (item.getItemId()){
                case R.id.nav_home:
                    selectedFrag=new HomeFragment();
                    break;
                case R.id.nav_fav:
                    selectedFrag=new FavFragment();
                    break;
                case R.id.nav_setting:
                    selectedFrag=new settingFragment();
                    break;


            }
           getSupportFragmentManager().beginTransaction().replace(R.id.Container,selectedFrag).commit();
            return true;
        }
    };
}