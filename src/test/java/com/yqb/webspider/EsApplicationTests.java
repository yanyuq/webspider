package com.yqb.webspider;

import com.alibaba.fastjson.JSON;
import com.yqb.webspider.es.ZhiHuSearchRepository;
import com.yqb.webspider.es.model.ZhiHuContent;
import org.elasticsearch.common.lucene.search.function.CombineFunction;
import org.elasticsearch.common.lucene.search.function.FieldValueFactorFunction;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.elasticsearch.index.query.functionscore.ScriptScoreFunctionBuilder;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsApplicationTests {
    @Autowired
    private ZhiHuSearchRepository zhiHuSearchRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void query() {
        long count = zhiHuSearchRepository.count();
        System.out.println(count);
    }

    @Test
    public void queryData() {
        Optional<ZhiHuContent> content = zhiHuSearchRepository.findById(1L);
        System.out.println(JSON.toJSONString(content, true));
    }

    @Test
    public void queryData1() {
//        SearchQuery searchQuery = new NativeSearchQuery();
        List<ZhiHuContent> content = zhiHuSearchRepository.findByTitle("马蓉");
        System.out.println(JSON.toJSONString(content, true));
        System.out.println(content.size());
    }

    @Test
    public void queryPageData() {
//        SearchQuery searchQuery = new NativeSearchQuery();
        List<ZhiHuContent> content = zhiHuSearchRepository.findByTitle("马蓉", PageRequest.of(0, 20));
        System.out.println(JSON.toJSONString(content, true));
        System.out.println(content.size());
    }

    @Test
    public void queryPageDataSort() {
        Integer pageNumber = 1;
        Integer pageSize = 3;
        String searchContent = "马蓉";
        // 分页参数
        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        // Function Score Query
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(
                QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("content", searchContent)),
                ScoreFunctionBuilders.weightFactorFunction(1000));
//                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("cityname", searchContent)),
//                        ScoreFunctionBuilders.weightFactorFunction(1000))
//                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("description", searchContent)),
//                        ScoreFunctionBuilders.weightFactorFunction(100));

        QueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .must(QueryBuilders.multiMatchQuery(searchContent, "title", "description", "content"));
        // 创建搜索 DSL 查询
        SortBuilder sortBuilder1 = new FieldSortBuilder("voteupCount").order(SortOrder.DESC);
        SortBuilder sortBuilder2 = new FieldSortBuilder("commentCount").order(SortOrder.DESC);
//        SortBuilder sortBuilder = new ScriptSortBuilder();
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(queryBuilder)
                .withSort(sortBuilder1)
                .withSort(sortBuilder2)
                .build();


        Page<ZhiHuContent> searchPageResults = zhiHuSearchRepository.search(searchQuery);
       /* System.out.println(
                JSON.toJSONString(searchPageResults.getContent(), true)
        );*/
        System.out.println("--------------------------------------------------------------------------");
//        ScriptType type, String lang, String idOrCode,
        Map<String, Object> params = new HashMap<>();
        params.put("voteupCount", 0.4);
        params.put("commentCount", 0.6);
        String scriptStr = "{\n" +
                "          \"source\": \"doc['voteupCount'].value + doc['commentCount'].value\"\n" +
                "        }";
//        Script script = new Script(Script.DEFAULT_SCRIPT_TYPE/*ScriptType.INLINE*/, Script.DEFAULT_TEMPLATE_LANG, "id", params);
        Script script = new Script(scriptStr);
        ScoreFunctionBuilder scoreFunctionBuilder = new ScriptScoreFunctionBuilder(script);
        FunctionScoreQueryBuilder functionScoreQueryBuilder1 = QueryBuilders.functionScoreQuery(scoreFunctionBuilder);
        SearchQuery searchQuery1 = new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(functionScoreQueryBuilder1)
                .withQuery(queryBuilder)
//                .withSort(sortBuilder1)
//                .withSort(sortBuilder2)
                .build();
        Page<ZhiHuContent> searchPageResults1 = zhiHuSearchRepository.search(searchQuery1);
        System.out.println(
                JSON.toJSONString(searchPageResults1.getContent(), true)
        );
    }

    @Test
    public void zhiHuSearch() {
        System.out.println("--------------------------------------------------------------------------");
        Integer pageNumber = 1;
        Integer pageSize = 5;
        String searchContent = "马蓉";
        // 分页参数
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        SortBuilder sortBuilder1 = new FieldSortBuilder("voteupCount").order(SortOrder.DESC);
        SortBuilder sortBuilder2 = new FieldSortBuilder("commentCount").order(SortOrder.DESC);
        QueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .must(QueryBuilders.multiMatchQuery(searchContent, "title", "description", "content"));
//        System.out.println("-queryBuilder-" + queryBuilder);

        String scriptStr = "{" +
                " \"source\": \"doc['voteupCount'].value + doc['commentCount'].value\"" +
                " }";
//        Script script = new Script(Script.DEFAULT_SCRIPT_TYPE/*ScriptType.INLINE*/, Script.DEFAULT_TEMPLATE_LANG, "id", params);
        Script script = new Script(scriptStr);
        ScoreFunctionBuilder scoreFunctionBuilder = new ScriptScoreFunctionBuilder(script);
//        System.out.println("-scoreFunctionBuilder-" + scoreFunctionBuilder);

        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(queryBuilder, scoreFunctionBuilder);
//        System.out.println("-functionScoreQueryBuilder-" + functionScoreQueryBuilder.query());
//        System.out.println("-functionScoreQueryBuilder--------------query-------------------" + functionScoreQueryBuilder);
//        ScriptField scriptField = new ScriptField("sc1", new Script(scriptStr));
//        System.out.println("-scriptField-" + scriptField);

//        FunctionScoreQueryBuilder voteupCountBuilder = QueryBuilders.functionScoreQuery(
//                QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("voteupCount", searchContent)),
//                ScoreFunctionBuilders.weightFactorFunction(1000));
//        FunctionScoreQueryBuilder commentCountBuilder =  QueryBuilders.functionScoreQuery(
//                QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("commentCount", searchContent)),
//                ScoreFunctionBuilders.weightFactorFunction(100));

        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder()
//                .withQuery(voteupCountBuilder)
//                .withQuery(commentCountBuilder)
                .withPageable(pageable)
//                .withQuery(functionScoreQueryBuilder)
//                .withQuery(queryBuilder)
//                .withScriptField(scriptField)
                .withQuery(sortByFucntion(queryBuilder))
                .withSort(sortBuilder1)
                .withSort(sortBuilder2);
        System.out.println("-nativeSearchQueryBuilder-" + nativeSearchQueryBuilder);
        SearchQuery searchQuery = nativeSearchQueryBuilder.build();
        System.out.println("-searchQuery-" + searchQuery);

        Page<ZhiHuContent> searchPageResults1 = zhiHuSearchRepository.search(searchQuery);
        System.out.println(
                JSON.toJSONString(searchPageResults1.getContent(), true)
        );
    }

    public FunctionScoreQueryBuilder sortByFucntion(QueryBuilder queryBuilder) {
//        " \"source\": \"doc['voteupCount'].value + doc['commentCount'].value\"" +
        FunctionScoreQueryBuilder query = QueryBuilders.functionScoreQuery(
                queryBuilder,
                ScoreFunctionBuilders.fieldValueFactorFunction("voteupCount")
                        .modifier(FieldValueFactorFunction.Modifier.LN1P)
                        .factor(1f)).boostMode(CombineFunction.SUM)
//        .add(ScoreFunctionBuilders.fieldValueFactorFunction("commentCount").modifier(FieldValueFactorFunction.Modifier.RECIPROCAL).factor(1)).boostMode(CombineFunction.SUM)
                ;



        /*-----------------------------------------------------------------------------------
        String timeField = getTypeTimeField(type);
        if (StringUtils.isBlank(timeField)) {
            searchRequestBuilder.setQuery(buildBoolQuery(params.keywords(), attributes));
        } else {
            String inlineScript = ElasticScriptUtils.scriptWithScoreAndTime(timeField, System.currentTimeMillis());
            Map<String, Object> sparams = new HashMap<>();
            Script script = new Script(inlineScript, ScriptType.INLINE, "groovy", sparams);
            ScoreFunctionBuilder scoreFunctionBuilder = ScoreFunctionBuilders.scriptFunction(script);
            searchRequestBuilder.setQuery(QueryBuilders.functionScoreQuery(
                    buildBoolQuery(params.keywords(), attributes), scoreFunctionBuilder));
        }
        https://blog.csdn.net/fighting_one_piece/article/details/78106702
        //-----------------------------------------------------------------------------------
*/


        return query;
    }

    @Test
    public void testA() {
        int a = 1;
        System.out.println((++a) == a);
        System.out.println((a++) == a);
//        System.out.println(t1());
    }

    public Integer t1() {
        Integer a = null;
        try {
            a = 0;
            int b = 0/0;
            return a;
        } catch (Exception e) {
            a = 1;

            return a;
        } finally {
            a = 2;
            return a;
        }
    }
}
