package com.yqb.webspider.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqb.webspider.mapper.SinaBlogContentMapper;
import com.yqb.webspider.mapper.model.SinaBlogContent;
import com.yqb.webspider.service.SinaBlogContentService;
import com.yqb.webspider.service.model.SinaBlog;
import com.yqb.webspider.util.HttpRequestUtil;
import com.yqb.webspider.util.UnicodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class SinaBlogContentServiceImpl implements SinaBlogContentService {

    private Logger logger = LoggerFactory.getLogger(SinaBlogContentServiceImpl.class);

    @Autowired
    private SinaBlogContentMapper sinaBlogContentMapper;

    @Override
    public void add(SinaBlog sinaBlog) {
        List<SinaBlog.DataBean.CardsBean> cards = sinaBlog.getData().getCards();
        cards.forEach(card -> {
            if (!CollectionUtils.isEmpty(card.getCard_group())) {
                List<SinaBlog.DataBean.CardsBean.CardGroupBean> groups = card.getCard_group();
                groups.forEach(group -> {
                    if (9 == group.getCard_type()) {
                        SinaBlogContent content = new SinaBlogContent();
                        SinaBlog.DataBean.CardsBean.CardGroupBean.MblogBean blog = group.getMblog();
                        content.setBlogId(blog.getId());
                        content.setCreatedAt(blog.getCreated_at());
                        content.setMid(blog.getMid());
                        content.setIdstr(blog.getIdstr());
                        content.setText(blog.getText());
                        String text;
                        if (blog.isIsLongText()) {
                            text = ((JSONObject) JSON.parse(blog.getLongText())).getString("longTextContent");
                        } else {
                            text = blog.getText();
                        }
                        content.setText(text);
                        content.setSource(blog.getSource());
                        content.setFavorited(blog.isFavorited());
                        content.setTruncated(blog.isIs_paid());
                        content.setThumbnailPic(blog.getThumbnail_pic());
//                        content.setBmiddlePic();
//                        content.setOriginalPic(blog.);
                        content.setUserId(blog.getUser().getId());
//                        content.setRetweetedId(blog);
                        content.setRepostsCount(blog.getReposts_count());
                        content.setCommentsCount(blog.getComments_count());
                        content.setAttitudesCount(blog.getAttitudes_count());
                        content.setCreateBy("autoUser");
                        content.setCreateTime(new Date());
                        content.setUpdateBy("autoUser");
                        content.setUpdateTime(new Date());
                        try {
                            sinaBlogContentMapper.insert(content);
                        } catch (DuplicateKeyException e) {
                            logger.warn("已存在:" + content.getBlogId());
                        } catch (Exception e) {
                            logger.error("insert error", e);
                        }
                    }
                });
            }
        });
    }

    @Async
    public void processWeiBo(String url, int count) {

//        String realUrl = "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=" + key + "&containerid=100103type%3D1%26q%3D" + key + "&page=";
//        String s = "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%E4%B8%96%E7%95%8C%E6%9D%AF&featurecode=20000320&luicode=10000011&lfid=106003type%3D1&title=%E4%B8%96%E7%95%8C%E6%9D%AF&sudaref=m.weibo.cn&display=0&retcode=6102&containerid=100103type%3D1%26q%3D%E4%B8%96%E7%95%8C%E6%9D%AF&page=" + page;
//        String sa = "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%E4%B8%96%E7%95%8C%E6%9D%AF&containerid=100103type%3D1%26q%3D%E4%B8%96%E7%95%8C%E6%9D%AF&page=";
//        String sa = "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%E9%A9%AC%E8%93%89&containerid=100103type%3D1%26q%3D%E9%A9%AC%E8%93%89&page=";
//        String s = "https://m.toutiao.com/list/?tag=news_society&ac=wap&count=20&format=json_raw&as=A1D5DBF2C901D32&cp=5B29D19D7302DE1&max_behot_time=1529416612&_signature=KI6v1wAAc66Coe9XoebsXiiOr8&i=1529416612";
//        String s = "https://m.toutiao.com/list/?tag=news_society&ac=wap&count=20&format=json_raw&as=A1D5DBF2C901D32&cp=5B29D19D7302DE1&max_behot_time=1529416612&i=1529416612";
        int temp = 1;
        SinaBlog sinaBlog;
        int c = (0 == count ? 99999 : count);
//        int t = ((c > 100) ? 100 : c);
        try {
            for (; 0 < c; c--) {
                temp = 1;
                do {
                    String fullUrl = url + temp;
                    String resStr = UnicodeUtil.decode(HttpRequestUtil.get(fullUrl));
                    resStr = resStr.replaceAll("[\\x{10000}-\\x{10FFFF}]", "(特殊符号)");
                    sinaBlog = JSON.parseObject(resStr, SinaBlog.class);
                    logger.info(fullUrl);
                    //                logger.info(JSON.toJSONString(sinaBlog, true));
                    add(sinaBlog);
                    temp++;
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException e) {
                        logger.error("Thread sleep error", e);
                    }
                } while (1 == sinaBlog.getOk() && 50 > temp);
            }
        } catch (Throwable e) {
            logger.error("process error", e);
        }
    }

    @Override
    public long count() {
        return sinaBlogContentMapper.count();
    }
}
