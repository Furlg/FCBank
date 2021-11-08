package com.E001.Service;

import com.E001.Entity.Func;
import com.E001.Mapper.FuncMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncService  implements FuncMapper {

    @Autowired
    FuncMapper funcMapper;
    @Override
    public int deleteByPrimaryKey(String name) {
        return 0;
    }

    @Override
    public int insert(Func record) {
        return 0;
    }

    @Override
    public int insertSelective(Func record) {
        return 0;
    }

    @Override
    public Func selectByPrimaryKey(String name) {
        return funcMapper.selectByPrimaryKey(name);
    }

    @Override
    public int updateByPrimaryKeySelective(Func record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Func record) {
        return 0;
    }
}
