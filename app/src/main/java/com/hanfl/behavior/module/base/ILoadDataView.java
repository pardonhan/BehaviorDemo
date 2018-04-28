package com.hanfl.behavior.module.base;

public interface ILoadDataView<T> extends IBaseView{
    void loadData(T data);

    void loadMoreData(T data);

    void loadNoData();
}
