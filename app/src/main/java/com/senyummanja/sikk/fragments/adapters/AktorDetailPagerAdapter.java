package com.senyummanja.sikk.fragments.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.senyummanja.sikk.R;
import com.senyummanja.sikk.fragments.AktorInfoFragment_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irvan on 12/6/15.
 */
public class AktorDetailPagerAdapter extends FragmentStatePagerAdapter {

    private Context context;
    private List<Fragment> fragments = new ArrayList<>();

    public AktorDetailPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

        fragments.add(AktorInfoFragment_.builder().build());
        fragments.add(AktorInfoFragment_.builder().build());
        fragments.add(AktorInfoFragment_.builder().build());
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String[] titles = context.getResources().getStringArray(R.array.aktor_detail_tab_titles);
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
}
