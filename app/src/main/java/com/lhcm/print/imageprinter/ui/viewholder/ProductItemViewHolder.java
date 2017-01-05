package com.lhcm.print.imageprinter.ui.viewholder;

import android.view.View;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Product;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class ProductItemViewHolder extends BaseViewHolder<Product> {

    public ProductItemViewHolder(ViewGroup parent) {
        super(inflateView(parent,R.layout.viewholder_product_item));
    }

    @Override
    public void setData(Product data, int position) {
        super.setData(data, position);
    }
}
