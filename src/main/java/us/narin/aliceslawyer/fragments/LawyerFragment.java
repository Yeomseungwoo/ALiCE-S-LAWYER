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
import java.util.Collections;
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

        RecyclerView mRecyclerView = (RecyclerView) mView.findViewById(R.id.dict_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new LawyerItemAdapter(getDummy(), getActivity()));

        return mView;
    }

    private List<LawyerItemModel> getDummy() {
        List<LawyerItemModel> resultList = new ArrayList<>();
        resultList.add(new LawyerItemModel("오수원", "(법무법인 민) [02-2055-2039]", "https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000026550&fileSn=0", ""));
        resultList.add(new LawyerItemModel("김기환", "(변호사 김기환법률사무소) [02-569-6193]", "",""));
        resultList.add(new LawyerItemModel("신현영", "(변호사 신현영법률사무소) [02-3468-3800]", "https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000025101&fileSn=0",""));
        resultList.add(new LawyerItemModel("정환희", "(법무법인 율산) [02-535-4422]", "https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000024206&fileSn=0",""));
        resultList.add(new LawyerItemModel("권종무", "(변호사 권종무법률사무소) [02-521-3812]","https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000026885&fileSn=0",""));
        resultList.add(new LawyerItemModel("김혜수", "(법무법인 민후) [02-532-3483]", "https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000024287&fileSn=0",""));
        resultList.add(new LawyerItemModel("사공대", "(법무법인(유한) 화우) [02-6182-8323]","https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000024228&fileSn=0",""));
        resultList.add(new LawyerItemModel("김윤상" ,"(법무법인(유한) 한별) [02-6255-7741]","https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000029609&fileSn=0", ""));
        resultList.add(new LawyerItemModel("김강균", "(법무법인 율산) [02-535-4422]","https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000023394&fileSn=0",""));
        resultList.add(new LawyerItemModel("위대영", "(법무법인 덕수) [02-567-2316]","https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000024922&fileSn=0", ""));
        resultList.add(new LawyerItemModel("강동원", "(법무법인 정의) [02-3468-3877]", "https://m.seoulbar.or.kr:444/cmm/fms/getImage.do?atchFileId=FILE_000000000024591&fileSn=0",""));
        Collections.shuffle(resultList);
        return resultList;
    }


}
