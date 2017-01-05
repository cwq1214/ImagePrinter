package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.QualifyPhoneNumberContract;
import com.lhcm.print.imageprinter.model.QualifyPhoneNumberModelImpl;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class QualifyPhoneNumberPresenterImpl extends BasePresenterImpl<QualifyPhoneNumberContract.QualifyPhoneNumberModel,QualifyPhoneNumberContract.QualifyPhoneNumberView> implements QualifyPhoneNumberContract.QualifyPhoneNumberPresenter {
    @Override
    public QualifyPhoneNumberContract.QualifyPhoneNumberModel createModel() {
        return new QualifyPhoneNumberModelImpl();
    }
}
