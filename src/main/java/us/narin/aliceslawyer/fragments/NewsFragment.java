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
import java.util.Collections;
import java.util.List;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.adapter.NewsItemAdapter;
import us.narin.aliceslawyer.model.NewsItemModel;

public class NewsFragment extends Fragment {

    String targetUrl;
    Context mContext;

    public NewsFragment(String targetUrl, Context mContext) {
        this.targetUrl = targetUrl;
        this.mContext = mContext;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_news, container, false);

        RecyclerView mRecyclerView = (RecyclerView) mView.findViewById(R.id.news_rv);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new NewsItemAdapter(getDummy(), getActivity()));

        return mView;
    }

    private List<NewsItemModel> getDummy() {
        List<NewsItemModel> resultList = new ArrayList<>();
        resultList.add(new NewsItemModel("판사들 TV 직접 출연 기업회생제도 소개", "창원지법, '사랑법원 캠페인 방송 2편' 송출 시작", "2015-12-18 오전 11:44:50", "https://image.lawtimes.co.kr/images/97483.jpg", "https://www.lawtimes.co.kr/Legal-News/Legal-News-View?Serial=97483&kind=AA&key="));
        resultList.add(new NewsItemModel("신격호 회장 여동생, 법원에 신 회장 성년후견인 지정 신청", "신격호(94) 롯데그룹 총괄회장의 여동생이 오빠인 신 총괄회장에게", "2015-12-18 오후 4:48:57", "",""));
        resultList.add(new NewsItemModel("북한 이탈 주민 사법적 지원방안 마련해야", "사법정책연구원, 세미나", "2015-12-17 오후 6:27:55","https://image.lawtimes.co.kr/images/97385.jpg", ""));
        resultList.add(new NewsItemModel("가사합의사건 訴價상향에 반대", "변협, 대법원에 의견서 전달", " 2015-12-17 오후 6:00:30", "https://image.lawtimes.co.kr/images/97421.jpg", ""));
        resultList.add(new NewsItemModel("남편 만나려 종교까지 바꿨지만 버림받아…", "법원, 스리랑카 여성 난민 인정", "2015-12-17 오후 5:35:49", "https://image.lawtimes.co.kr/images/96987.jpg", ""));
        resultList.add(new NewsItemModel("불기소 처분 피의자가 낸 사건기록 열람·등사 신청", "서울고법 \"검찰규칙은 정보공개법상 위임명령 아냐\"", "2015-12-17 오후 5:02:51", "https://image.lawtimes.co.kr/images/97363.jpg",""));
        resultList.add(new NewsItemModel("삼성家' 이부진-임우재 부부 이혼소송 내달 14일 선고", "지난해 10월부터 1년 넘게 진행되고 있는 이건희 삼성그룹 회장의 장녀 이부진(45) 호텔신라 사장과 임우재(47) 삼성전기 상임고문간의 이혼소송이 내년 1월 마무리된다.", "2015-12-17 오후 3:40:24", "", ""));
        resultList.add(new NewsItemModel("[판결] 대법원, '일시적 도로점거 집회' 잇따라 유죄 판결", "집회 참가자가 잠깐 동안 도로를 점거해 일시적으로 교통을 방해했더라도 일반교통방해죄로 처벌해야 한다는 대법원 판결이 잇따라 나왔다.", "2015-12-17 오전 9:00:00", "https://image.lawtimes.co.kr/images/97390.jpg",""));
        resultList.add(new NewsItemModel("전국 법원 이달 말부터 2주간 동계 휴정", "전국 법원이 이달 말부터 동계 휴정에 들어간다.", "2015-12-16 오후 5:57:22", "https://image.lawtimes.co.kr/images/97389-1.jpg",""));

        Collections.shuffle(resultList);
        return resultList;
    }
}
