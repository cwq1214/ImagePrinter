package com.lhcm.print.imageprinter.helper;

import android.content.Context;
import android.content.Intent;

import com.lhcm.print.imageprinter.ui.activity.AddressListActivity;
import com.lhcm.print.imageprinter.ui.activity.MyOrderActivity;
import com.lhcm.print.imageprinter.ui.activity.QualifyPhoneNumberActivity;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class IntenHelper {

    public static void openAddressListActivity(Context context){
        context.startActivity(getIntent(context, AddressListActivity.class));
    }

    public static void openQualifyPhoneNumberActivity(Context context){
        context.startActivity(getIntent(context, QualifyPhoneNumberActivity.class));
    }

    public static void openMyOrderActivity(Context context){
        context.startActivity(getIntent(context, MyOrderActivity.class));
    }


    private static Intent getIntent(Context context,Class aclass){
        Intent intent = new Intent(context,aclass);
        return intent;
    }
}
