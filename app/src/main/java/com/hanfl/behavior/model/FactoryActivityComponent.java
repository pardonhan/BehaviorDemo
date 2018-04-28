package com.hanfl.behavior.model;

import com.hanfl.behavior.ui.FactoryActivity;

import dagger.Component;

@Component(modules = A01SimpleModule.class)
public interface FactoryActivityComponent {
    void inject(FactoryActivity factoryActivity);
}
