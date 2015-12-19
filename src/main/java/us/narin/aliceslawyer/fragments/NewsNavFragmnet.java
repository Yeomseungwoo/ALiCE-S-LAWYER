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

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.activities.MainActivity;
import us.narin.aliceslawyer.adapter.NewsAdapter;

public class NewsNavFragmnet extends Fragment {

    private String[] newsTabTitles= {"법원", "법무경찰", "현재군사법원", "국회법세처", "로스쿨", "로펌", "사법연수원"};
    private NewsAdapter newsAdapter;
    FragmentManager fragmentManager;
    TabLayout mTabLayout;

    public NewsNavFragmnet(FragmentManager fragmentManager){
        this.fragmentManager = fragmentManager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_news_nav, container, false);

        mTabLayout = ((MainActivity)getActivity()).newsTab;
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        newsAdapter = new NewsAdapter(fragmentManager,getActivity());

        ViewPager newsViewPager = (ViewPager)mView.findViewById(R.id.news_vp);
        newsViewPager.setOffscreenPageLimit(0);
        newsViewPager.setAdapter(newsAdapter);

        mTabLayout.setupWithViewPager(newsViewPager);

        for (int i=0; i<newsTabTitles.length; i++){
            mTabLayout.getTabAt(i).setText(newsTabTitles[i]);
        }
        return mView;
    }
}
