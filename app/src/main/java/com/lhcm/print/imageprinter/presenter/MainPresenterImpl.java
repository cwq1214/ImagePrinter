package com.lhcm.print.imageprinter.presenter;

import android.content.Context;

import com.lhcm.print.imageprinter.contract.BaseContract;
import com.lhcm.print.imageprinter.contract.MainContract;
import com.lhcm.print.imageprinter.model.MainModeImpl;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class MainPresenterImpl extends BasePresenterImpl<MainContract.MainModel,MainContract.MainView> implements MainContract.MainPresenter {


    @Override
    public MainContract.MainModel createModel() {
        return new MainModeImpl();
    }

    @Override
    public void setContext(Context context) {

    }
}
