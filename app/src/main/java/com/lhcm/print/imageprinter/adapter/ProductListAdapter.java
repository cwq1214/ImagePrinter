package com.lhcm.print.imageprinter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Product;
import com.lhcm.print.imageprinter.ui.viewholder.ProductItemViewHolder;

import java.util.List;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class ProductListAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    List<Product> products;

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductItemViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(products.get(position),position);
    }

    @Override
    public int getItemCount() {
        if (products!=null){
            return products.size();
        }
        return 0;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
