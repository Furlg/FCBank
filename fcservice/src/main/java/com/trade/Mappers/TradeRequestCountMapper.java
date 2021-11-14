package com.trade.Mappers;

import com.trade.D001.T0003.Entity.TradeRequestCountEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TradeRequestCountMapper {
    int insert(TradeRequestCountEntity record);

    int insertSelective(TradeRequestCountEntity record);
}