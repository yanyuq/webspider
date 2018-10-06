package com.yqb.webspider.web;

import com.yqb.webspider.service.ZhiHuContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping(value = "/zhihu")
public class ZhiHuController {

    private Logger logger = LoggerFactory.getLogger(ZhiHuController.class);

    @Autowired
    private ZhiHuContentService zhiHuContentService;

    @RequestMapping("/add/{key}")
    public String addZhiHuKey(@PathVariable("key") String key) {
        return addZhiHu(key, 20, 999999);
    }

    @RequestMapping("/add/{key}/{limit}/{count}")
    public String addZhiHu(@PathVariable("key") String key, @PathVariable("limit") Integer limit, @PathVariable("count") Integer count) {
        if (StringUtils.isEmpty(key)) {
            return "key is empty";
        }
        if (null == limit) {
            limit = 10;
        }
        try {
            key = URLEncoder.encode(key, "utf-8");
        } catch (UnsupportedEncodingException e) {
            logger.error("转码失败！");
            return "转码失败！";
        }


//        String url = "https://www.zhihu.com/r/search?q=%E4%B8%96%E7%95%8C%E6%9D%AF&correction=1&type=content&offset=10";
        String url = "https://www.zhihu.com/api/v4/search_v3?t=general&q=" + key + "&correction=1&offset={0}&limit={1}&search_hash_id=09f021d7d99fa809c1056e4e001731a2";
//        String url = "https://www.zhihu.com/api/v4/search_v3?t=general&q=%E4%B8%96%E7%95%8C%E6%9D%AF&correction=1&offset=65&limit=10&search_hash_id=5f82b96d1686b7c9cf6377dd28ad35dc";
//        String url = "https://m.weibo.cn/api/container/getIndex?containerid=100103type%3D" + type + "%26q%3D" + key + "%26t%3D0&page=";
        zhiHuContentService.processZhiHu(url, count, limit);
        return "doing";
        // 查看单条微博内容
        // https://m.weibo.cn/status/4252418286065472?display=0&retcode=6102
    }

    @RequestMapping("/count")
    public String zhiHuCount() {
        return "知乎爬取总条数：" + zhiHuContentService.count();
    }

}
