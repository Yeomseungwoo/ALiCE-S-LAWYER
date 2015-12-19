package us.narin.aliceslawyer.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.adapter.NewsItemAdapter;
import us.narin.aliceslawyer.model.NewsItemModel;

public class NewsFragment extends Fragment {

    String targetUrl;
    Context mContext;

    public NewsFragment(String targetUrl, Context mContext){
        this.targetUrl = targetUrl;
        this.mContext = mContext;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_news, container, false);

        RecyclerView mRecyclerView = (RecyclerView)mView.findViewById(R.id.news_rv);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new NewsItemAdapter(getDummy(), getActivity()));

        return mView;
    }

    private List<NewsItemModel > getDummy(){
        List<NewsItemModel> resultList = new ArrayList<>();
        for (int i=0; i<10; i++){
            resultList.add(new NewsItemModel("판사들 TV 직접 출연 기업회생제도 소개","창원지법, '사랑법원 캠페인 방송 2편' 송출 시작","2015-12-18 오전 11:44:50","https://image.lawtimes.co.kr/images/97483.jpg","https://www.lawtimes.co.kr/Legal-News/Legal-News-View?Serial=97483&kind=AA&key="));
        }
        return resultList;
    }

}
