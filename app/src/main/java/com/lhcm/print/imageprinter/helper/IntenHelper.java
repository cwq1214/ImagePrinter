package com.lhcm.print.imageprinter.helper;

import android.content.Context;
import android.content.Intent;

import com.lhcm.print.imageprinter.entity.Address;
import com.lhcm.print.imageprinter.ui.activity.AddressListActivity;
import com.lhcm.print.imageprinter.ui.activity.EditAddressActivity;
import com.lhcm.print.imageprinter.ui.activity.MyOrderActivity;
import com.lhcm.print.imageprinter.ui.activity.QualifyPhoneNumberActivity;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class IntenHelper {

    public static final String ADDRESS = "ADDRESS";


    public static void openAddressListActivity(Context context){
        context.startActivity(getIntent(context, AddressListActivity.class));
    }

    public static void openQualifyPhoneNumberActivity(Context context){
        context.startActivity(getIntent(context, QualifyPhoneNumberActivity.class));
    }

    public static void openMyOrderActivity(Context context){
        context.startActivity(getIntent(context, MyOrderActivity.class));
    }

    public static void openEditAddressActivity(Context context, Address address){
        Intent intent = getIntent(context, EditAddressActivity.class);
        intent.putExtra(ADDRESS,address);
        context.startActivity(intent);
    }

    public static void openAddAddressActivity(Context context){
        Intent intent = getIntent(context, EditAddressActivity.class);
        context.startActivity(intent);
    }


    private static Intent getIntent(Context context,Class aclass){
        Intent intent = new Intent(context,aclass);
        return intent;
    }
}
