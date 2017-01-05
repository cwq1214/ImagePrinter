package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.LoginContract;
import com.lhcm.print.imageprinter.model.LoginModelImpl;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class LoginPresenterImpl extends BasePresenterImpl<LoginContract.LoginModel,LoginContract.LoginView> implements LoginContract.LoginPresenter {
    @Override
    public LoginContract.LoginModel createModel() {
        return new LoginModelImpl();
    }
}
