package us.narin.aliceslawyer.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import us.narin.aliceslawyer.fragments.DictFragment;
import us.narin.aliceslawyer.fragments.LawyerFragment;

/**
 * Created by Seungwoo on 2015. 12. 19..
 */
public class LawyerAdapter extends FragmentPagerAdapter {

    private static final int COUNT_PAGE = 7;
    Context mContext;

    public LawyerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LawyerFragment("", mContext);
            case 1:
                return new LawyerFragment("", mContext);
            case 2:
                return new LawyerFragment("", mContext);
            case 3:
                return new LawyerFragment("", mContext);
            case 4:
                return new LawyerFragment("", mContext);
            case 5:
                return new LawyerFragment("", mContext);
            case 6:
                return new LawyerFragment("", mContext);

        }
        return null;
    }

    @Override
    public int getCount() {
        return COUNT_PAGE;
    }
}
