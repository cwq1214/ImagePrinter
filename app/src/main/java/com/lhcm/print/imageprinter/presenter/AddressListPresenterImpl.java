package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.AddressListContract;
import com.lhcm.print.imageprinter.contract.BaseContract;
import com.lhcm.print.imageprinter.model.AddressListModelImpl;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class AddressListPresenterImpl extends BasePresenterImpl<AddressListContract.AddressListModel,AddressListContract.AddressListView> implements AddressListContract.AddressListPresenter {

    @Override
    public AddressListContract.AddressListModel createModel() {
        return new AddressListModelImpl();
    }
}
