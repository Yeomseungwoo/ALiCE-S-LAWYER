package us.narin.aliceslawyer.model.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import us.narin.aliceslawyer.R;

/**
 * Created by Seungwoo on 2015. 12. 19..
 */
public class NewsItemViewHolder extends RecyclerView.ViewHolder {

    public TextView itemTitle;
    public TextView itemSubtitle;
    public TextView itemTime;
    public ImageView itemImg;

    public NewsItemViewHolder(View itemView) {
        super(itemView);

        itemTitle = (TextView) itemView.findViewById(R.id.news_item_title);
        itemSubtitle = (TextView) itemView.findViewById(R.id.news_item_subtitle);
        itemTime = (TextView) itemView.findViewById(R.id.news_item_time);
        itemImg = (ImageView) itemView.findViewById(R.id.news_item_img);

    }
}
