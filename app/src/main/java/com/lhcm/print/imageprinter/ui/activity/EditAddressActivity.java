package com.lhcm.print.imageprinter.ui.activity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseActivity;
import com.lhcm.print.imageprinter.contract.EditAddressContract;
import com.lhcm.print.imageprinter.entity.Address;
import com.lhcm.print.imageprinter.helper.IntenHelper;
import com.lhcm.print.imageprinter.presenter.EditAddressPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class EditAddressActivity extends BaseActivity<EditAddressContract.EditAddressPresenter> implements EditAddressContract.EditAddressView {
    @BindView(R.id.inputName)
    EditText inputName;
    @BindView(R.id.inputTel)
    EditText inputTel;
    @BindView(R.id.inputAddress)
    EditText inputAddress;
    @BindView(R.id.save)
    TextView save;

    @Override
    public EditAddressContract.EditAddressPresenter createPresenter() {
        return new EditAddressPresenterImpl();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_edit_address;
    }

    @Override
    public void onViewCreated() {
        Address address = getIntent().getParcelableExtra(IntenHelper.ADDRESS);
        if (address!=null){
            inputName.setText(address.name);
            inputTel.setText(address.tel);
            inputAddress.setText(address.address);
        }
    }


    @OnClick(R.id.save)
    public void onSaveClick(){
        finish();
    }
}
