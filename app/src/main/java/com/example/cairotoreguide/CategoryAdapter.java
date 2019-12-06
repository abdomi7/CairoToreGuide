package com.example.cairotoreguide;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalPlaces();
        } else if (position == 1) {
            return new FamousStreet();
        } else if (position == 2) {
            return new Restaurant();
        } else {
            return new Malls();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.history);
        } else if (position == 1) {
            return mContext.getString(R.string.street);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurant);
        } else {
            return mContext.getString(R.string.malls);
        }
    }
}
