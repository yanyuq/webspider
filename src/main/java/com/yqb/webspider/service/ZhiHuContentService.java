package com.yqb.webspider.service;

import com.yqb.webspider.service.model.ZhiHu;

public interface ZhiHuContentService {

    void add(ZhiHu zhiHu);

    long count();

    void processZhiHu(String url, int count, int limit);
}
