package us.narin.aliceslawyer.fragments;


import android.content.Context;
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
import us.narin.aliceslawyer.adapter.DictItemAdapter;
import us.narin.aliceslawyer.adapter.LawyerAdapter;
import us.narin.aliceslawyer.adapter.LawyerItemAdapter;
import us.narin.aliceslawyer.model.DictItemModel;
import us.narin.aliceslawyer.model.LawyerItemModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class LawyerFragment extends Fragment {

    String targetUrl;
    Context mContext;

    public LawyerFragment(String targetUrl, Context mContext) {
        this.targetUrl = targetUrl;
        this.mContext = mContext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_lawyer, container, false);

        RecyclerView mRecyclerView = (RecyclerView)mView.findViewById(R.id.dict_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new LawyerItemAdapter(getDummy(), getActivity()));

        return mView;
    }

    private List<LawyerItemModel> getDummy(){
        List<LawyerItemModel> resultList = new ArrayList<>();
        for (int i=0; i<10; i++){
            resultList.add(new LawyerItemModel("오수원","(법무법인 민) [02-2055-2039]", "https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000026550&fileSn=0", ""));
        }
        return resultList;
    }


}
