package com.yqb.webspider.es;
import com.yqb.webspider.es.model.ZhiHuContent;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface ZhiHuSearchRepository extends ElasticsearchRepository<ZhiHuContent, Long> {
    List<ZhiHuContent> findByTitle(String title);
    List<ZhiHuContent> findByTitle(String title, Pageable pageable);
}
