package us.narin.aliceslawyer.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import java.util.ArrayList;
import java.util.List;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.model.DictItemModel;
import us.narin.aliceslawyer.model.LawyerItemModel;
import us.narin.aliceslawyer.model.viewholder.DictItemViewHolder;
import us.narin.aliceslawyer.model.viewholder.LawyerItemViewHolder;

/**
 * Created by Seungwoo on 2015. 12. 20..
 */
public class LawyerItemAdapter extends RecyclerView.Adapter<LawyerItemViewHolder> {

    List<LawyerItemModel> modelList = new ArrayList<>();
    Context mContext;

    public LawyerItemAdapter(List<LawyerItemModel> modelList, Context mContext) {
        this.modelList = modelList;
        this.mContext = mContext;
    }


    @Override
    public LawyerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_lawyer_item, parent, false);
        return new LawyerItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final LawyerItemViewHolder holder, int position) {

        LawyerItemModel lawyerItemModel = modelList.get(position);
        holder.lawyerName.setText(lawyerItemModel.getLawyerName());
        holder.lawyerDescription.setText(lawyerItemModel.getLawyerDescription());
        if (!lawyerItemModel.getLawyerImgUrl().isEmpty()) {
            Glide.with(mContext).load(lawyerItemModel.getLawyerImgUrl()).asBitmap().centerCrop().into(new BitmapImageViewTarget(holder.lawyerImg) {
                @Override
                public void setResource(Bitmap resource) {
                    RoundedBitmapDrawable circularBitmapDrawable =
                            RoundedBitmapDrawableFactory.create(mContext.getResources(), resource);
                    circularBitmapDrawable.setCircular(true);
                    holder.lawyerImg.setImageDrawable(circularBitmapDrawable);
                }
            });
        } else holder.lawyerImg.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
