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
import java.util.Collections;
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
        resultList.add(new DictItemModel("직계비속 [直系卑屬]","직계존속에 상대되는 개념으로, 자 · 손과 같이 본인으로부터 출산된 친족의 호칭을 말한다. 직계비속에 대하여는 다음과 같은 효과가 인정된다. 즉 (1)미성년의 직계비속에 대하여는 친권상의 권리 · 의무가 있...","법률용어사전 ","2011. 1. 15.","조회141,983 ","",""));
        resultList.add(new DictItemModel("직계존속 [直系尊屬]", "직계비속에 상대되는 개념으로, 부모 · 조부모와 같이 본인을 출산하도록 한 친족을 말한다. 직계존속에 대하여서는 다음과 같은 효과가 인정된다. 민법상 (1)부부나 양친자의 일방이 타방의 직계존속에 대하여 가...","법률용어사전","2011. 1. 15.","조회99,020","",""));
        resultList.add(new DictItemModel("기소 [起訴]", "기소(起訴)란 검사가 일정한 형사사건에 대하여 법원의 심판을 구하는 행위를 말한다. 이를 공소의 제기라고도 한다. 과거 유럽에서는 사소(私訴)라고 하여 사인이 기소하는 것을 인정한 때도 있었으나, 현재는 검...","법률용어사전","2011. 1. 15","조회185,963 ","",""));
        resultList.add(new DictItemModel("미필적 고의 [未必的 故意]", "미필적 고의란 범죄사실이 발생할 가능성을 인식하고 또 이를 인용하는 것을 말하며 조건부 고의(條件附 故意)라고도 한다. 예를 들어 엽총으로 조류를 쏘는 경우에 자칫하면 주위의 사람에게 맞을 지도 모른다고 생...", "법률용어사전", "2011. 1. 15. ","조회216,635", "", ""));
        resultList.add(new DictItemModel("별난 법, 재미있는 법", "세상에는 우리가 전혀 상상하지 못한 엉뚱하고 재미있는 법들이 있어요. 이 법들에 대해 알아볼까요? 돼지 이름, 나폴레옹 절대 안 돼요! 돼지의 이름을 지을 때에도 법을 따라야 한다고요? 프랑스에서는 돼지의 ...","재미있는 법 이야기 ","2014. 3. 21.","조회18,272","http://dbscthumb.phinf.naver.net/2831_000_1/20150828121800249_6GI4D2NEV.jpg/s_gn12_62_i2.jpg?type=w300_fst_n&wm=Y",""));

        Collections.shuffle(resultList);
        return resultList;
    }


}
