package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.OrderListContract;
import com.lhcm.print.imageprinter.model.OrderListModelImpl;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class OrderListPresenterImpl extends BasePresenterImpl<OrderListContract.OrderListModel,OrderListContract.OrderListView> implements OrderListContract.OrderListPresenter {
    @Override
    public OrderListContract.OrderListModel createModel() {
        return new OrderListModelImpl();
    }
}
