package us.narin.aliceslawyer.model;

/**
 * Created by Seungwoo on 2015. 12. 19..
 */
public class NewsItemModel {
    String newsTitle;
    String newsSubtitle;
    String newsTime;
    String newsImgUrl;
    String newsUrl;

    public NewsItemModel(String newsTitle, String newsSubtitle, String newsTime, String newsImgUrl, String newsUrl){
        this.newsTitle = newsTitle;
        this.newsSubtitle = newsSubtitle;
        this.newsTime = newsTime;
        this.newsImgUrl = newsImgUrl;
        this.newsUrl = newsUrl;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsSubtitle() {
        return newsSubtitle;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public String getNewsImgUrl() {
        return newsImgUrl;
    }

    public String getNewsUrl() {
        return newsUrl;
    }
}
