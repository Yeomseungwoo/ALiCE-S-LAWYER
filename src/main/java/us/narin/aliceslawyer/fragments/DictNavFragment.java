package us.narin.aliceslawyer.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.activities.MainActivity;
import us.narin.aliceslawyer.adapter.DictAdapter;
import us.narin.aliceslawyer.adapter.NewsAdapter;
import us.narin.aliceslawyer.model.NewsItemModel;

public class DictNavFragment extends Fragment {

    private String[] newsTabTitles= {"주간조회순", "주간의견순", "가나다순"};
    TabLayout mTabLayout;
    FragmentManager fragmentManager;
    public DictNavFragment(FragmentManager fragmentManager){
        this.fragmentManager = fragmentManager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_dict_nav, container, false);
        mTabLayout = ((MainActivity)getActivity()).newsTab;
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);

        ViewPager mViewPager = (ViewPager)mView.findViewById(R.id.dict_vp);
        mViewPager.setAdapter(new DictAdapter(fragmentManager,getActivity()));

        mTabLayout.setupWithViewPager(mViewPager);

        for (int i=0; i<newsTabTitles.length; i++){
            mTabLayout.getTabAt(i).setText(newsTabTitles[i]);
        }

        return mView;
    }

}
