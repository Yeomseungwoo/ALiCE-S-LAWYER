package us.narin.aliceslawyer.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import us.narin.aliceslawyer.R;
import us.narin.aliceslawyer.model.NewsItemModel;
import us.narin.aliceslawyer.model.viewholder.NewsItemViewHolder;

/**
 * Created by Seungwoo on 2015. 12. 19..
 */
public class NewsItemAdapter extends RecyclerView.Adapter<NewsItemViewHolder> {

    private List<NewsItemModel> itemModelList;
    private Context mContext;

    public NewsItemAdapter(List<NewsItemModel> itemModelList, Context mContext){
        this.itemModelList = itemModelList;
        this.mContext = mContext;

    }

    @Override
    public NewsItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_news_item, parent, false);
        return new NewsItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(NewsItemViewHolder holder, int position) {
        final NewsItemModel itemModel = itemModelList.get(position);
        holder.itemTitle.setText(itemModel.getNewsTitle());
        holder.itemSubtitle.setText(itemModel.getNewsSubtitle());
        holder.itemTime.setText(itemModel.getNewsTime());
        Glide.with(mContext).load(itemModel.getNewsImgUrl()).into(holder.itemImg);
    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }
}
