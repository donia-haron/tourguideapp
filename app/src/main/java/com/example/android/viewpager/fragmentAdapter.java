package com.example.android.viewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ResourceBundle;


public class fragmentAdapter  extends FragmentPagerAdapter {
    Context context = null;
    public fragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new infoFragment();

        } else if (position == 1) {
            return new historyFragment();
        }else if (position == 2) {
            return new resturantFragment();
        }
        else {
            return new hotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public String getPageTitle(int position) {

        if (position == 0) {
            return context.getString(R.string.infoo);
        } else if (position == 1) {
            return context.getString(R.string.rest);
        } else if (position == 2) {
            return context.getString(R.string.hotel);
        } else {
            return context.getString(R.string.historc);
        }}


}