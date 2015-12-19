package us.narin.aliceslawyer.model.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import us.narin.aliceslawyer.R;

/**
 * Created by Seungwoo on 2015. 12. 20..
 */
public class DictItemViewHolder extends RecyclerView.ViewHolder{

    public TextView dictTitle;
    public TextView dictDescription;
    public TextView dictCategory;
    public TextView dictDate;
    public TextView dictViewCount;
    public ImageView dictImg;

    public DictItemViewHolder(View itemView) {
        super(itemView);

        dictTitle = (TextView)itemView.findViewById(R.id.dict_item_title);
        dictDescription = (TextView)itemView.findViewById(R.id.dict_item_description);
        dictCategory = (TextView)itemView.findViewById(R.id.dict_item_category);
        dictDate = (TextView)itemView.findViewById(R.id.dict_item_date);
        dictViewCount = (TextView)itemView.findViewById(R.id.dict_item_viewcount);
        dictImg = (ImageView)itemView.findViewById(R.id.dict_item_img);

    }
}
