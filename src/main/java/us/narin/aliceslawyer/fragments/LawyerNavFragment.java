package us.narin.aliceslawyer.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.activities.MainActivity;
import us.narin.aliceslawyer.adapter.DictAdapter;
import us.narin.aliceslawyer.adapter.LawyerAdapter;

public class LawyerNavFragment extends Fragment {

    private String[] newsTabTitles= {"강남구", "강동구", "강북구","강서구", "관악구", "광진구","구로구"};
    TabLayout mTabLayout;
    FragmentManager fragmentManager;
    public LawyerNavFragment(FragmentManager fragmentManager){
        this.fragmentManager = fragmentManager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_dict_nav, container, false);
        mTabLayout = ((MainActivity)getActivity()).newsTab;
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        ViewPager mViewPager = (ViewPager)mView.findViewById(R.id.dict_vp);
        mViewPager.setAdapter(new LawyerAdapter(fragmentManager,getActivity()));

        mTabLayout.setupWithViewPager(mViewPager);

        for (int i=0; i<newsTabTitles.length; i++){
            mTabLayout.getTabAt(i).setText(newsTabTitles[i]);
        }

        return mView;
    }

}
