package com.yqb.webspider.mapper;

import com.yqb.webspider.mapper.model.SinaBlogContent;
import com.yqb.webspider.mapper.model.SinaBlogContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SinaBlogContentMapper {
    int countByExample(SinaBlogContentExample example);

    int deleteByExample(SinaBlogContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SinaBlogContent record);

    long count();

    int insertSelective(SinaBlogContent record);

    List<SinaBlogContent> selectByExample(SinaBlogContentExample example);

    SinaBlogContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SinaBlogContent record, @Param("example") SinaBlogContentExample example);

    int updateByExample(@Param("record") SinaBlogContent record, @Param("example") SinaBlogContentExample example);

    int updateByPrimaryKeySelective(SinaBlogContent record);

    int updateByPrimaryKey(SinaBlogContent record);
}