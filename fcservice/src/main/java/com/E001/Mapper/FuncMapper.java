package com.E001.Mapper;

import com.E001.Entity.Func;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface FuncMapper {
    int deleteByPrimaryKey(String name);

    int insert(Func record);

    int insertSelective(Func record);

    Func selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Func record);

    int updateByPrimaryKey(Func record);
}