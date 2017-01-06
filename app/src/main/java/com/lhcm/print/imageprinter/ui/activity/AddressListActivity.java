package com.lhcm.print.imageprinter.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.AddressListAdapter;
import com.lhcm.print.imageprinter.annotation.ActivityAnnotation;
import com.lhcm.print.imageprinter.base.BaseActivity;
import com.lhcm.print.imageprinter.contract.AddressListContract;
import com.lhcm.print.imageprinter.entity.Address;
import com.lhcm.print.imageprinter.helper.IntenHelper;
import com.lhcm.print.imageprinter.itemDecoration.RecycleViewDivider;
import com.lhcm.print.imageprinter.presenter.AddressListPresenterImpl;
import com.lhcm.print.imageprinter.ui.viewholder.AddressListItemViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenweiqi on 2017/1/5.
 */
@ActivityAnnotation(title = "地址",showBack = true)
public class AddressListActivity extends BaseActivity<AddressListContract.AddressListPresenter> implements AddressListContract.AddressListView {

    AddressListAdapter adapter;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.addAddress)
    TextView addAddress;

    @Override
    public AddressListContract.AddressListPresenter createPresenter() {
        return new AddressListPresenterImpl();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_address_list;
    }

    @Override
    public void onViewCreated() {
        adapter = new AddressListAdapter();

        adapter.setOnEditAddressClickListener(new AddressListItemViewHolder.OnEditAddressClickListener() {
            @Override
            public void onClick(Address address, int position) {
                IntenHelper.openEditAddressActivity(getContext(),address);
            }
        });
        //TODO 删除 选择地址


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecycleViewDivider(getContext(),LinearLayoutManager.VERTICAL,1,getResources().getColor(R.color.dividerColor)));


        List<Address> addresses = new ArrayList<>();
        for (int i=0;i<10;i++){
            addresses.add(new Address());
        }
        adapter.setAddresses(addresses);
    }


    @OnClick(R.id.addAddress)
    public void onAddressClick(){
        IntenHelper.openAddAddressActivity(getContext());
    }

}
