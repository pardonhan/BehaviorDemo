package com.hanfl.behavior.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class AdData implements Parcelable {

    private String title;
    private String tag;
    private String imgsrc;
    private String subtitle;
    private String url;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.tag);
        dest.writeString(this.imgsrc);
        dest.writeString(this.subtitle);
        dest.writeString(this.url);
    }

    public AdData() {
    }

    protected AdData(Parcel in) {
        this.title = in.readString();
        this.tag = in.readString();
        this.imgsrc = in.readString();
        this.subtitle = in.readString();
        this.url = in.readString();
    }

    public static final Parcelable.Creator<AdData> CREATOR = new Parcelable.Creator<AdData>() {
        @Override
        public AdData createFromParcel(Parcel source) {
            return new AdData(source);
        }

        @Override
        public AdData[] newArray(int size) {
            return new AdData[size];
        }
    };
}
