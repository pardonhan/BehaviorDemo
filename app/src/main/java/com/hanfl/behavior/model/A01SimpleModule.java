package com.hanfl.behavior.model;

import com.hanfl.behavior.ui.FactoryActivity;

import dagger.Module;

@Module
public class A01SimpleModule {

    private FactoryActivity activity;

    public A01SimpleModule(FactoryActivity activity){
        this.activity = activity;
    }
}
