package com.lhcm.print.imageprinter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Photo;
import com.lhcm.print.imageprinter.ui.viewholder.PhotoTempViewHolder;

import java.util.List;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class PhotoTempListAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    List<Photo> photos;


    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PhotoTempViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(photos.get(position),position);
    }

    @Override
    public int getItemCount() {
        if (photos!=null){
            return photos.size();
        }
        return 0;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
        notifyDataSetChanged();
    }
}
