package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.ProductContract;
import com.lhcm.print.imageprinter.model.ProductModelImpl;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class ProductPresenterImpl extends BasePresenterImpl<ProductContract.ProductModel,ProductContract.ProductView> implements ProductContract.ProductPresenter {
    @Override
    public ProductContract.ProductModel createModel() {
        return new ProductModelImpl();
    }
}
