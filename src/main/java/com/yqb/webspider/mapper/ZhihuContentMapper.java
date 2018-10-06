package com.yqb.webspider.mapper;

import com.yqb.webspider.mapper.model.ZhihuContent;
import com.yqb.webspider.mapper.model.ZhihuContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZhihuContentMapper {
    int countByExample(ZhihuContentExample example);

    int deleteByExample(ZhihuContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZhihuContent record);

    int insertSelective(ZhihuContent record);

    List<ZhihuContent> selectByExample(ZhihuContentExample example);

    ZhihuContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZhihuContent record, @Param("example") ZhihuContentExample example);

    int updateByExample(@Param("record") ZhihuContent record, @Param("example") ZhihuContentExample example);

    int updateByPrimaryKeySelective(ZhihuContent record);

    int updateByPrimaryKey(ZhihuContent record);

    int updateByZhiHuId(ZhihuContent record);

    long count();
}