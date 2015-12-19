package us.narin.aliceslawyer.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.model.DictItemModel;
import us.narin.aliceslawyer.model.viewholder.DictItemViewHolder;

/**
 * Created by Seungwoo on 2015. 12. 20..
 */
public class DictItemAdapter extends RecyclerView.Adapter<DictItemViewHolder> {

    List<DictItemModel> modelList = new ArrayList<>();
    Context mContext;

    public DictItemAdapter(List<DictItemModel> modelList, Context mContext) {
        this.modelList = modelList;
        this.mContext = mContext;
    }


    @Override
    public DictItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_dict_item, parent, false);
        return new DictItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(DictItemViewHolder holder, int position) {

        DictItemModel dictItemModel = modelList.get(position);
        holder.dictTitle.setText(dictItemModel.getDictTitle());
        holder.dictDescription.setText(dictItemModel.getDictDescription());
        holder.dictCategory.setText(dictItemModel.getDictCategory());
        holder.dictDate.setText(dictItemModel.getDictDate());
        if (!dictItemModel.getDictImg().isEmpty())
            Glide.with(mContext).load(dictItemModel.getDictImg()).into(holder.dictImg);
        else holder.dictImg.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
