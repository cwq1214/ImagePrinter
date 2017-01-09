package com.lhcm.print.imageprinter.ui.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Address;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class AddressListItemViewHolder extends BaseViewHolder<Address> {
    OnEditAddressClickListener onEditAddressClickListener;
    OnDeleteAddressClickListener onDeleteAddressClickListener;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.phoneNum)
    TextView phoneNum;
    @BindView(R.id.address)
    TextView address;

    public AddressListItemViewHolder(ViewGroup parent) {
        super(inflateView(parent, R.layout.viewholder_address_list_item));


    }

    @OnClick(R.id.edit)
    public void onEditClick(){
        if (onEditAddressClickListener!=null)
            onEditAddressClickListener.onClick(data,position);
    }

    @OnClick(R.id.delete)
    public void onDeleteClick(){
        if (onDeleteAddressClickListener!=null)
            onDeleteAddressClickListener.onClick(data,position);
    }


    @Override
    public void setData(Address data, int position) {
        super.setData(data, position);


    }

    public void setOnEditAddressClickListener(OnEditAddressClickListener onEditAddressClickListener) {
        this.onEditAddressClickListener = onEditAddressClickListener;
    }

    public void setOnDeleteAddressClickListener(OnDeleteAddressClickListener onDeleteAddressClickListener) {
        this.onDeleteAddressClickListener = onDeleteAddressClickListener;
    }

    public interface OnEditAddressClickListener {
        void onClick(Address address, int position);
    }

    public interface OnDeleteAddressClickListener {
        void onClick(Address address, int position);
    }
}
