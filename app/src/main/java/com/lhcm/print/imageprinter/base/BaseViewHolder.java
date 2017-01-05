package com.lhcm.print.imageprinter.base;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    protected static int layoutId;
    protected T data;
    protected int position;

    OnViewHolderClickListener onViewHolderClickListener;



    public BaseViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onViewHolderClickListener!=null){
                    onViewHolderClickListener.onClick(data,position);
                }
            }
        });
        ButterKnife.bind(this,itemView);
    }


    public void setData(T data,int position){
        this.data = data;
        this.position = position;
    }

    public void setOnViewHolderClickListener(OnViewHolderClickListener onViewHolderClickListener) {
        this.onViewHolderClickListener = onViewHolderClickListener;
    }

    public static View inflateView(ViewGroup parent,int layoutId){
        return LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false);
    }


    public interface OnViewHolderClickListener{
        void onClick(Object data,int position);
    }
}
