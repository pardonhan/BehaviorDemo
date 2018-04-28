package com.hanfl.behavior.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class User implements Parcelable {

    private int age;
    private String name;
    private boolean isMale;
    public ArrayList<String> tags;

    protected User(Parcel in) {
        age = in.readInt();
        name = in.readString();
        isMale = in.readInt() == 1;
        tags = in.createStringArrayList();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(age);
        dest.writeString(name);
        dest.writeInt((isMale ? 1 : 0));
        dest.writeStringList(tags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
