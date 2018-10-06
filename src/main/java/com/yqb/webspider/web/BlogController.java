package com.yqb.webspider.web;

import com.yqb.webspider.service.SinaBlogContentService;
import com.yqb.webspider.util.HttpRequestUtil;
import com.yqb.webspider.util.UnicodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RestController
@RequestMapping(value = "/sina")
public class BlogController {

    private Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private SinaBlogContentService sinaBlogContentService;

    @RequestMapping("/add/{key}")
    public String addBlogKey(@PathVariable("key") String key) {
        return addBlog(key, 61, 999999);
    }

    @RequestMapping("/add/{key}/{type}/{count}")
    public String addBlog(@PathVariable("key") String key, @PathVariable("type") Integer type, @PathVariable("count") Integer count) {
        if (StringUtils.isEmpty(key)) {
            return "key is empty";
        }
        try {
            key = URLEncoder.encode(key, "utf-8");
        } catch (UnsupportedEncodingException e) {
            logger.error("转码失败！");
            return "转码失败！";
        }


        String url = "https://m.weibo.cn/api/container/getIndex?containerid=100103type%3D" + type + "%26q%3D" + key + "%26t%3D0&page=";
        sinaBlogContentService.processWeiBo(url, count);
        return "doing";
        // 查看单条微博内容
        // https://m.weibo.cn/status/4252418286065472?display=0&retcode=6102
    }

    @RequestMapping("/count")
    public String blogCount() {
        return "微博爬取总条数：" + sinaBlogContentService.count();
    }


    public static void main(String[] args) {
//        t1();
        String fullUrl = "https://www.zhihu.com/api/v4/search_v3?t=general&q=%E4%B8%96%E7%95%8C%E6%9D%AF&correction=1&offset=65&limit=10&search_hash_id=5f82b96d1686b7c9cf6377dd28ad35dc";

        String resStr = UnicodeUtil.decode(HttpRequestUtil.get(fullUrl));
        System.out.println("url = [" + URLDecoder.decode(fullUrl) + "]");
        System.out.println("resStr = [" + resStr + "]");
    }

    public static void t1() {
        String u1 = URLDecoder.decode("https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%E4%B8%96%E7%95%8C%E6%9D%AF&featurecode=20000320&luicode=10000011&lfid=106003type%3D1&title=%E4%B8%96%E7%95%8C%E6%9D%AF&sudaref=m.weibo.cn&display=0&retcode=6102&containerid=100103type%3D1%26q%3D%E4%B8%96%E7%95%8C%E6%9D%AF&page=");
        String u2 = URLDecoder.decode(
                "https://m.weibo.cn/api/container/getIndex?containerid=100103type%3D1%26q%3D%E4%B8%96%E7%95%8C%E6%9D%AF&page_type=searchall"
        );
        String u3 = URLDecoder.decode(
                "https://m.weibo.cn/api/container/getIndex?containerid=100103type%3D1%26q%3D%E4%B8%96%E7%95%8C%E6%9D%AF&page=2"
        );
        String u4 = URLDecoder.decode(
                "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%E9%A9%AC%E8%93%89&containerid=100103type%3D1%26q%3D%E9%A9%AC%E8%93%89&page="
        );
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println(URLDecoder.decode("%3D%E9%A9%AC%E8%93%89&"));
        System.out.println(URLDecoder.decode(
                "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%3F%3F%3F%3F&containerid=100103type%3D1%26q%3D%3F%3F%3F%3F&page=2"
        ));
        System.out.println(URLDecoder.decode("https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%E4%B8%96%E7%95%8C%E6%9D%AF&containerid=100103type%3D1%26q%3D%E4%B8%96%E7%95%8C%E6%9D%AF&page=37\n" +
                "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%E9%A9%AC%E8%93%89&containerid=100103type%3D1%26q%3D%E9%A9%AC%E8%93%89&page=10\n" +
                "https://m.weibo.cn/api/container/getIndex?type=all&queryVal=%CA%C0%BD%E7%B1%AD&containerid=100103type%3D1%26q%3D%CA%C0%BD%E7%B1%AD&page=2\n" +
                "\nhttps://m.weibo.cn/api/container/getIndex?containerid=100103type%3D61%26q%3D%E4%B8%96%E7%95%8C%E6%9D%AF%26t%3D0&page=3"));
    }

}
