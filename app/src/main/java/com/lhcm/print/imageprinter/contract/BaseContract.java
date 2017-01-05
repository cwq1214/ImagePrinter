package com.lhcm.print.imageprinter.contract;

import android.content.Context;

/**
 * Created by chenweiqi on 2017/1/3.
 */

public class BaseContract {
    public interface BaseModel {
        abstract void setContext(Context context);
    }

    public interface BaseView{
        abstract Context getContext();
    }
    public interface BasePresenter{
        abstract void setView(BaseView view);
        abstract BaseModel createModel();
        abstract void setContext(Context context);
    }
}
