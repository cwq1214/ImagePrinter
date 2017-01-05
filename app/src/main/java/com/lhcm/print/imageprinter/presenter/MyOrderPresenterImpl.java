package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.MyOrderContract;
import com.lhcm.print.imageprinter.model.MyOrderModelImpl;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class MyOrderPresenterImpl extends BasePresenterImpl<MyOrderContract.MyOrderModel,MyOrderContract.MyOrderView> implements MyOrderContract.MyOrderPresenter {
    @Override
    public MyOrderContract.MyOrderModel createModel() {
        return new MyOrderModelImpl();
    }
}
