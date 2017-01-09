package com.lhcm.print.imageprinter.ui.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.LocalMedia;
import com.lhcm.print.imageprinter.util.DensityUtil;
import com.lhcm.print.imageprinter.util.ScreenUtils;

import butterknife.BindView;

/**
 * Created by chenweiqi on 2017/1/9.
 */

public class ImageThumbViewHolder extends BaseViewHolder<LocalMedia> {
    @BindView(R.id.imageThumb)
    ImageView imageThumb;
    @BindView(R.id.state)
    ImageView state;

    OnCheckImageClickListener onCheckImageClickListener;
    public ImageThumbViewHolder(ViewGroup itemView) {
        super(inflateView(itemView, R.layout.viewholder_image_thumb));


        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckImageClickListener!=null);
                onCheckImageClickListener.onClick(data,position);
            }
        });

        int width = ScreenUtils.getScreenWidth(itemView.getContext())/3- DensityUtil.dpToPx(itemView.getContext(),2);
        imageThumb.setLayoutParams(new FrameLayout.LayoutParams(width,width));
    }

    @Override
    public void setData(LocalMedia data, int position) {
        super.setData(data, position);

        Glide.with(itemView.getContext()).load(data.getPath()).into(imageThumb);

        if (data.isChecked()){
            state.setBackgroundDrawable(itemView.getResources().getDrawable(R.mipmap.round_check));
        }else {
            state.setBackgroundDrawable(itemView.getResources().getDrawable(R.drawable.shape_circle));

        }
    }

    public void setOnCheckImageClickListener(OnCheckImageClickListener onCheckImageClickListener) {
        this.onCheckImageClickListener = onCheckImageClickListener;
    }

    public interface OnCheckImageClickListener {
        void onClick(LocalMedia data,int position);
    }
}
