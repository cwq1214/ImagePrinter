package com.lhcm.print.imageprinter.ui.activity;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.annotation.ActivityAnnotation;
import com.lhcm.print.imageprinter.base.BaseActivity;
import com.lhcm.print.imageprinter.contract.QualifyPhoneNumberContract;
import com.lhcm.print.imageprinter.presenter.QualifyPhoneNumberPresenterImpl;

/**
 * Created by chenweiqi on 2017/1/5.
 */

@ActivityAnnotation(title = "手机验证",showBack = true)
public class QualifyPhoneNumberActivity extends BaseActivity<QualifyPhoneNumberContract.QualifyPhoneNumberPresenter> implements QualifyPhoneNumberContract.QualifyPhoneNumberView {
    @Override
    public QualifyPhoneNumberContract.QualifyPhoneNumberPresenter createPresenter() {
        return new QualifyPhoneNumberPresenterImpl();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_qualify_phone_number;
    }

    @Override
    public void onViewCreated() {

    }
}
