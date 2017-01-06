package com.lhcm.print.imageprinter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Address;
import com.lhcm.print.imageprinter.ui.viewholder.AddressListItemViewHolder;

import java.util.List;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class AddressListAdapter extends RecyclerView.Adapter<BaseViewHolder<Address>> {

    List<Address> addresses;

    AddressListItemViewHolder.OnDeleteAddressClickListener onDeleteAddressClickListener;
    AddressListItemViewHolder.OnEditAddressClickListener onEditAddressClickListener;
    AddressListItemViewHolder.OnViewHolderClickListener onViewHolderClickListener;

    @Override
    public BaseViewHolder<Address> onCreateViewHolder(ViewGroup parent, int viewType) {
        AddressListItemViewHolder holder = new AddressListItemViewHolder(parent);
        holder.setOnDeleteAddressClickListener(onDeleteAddressClickListener);
        holder.setOnViewHolderClickListener(onViewHolderClickListener);
        holder.setOnEditAddressClickListener(onEditAddressClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder<Address> holder, int position) {
        holder.setData(addresses.get(position),position);
    }

    @Override
    public int getItemCount() {
        if (addresses!=null){
            return addresses.size();
        }
        return 0;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setOnDeleteAddressClickListener(AddressListItemViewHolder.OnDeleteAddressClickListener onDeleteAddressClickListener) {
        this.onDeleteAddressClickListener = onDeleteAddressClickListener;
    }

    public void setOnEditAddressClickListener(AddressListItemViewHolder.OnEditAddressClickListener onEditAddressClickListener) {
        this.onEditAddressClickListener = onEditAddressClickListener;
    }

    public void setOnViewHolderClickListener(AddressListItemViewHolder.OnViewHolderClickListener onViewHolderClickListener) {
        this.onViewHolderClickListener = onViewHolderClickListener;
    }
}
