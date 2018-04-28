package com.hanfl.behavior.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class ImgExtraData implements Parcelable {
    private String imgsrc;

    protected ImgExtraData(Parcel in) {
        imgsrc = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imgsrc);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ImgExtraData> CREATOR = new Creator<ImgExtraData>() {
        @Override
        public ImgExtraData createFromParcel(Parcel in) {
            return new ImgExtraData(in);
        }

        @Override
        public ImgExtraData[] newArray(int size) {
            return new ImgExtraData[size];
        }
    };
}
