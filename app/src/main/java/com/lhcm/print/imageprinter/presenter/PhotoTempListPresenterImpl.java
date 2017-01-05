package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.PhotoTempListContract;
import com.lhcm.print.imageprinter.model.PhotoTempModelImpl;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class PhotoTempListPresenterImpl extends BasePresenterImpl<PhotoTempListContract.PhotoTempListModel,PhotoTempListContract.PhotoTempListView> implements PhotoTempListContract.PhotoTempListPresenter{
    @Override
    public PhotoTempListContract.PhotoTempListModel createModel() {
        return new PhotoTempModelImpl();
    }
}
