package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.BaseContract;
import com.lhcm.print.imageprinter.model.HomeContract;
import com.lhcm.print.imageprinter.model.HomeModelImpl;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class HomePresenterImpl extends BasePresenterImpl<HomeContract.HomeModel,HomeContract.HomeView> implements HomeContract.HomePresenter {

    @Override
    public HomeContract.HomeModel createModel() {
        return new HomeModelImpl();
    }
}
