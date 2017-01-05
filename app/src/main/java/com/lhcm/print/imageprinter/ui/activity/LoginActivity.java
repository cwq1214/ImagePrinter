package com.lhcm.print.imageprinter.ui.activity;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseActivity;
import com.lhcm.print.imageprinter.contract.LoginContract;
import com.lhcm.print.imageprinter.presenter.LoginPresenterImpl;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class LoginActivity extends BaseActivity<LoginContract.LoginPresenter> implements LoginContract.LoginView {
    @Override
    public LoginContract.LoginPresenter createPresenter() {
        return new LoginPresenterImpl();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onViewCreated() {

    }
}
