package us.narin.aliceslawyer.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import us.narin.aliceslawyer.fragments.DictFragment;
import us.narin.aliceslawyer.fragments.NewsFragment;

/**
 * Created by Seungwoo on 2015. 12. 19..
 */
public class DictAdapter extends FragmentPagerAdapter {

    private static final int COUNT_PAGE = 3;
    Context mContext;

    public DictAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DictFragment("", mContext);
            case 1:
                return new DictFragment("", mContext);
            case 2:
                return new DictFragment("", mContext);
        }
        return null;
    }

    @Override
    public int getCount() {
        return COUNT_PAGE;
    }
}
