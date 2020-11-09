package com.nexstacks.tabactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent();

        TabLayout mTabs = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.pager);


        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(adapter);
        mTabs.setupWithViewPager(viewPager);
    }

}