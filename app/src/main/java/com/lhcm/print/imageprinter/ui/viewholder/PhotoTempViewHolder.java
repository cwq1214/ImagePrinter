package com.lhcm.print.imageprinter.ui.viewholder;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Photo;

import butterknife.BindView;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class PhotoTempViewHolder extends BaseViewHolder<Photo> {

    protected static int layoutId = R.layout.viewholder_photo_temp;
    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.oPrice)
    TextView oPrice;
    @BindView(R.id.pages)
    TextView pages;
    @BindView(R.id.nPrice)
    TextView nPrice;

    public PhotoTempViewHolder(ViewGroup parent) {
        super(inflateView(parent, layoutId));
    }

    @Override
    public void setData(Photo data, int position) {
        super.setData(data, position);

        oPrice.getPaint().setAntiAlias(true);//抗锯齿
        oPrice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);
    }
}
