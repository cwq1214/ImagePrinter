package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.EditAddressContract;
import com.lhcm.print.imageprinter.model.EditAddressModelImpl;

/**
 * Created by chenweiqi on 2017/1/6.
 */

public class EditAddressPresenterImpl extends BasePresenterImpl<EditAddressContract.EditAddressModel,EditAddressContract.EditAddressView> implements EditAddressContract.EditAddressPresenter{
    @Override
    public EditAddressContract.EditAddressModel createModel() {
        return new EditAddressModelImpl();
    }
}
