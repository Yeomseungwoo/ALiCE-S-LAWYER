package us.narin.aliceslawyer.util;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import us.narin.aliceslawyer.model.NewsItemModel;

/**
 * Created by Seungwoo on 2015. 12. 20..
 */
public class NewsTask extends AsyncTask<Void, Void, Void>{

    public ProgressBar mProgressBar;
    List<NewsItemModel> newsItemModels = new ArrayList<>();

    public NewsTask(ProgressBar mProgressBar, List<NewsItemModel> newsItemModels){
        this.mProgressBar = mProgressBar;
        this.newsItemModels = newsItemModels;
    }

    @Override
    protected void onPreExecute(){
        super.onPreExecute();
        mProgressBar.setVisibility(View.VISIBLE);
        mProgressBar.setProgress(10);
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            Document document = Jsoup.connect(Schema.NEWS_ENDPOINT + "?kind=AA").get();
            Elements elements = document.select("div.article-txt");

            for (Element element : elements){
                newsItemModels.add(new NewsItemModel(element.text(),"","","",""));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void params){
        super.onPostExecute(params);
        mProgressBar.setVisibility(View.GONE);

    }
}
