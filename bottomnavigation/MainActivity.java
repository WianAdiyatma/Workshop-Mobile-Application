package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.navpesan:
                        selectedFragment = new Fragment();
                        break;
                    case R.id.navtelfon:
                        selectedFragment = new Fragment();
                        break;
                    case R.id.navkontak:
                        selectedFragment = new Fragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.FragmentContainer, selectedFragment).commit();
                return true;
            }
        });

    }
}
