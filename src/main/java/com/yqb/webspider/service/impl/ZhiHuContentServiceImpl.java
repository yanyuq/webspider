package com.yqb.webspider.service.impl;

import com.alibaba.fastjson.JSON;
import com.yqb.webspider.mapper.ZhihuContentMapper;
import com.yqb.webspider.mapper.model.ZhihuContent;
import com.yqb.webspider.service.ZhiHuContentService;
import com.yqb.webspider.service.model.ZhiHu;
import com.yqb.webspider.util.HttpRequestUtil;
import com.yqb.webspider.util.UnicodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

@Service
public class ZhiHuContentServiceImpl implements ZhiHuContentService {

    private Logger logger = LoggerFactory.getLogger(ZhiHuContentServiceImpl.class);

    @Autowired
    private ZhihuContentMapper zhihuContentMapper;

    @Override
    public void add(ZhiHu zhiHu) {
        List<ZhiHu.DataBean> dataBeans = zhiHu.getData();
        dataBeans.forEach(dataBean -> {
            ZhihuContent content = new ZhihuContent();
            ZhiHu.DataBean.HighlightBean highlight = dataBean.getHighlight();
            if (null != highlight) {
                content.setDescription(highlight.getDescription());
                content.setTitle(highlight.getTitle());
            }
            ZhiHu.DataBean.ObjectBean objectBean = dataBean.getObject();
            if (null != objectBean) {
                content.setExcerpt(objectBean.getExcerpt());
                content.setCreatedTime((long) objectBean.getCreated_time());
                content.setZhihuId(Long.parseLong(objectBean.getId()));
                content.setVoteupCount(objectBean.getVoteup_count());
                content.setAttachedInfoBytes(objectBean.getAttached_info_bytes());
                if (null != objectBean.getAuthor()) {
                    content.setAuthorId(objectBean.getAuthor().getId());
                }
                content.setUrl(objectBean.getUrl());
                ZhiHu.DataBean.ObjectBean.QuestionBean question = objectBean.getQuestion();
                if (null != question) {
                    content.setQuestionId(Long.parseLong(question.getId()));
                    content.setQuestionName(question.getName());
                }
                content.setUpdatedTime((long) objectBean.getUpdated_time());
                content.setContent(objectBean.getContent());
                content.setCommentCount(objectBean.getComment_count());
                content.setType(objectBean.getType());
                content.setCreateBy("autoUser");
                content.setCreateTime(new Date());
                content.setUpdateBy("autoUser");
                content.setUpdateTime(new Date());
                try {
                    zhihuContentMapper.insert(content);
                } catch (DuplicateKeyException e) {
                    logger.warn("已存在:[" + content.getZhihuId() + "]将更新");
                    zhihuContentMapper.updateByZhiHuId(content);
                } catch (Exception e) {
                    logger.error("insert error", e);
                    logger.error(objectBean.getUrl());
                }
            }

        });
    }

    @Override
    public long count() {
        return zhihuContentMapper.count();
    }

    @Override
    @Async
    public void processZhiHu(String url, int count, int limit) {
        int temp = 1;
        ZhiHu zhiHu;
        int c = (0 == count ? 99999 : count);
//        int t = ((c > 100) ? 100 : c);
        for (; 0 < c; c--) {
            temp = 0;
            do {
                String fullUrl = MessageFormat.format(url, temp, limit);
//                String fullUrl = url + temp;
                String resStr = UnicodeUtil.decode(HttpRequestUtil.get(fullUrl));
                resStr = resStr.replaceAll("[\\x{10000}-\\x{10FFFF}]", "(特殊符号)");
                zhiHu = JSON.parseObject(resStr, ZhiHu.class);
                logger.info(fullUrl);
//                logger.info(JSON.toJSONString(zhiHu, true));
                add(zhiHu);
//                fullUrl = zhiHu.getPaging().getNext();
                temp += limit;
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    logger.error("Thread sleep error", e);
                }
            } while (300 > temp);//!zhiHu.getPaging().isIs_end());// && 50 > temp);
        }
    }
}
