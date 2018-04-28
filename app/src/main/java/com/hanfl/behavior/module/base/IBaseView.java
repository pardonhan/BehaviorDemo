package com.hanfl.behavior.module.base;

import com.trello.rxlifecycle.LifecycleTransformer;

public interface IBaseView {

    void showLoading();

    void hideLoading();

    void showNetError();

    <T> LifecycleTransformer<T> bindToLife();

    void finishRefresh();


}
