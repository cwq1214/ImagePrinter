package com.lhcm.print.imageprinter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Order;
import com.lhcm.print.imageprinter.ui.viewholder.OrderStateViewHolder;

import java.util.List;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class OrderStateAdapater extends RecyclerView.Adapter<BaseViewHolder<Order>> {
    List<Order> orders;

    @Override
    public BaseViewHolder<Order> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OrderStateViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder<Order> holder, int position) {
        holder.setData(orders.get(position),position);
    }

    @Override
    public int getItemCount() {
        if (orders!=null){
            return orders.size();
        }
        return 0;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
