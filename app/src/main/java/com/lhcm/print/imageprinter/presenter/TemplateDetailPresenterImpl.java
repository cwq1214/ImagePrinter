package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.TemplateDetailContract;
import com.lhcm.print.imageprinter.model.TemplateDetailModelImpl;
import com.lhcm.print.imageprinter.util.T;

/**
 * Created by chenweiqi on 2017/1/6.
 */

public class TemplateDetailPresenterImpl extends BasePresenterImpl<TemplateDetailContract.TemplateDetailModel,TemplateDetailContract.TemplateDetailView> implements TemplateDetailContract.TemplateDetailPresenter{

    @Override
    public TemplateDetailContract.TemplateDetailModel createModel() {
        return new TemplateDetailModelImpl();
    }
}
