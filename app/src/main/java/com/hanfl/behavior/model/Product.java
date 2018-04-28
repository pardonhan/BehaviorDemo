package com.hanfl.behavior.model;

import android.util.Log;

import javax.inject.Inject;

public class Product {
    //private static final String TAG = Product.class.getCanonicalName();

    @Inject
    public Product() {

    }

    public void run() {
        Log.d("", "run: " + "111111");
    }
}
