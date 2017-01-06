package com.lhcm.print.imageprinter.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseFragment;
import com.lhcm.print.imageprinter.contract.PersonalContract;
import com.lhcm.print.imageprinter.helper.IntenHelper;
import com.lhcm.print.imageprinter.presenter.PersonalPresenterImpl;
import com.lhcm.print.imageprinter.ui.widget.TextItemView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class PersonalFragment extends BaseFragment<PersonalContract.PersonalPresenter> implements PersonalContract.PersonalView {
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.phoneNum)
    TextItemView phoneNum;
    @BindView(R.id.myOrders)
    TextItemView myOrders;
    @BindView(R.id.address)
    TextItemView address;
    @BindView(R.id.protocol)
    TextItemView protocol;
    @BindView(R.id.clearCache)
    TextItemView clearCache;
    @BindView(R.id.logout)
    TextView logout;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_personal;
    }

    @Override
    public PersonalContract.PersonalPresenter createPresenter() {
        return new PersonalPresenterImpl();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        title.setText("我的");
    }

    @OnClick({R.id.phoneNum, R.id.myOrders, R.id.address, R.id.protocol, R.id.clearCache, R.id.logout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.phoneNum:
                onPhoneNumClick();
                break;
            case R.id.myOrders:
                onMyOrdersClick();
                break;
            case R.id.address:
                onAddressClick();
                break;
            case R.id.protocol:
                onProtocolClick();
                break;
            case R.id.clearCache:
                onClearCacheClick();
                break;
            case R.id.logout:
                onLogoutClick();
                break;
        }
    }

    public void onPhoneNumClick(){
        IntenHelper.openQualifyPhoneNumberActivity(getContext());
    }

    public void onMyOrdersClick(){
        IntenHelper.openMyOrderActivity(getContext());
    }
    public void onAddressClick(){
        IntenHelper.openAddressListActivity(getContext());
    }
    public void onProtocolClick(){

    }
    public void onClearCacheClick(){

    }
    public void onLogoutClick(){

    }
}