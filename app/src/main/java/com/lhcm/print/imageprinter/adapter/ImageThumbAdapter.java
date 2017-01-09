package com.lhcm.print.imageprinter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.LocalMedia;
import com.lhcm.print.imageprinter.ui.viewholder.ImageThumbViewHolder;

import java.util.List;

/**
 * Created by chenweiqi on 2017/1/9.
 */

public class ImageThumbAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    BaseViewHolder.OnViewHolderClickListener onViewHolderClickListener;
    ImageThumbViewHolder.OnCheckImageClickListener onCheckImageClickListener;
    List<LocalMedia> localMedias;

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ImageThumbViewHolder holder = new ImageThumbViewHolder(parent);
        holder.setOnViewHolderClickListener(onViewHolderClickListener);
        holder.setOnCheckImageClickListener(onCheckImageClickListener);
        return  holder;

    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(localMedias.get(position),position);
    }

    @Override
    public int getItemCount() {
        if (localMedias!=null){
            return localMedias.size();
        }
        return 0;
    }

    public void setOnViewHolderClickListener(BaseViewHolder.OnViewHolderClickListener onViewHolderClickListener) {
        this.onViewHolderClickListener = onViewHolderClickListener;
    }

    public void setLocalMedias(List<LocalMedia> localMedias) {
        this.localMedias = localMedias;
    }

    public void setOnCheckImageClickListener(ImageThumbViewHolder.OnCheckImageClickListener onCheckImageClickListener) {
        this.onCheckImageClickListener = onCheckImageClickListener;
    }
}
