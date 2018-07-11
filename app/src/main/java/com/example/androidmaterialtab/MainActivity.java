package com.example.androidmaterialtab;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.androidmaterialtab.Main.TabAdapter;
import com.example.androidmaterialtab.Main.MainFragment_1;
import com.example.androidmaterialtab.Main.MainFragment_2;
import com.example.androidmaterialtab.Main.MainFragment_3;
import com.example.androidmaterialtab.Main.MainFragment_4;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabAdapter tabAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.addFragment(new MainFragment_1(), "Tab 1");
        tabAdapter.addFragment(new MainFragment_2(), "Tab 2");
        tabAdapter.addFragment(new MainFragment_3(), "Tab 3");
        tabAdapter.addFragment(new MainFragment_4(), "Tab 4");

        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}