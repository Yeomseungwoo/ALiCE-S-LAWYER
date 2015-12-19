package us.narin.aliceslawyer.model.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import us.narin.aliceslawyer.R;

/**
 * Created by Seungwoo on 2015. 12. 20..
 */
public class LawyerItemViewHolder extends RecyclerView.ViewHolder{

    public TextView lawyerName;
    public TextView lawyerDescription;
    public ImageView lawyerImg;

    public LawyerItemViewHolder(View itemView) {
        super(itemView);

        lawyerName = (TextView)itemView.findViewById(R.id.lawyer_item_name);
        lawyerDescription = (TextView)itemView.findViewById(R.id.lawyer_item_description);
        lawyerImg = (ImageView)itemView.findViewById(R.id.lawyer_item_img);

    }
}
