package com.lhcm.print.imageprinter.model;

import android.content.Context;

import com.lhcm.print.imageprinter.contract.BaseContract;


/**
 * Created by v7 on 2016/12/22.
 */

public class BaseModelImpl implements BaseContract.BaseModel{
    private Context context;
    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
