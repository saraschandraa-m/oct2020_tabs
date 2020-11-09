package com.nexstacks.tabactivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {

//    private String[] titles = new String[]{"Chat", "Status", "Calls"};
private String[] titles;

    public FragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        titles = context.getResources().getStringArray(R.array.page_title);
    }

//    public
    @NonNull
    @Override
    public Fragment getItem(int position) {
        SingleFragment viewFragment = new SingleFragment();
        Bundle data = new Bundle();
        data.putString("TITLE", titles[position]);
        viewFragment.setArguments(data);
        return viewFragment;
    }

    //How many tabs to be displayed
    @Override
    public int getCount() {
        return titles.length;
    }

    //To show title in the tabs
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
