package com.lhcm.print.imageprinter.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class Address implements Parcelable {
    public String id;
    public String tel;
    public String name;
    public String address;

    public Address() {
    }

    protected Address(Parcel in) {
        id = in.readString();
        tel = in.readString();
        name = in.readString();
        address = in.readString();
    }

    public static final Creator<Address> CREATOR = new Creator<Address>() {
        @Override
        public Address createFromParcel(Parcel in) {
            return new Address(in);
        }

        @Override
        public Address[] newArray(int size) {
            return new Address[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(tel);
        dest.writeString(name);
        dest.writeString(address);
    }
}
