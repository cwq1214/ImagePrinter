package com.lhcm.print.imageprinter.ui.viewholder;

import android.view.View;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.Address;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class AddressListItemViewHolder extends BaseViewHolder<Address> {
    public AddressListItemViewHolder(ViewGroup parent) {
        super(inflateView(parent, R.layout.viewholder_address_list_item));
    }
}
