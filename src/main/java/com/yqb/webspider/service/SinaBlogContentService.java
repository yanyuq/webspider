package com.yqb.webspider.service;

import com.yqb.webspider.service.model.SinaBlog;

public interface SinaBlogContentService {

    void add(SinaBlog sinaBlog);

    long count();

    void processWeiBo(String url, int count);
}
