package us.narin.aliceslawyer.model;

/**
 * Created by Seungwoo on 2015. 12. 20..
 */
public class LawyerItemModel {

    String lawyerName;
    String lawyerDescription;
    String lawyerImgUrl;
    String lawyerUrl;

    public LawyerItemModel(String lawyerName, String lawyerDescription, String lawyerImgUrl, String lawyerUrl){

        this.lawyerName = lawyerName;
        this.lawyerDescription = lawyerDescription;
        this.lawyerImgUrl = lawyerImgUrl;
        this.lawyerUrl = lawyerUrl;

    }

    public String getLawyerName() {
        return lawyerName;
    }

    public String getLawyerDescription() {
        return lawyerDescription;
    }

    public String getLawyerImgUrl() {
        return lawyerImgUrl;
    }

    public String getLawyerUrl() {
        return lawyerUrl;
    }
}
