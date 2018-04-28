package com.hanfl.behavior.module.news;

import com.hanfl.behavior.bean.NewsInfo;
import com.hanfl.behavior.module.base.ILoadDataView;

/**
 * 新闻列表视图接口
 */
public interface INewsListView extends ILoadDataView{
    void loadAdData(NewsInfo newsInfo);
}
