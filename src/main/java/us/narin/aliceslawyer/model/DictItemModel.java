package us.narin.aliceslawyer.model;

/**
 * Created by Seungwoo on 2015. 12. 20..
 */
public class DictItemModel {

    String dictTitle;
    String dictDescription;
    String dictCategory;
    String dictDate;
    String dictViewCount;
    String dictImg;
    String dictUrl;

    public DictItemModel(String dictTitle, String dictDescription, String dictCategory, String dictDate, String dictViewCount, String dictImg, String dictUrl){
        this.dictTitle = dictTitle;
        this.dictDescription = dictDescription;
        this.dictCategory = dictCategory;
        this.dictDate = dictDate;
        this.dictViewCount = dictViewCount;
        this.dictImg = dictImg;
        this.dictUrl = dictUrl;

    }

    public String getDictTitle() {
        return dictTitle;
    }

    public String getDictDescription() {
        return dictDescription;
    }

    public String getDictCategory() {
        return dictCategory;
    }

    public String getDictDate() {
        return dictDate;
    }

    public String getDictViewCount() {
        return dictViewCount;
    }

    public String getDictImg() {
        return dictImg;
    }

    public String getDictUrl() {
        return dictUrl;
    }
}
