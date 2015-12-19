package us.narin.aliceslawyer.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.adapter.DictItemAdapter;
import us.narin.aliceslawyer.adapter.NewsItemAdapter;
import us.narin.aliceslawyer.model.DictItemModel;
import us.narin.aliceslawyer.model.NewsItemModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class DictFragment extends Fragment {

    String targetUrl;
    Context mContext;

    public DictFragment(String targetUrl, Context mContext) {
        this.targetUrl = targetUrl;
        this.mContext = mContext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_dict, container, false);

        RecyclerView mRecyclerView = (RecyclerView)mView.findViewById(R.id.dict_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new DictItemAdapter(getDummy(), getActivity()));

        return mView;
    }

    private List<DictItemModel > getDummy(){
        List<DictItemModel> resultList = new ArrayList<>();
        resultList.add(new DictItemModel("소요죄 [騷擾罪", "다중이 집합하여 폭행 · 협박 또는 손괴행위를 함으로써 성립하는 범죄이다(형법 제115조). 사회의 평온을 그 보호법익으로 한다. 다중의 집합을 요건으로 하는 필요적 공범(필요적 공범)이며, 군집범죄(群集犯...","법률용어사전 ","2011. 1. 15. ","조회7,819","","http://terms.naver.com/entry.nhn?docId=461218&cid=42131&categoryId=42131"));
        resultList.add(new DictItemModel("집행유예 [執行猶豫, reprieve]", "집행유예(執行猶豫)란 형을 선고함에 있어서 일정한 기간 형의 집행을 유예하고 그 유예기간을 경과한 때에는 형의 선고는 효력을 잃게 되는 제도를 말한다. 이 경우에 만약 집행유예의 선고를 받은 자가 그 기간 ...","법률용어사전 ","2011. 1. 15","조회182,689","",""));
        resultList.add(new DictItemModel("우리나라 최초의 법, 8조법", "먼 옛날, 환웅이 비, 바람, 구름을 다스리는 신하와 3천 명의 무리를 데리고 하늘에서 태백산으로 내려왔어요. 환웅은 세상을 다스리다가 웅녀와 결혼하여 단군을 낳았지요. 그리고 단군은 우리나라 최초의 국가인...","재미있는 법 이야기 ","2014. 3. 21. ","조회4,282 ","http://dbscthumb.phinf.naver.net/2831_000_1/20150828120255143_6EK7VDFYH.jpg/s_gn12_9_i1.jpg?type=w627_fst&wm=N",""));
        return resultList;
    }


}
