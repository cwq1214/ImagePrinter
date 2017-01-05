package com.lhcm.print.imageprinter.presenter;

import com.lhcm.print.imageprinter.contract.BaseContract;
import com.lhcm.print.imageprinter.contract.PersonalContract;
import com.lhcm.print.imageprinter.model.PersonalModelImpl;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class PersonalPresenterImpl extends BasePresenterImpl<PersonalContract.PersonalModel,PersonalContract.PersonalView> implements PersonalContract.PersonalPresenter {

    @Override
    public PersonalContract.PersonalModel createModel() {
        return new PersonalModelImpl();
    }
}
