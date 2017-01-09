package com.lhcm.print.imageprinter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.LocalMediaFolder;
import com.lhcm.print.imageprinter.ui.viewholder.FolderThumbViewHolder;

import java.util.List;

/**
 * Created by chenweiqi on 2017/1/9.
 */

public class ImageFolderAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    List<LocalMediaFolder> folderList ;

    BaseViewHolder.OnViewHolderClickListener onViewHolderClickListener;

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        FolderThumbViewHolder holder= new FolderThumbViewHolder(parent);
        holder.setOnViewHolderClickListener(onViewHolderClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(folderList.get(position),position);
    }

    @Override
    public int getItemCount() {
        if (folderList!=null)
            return folderList.size();
        return 0;
    }

    public void setFolderList(List<LocalMediaFolder> folderList) {
        this.folderList = folderList;
    }

    public void setOnViewHolderClickListener(BaseViewHolder.OnViewHolderClickListener onViewHolderClickListener) {
        this.onViewHolderClickListener = onViewHolderClickListener;
    }
}
