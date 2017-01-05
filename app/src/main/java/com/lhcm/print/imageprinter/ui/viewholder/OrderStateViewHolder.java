package com.lhcm.print.imageprinter.ui.viewholder;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Order;

import butterknife.BindView;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class OrderStateViewHolder extends BaseViewHolder<Order> {
    @BindView(R.id.orderId)
    TextView orderId;
    @BindView(R.id.state)
    TextView state;
    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.nPrice)
    TextView nPrice;
    @BindView(R.id.pages)
    TextView pages;
    @BindView(R.id.oPrice)
    TextView oPrice;
    @BindView(R.id.count)
    TextView count;
    @BindView(R.id.total)
    TextView total;

    public OrderStateViewHolder(ViewGroup parent) {
        super(inflateView(parent, R.layout.viewholder_order_state));
    }

    @Override
    public void setData(Order data, int position) {
        super.setData(data, position);
        oPrice.getPaint().setAntiAlias(true);//抗锯齿
        oPrice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);
    }
}
