package com.trade.D001.T0003.Service;

import com.trade.D001.T0003.Entity.TradeRequestCountEntity;
import com.trade.Mappers.TradeRequestCountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class TradeRequestContImp implements TradeRequestCountService {

    @Resource
    TradeRequestCountMapper tradeRequestCountMapper;
    /**
     * insert 向trade_request_count表中增加一条数据
     *
     * @param tradeRequestCountEntity
     * @return int 受影响的结果数
     */
    @Override
    public int insertSelective(TradeRequestCountEntity tradeRequestCountEntity) {
        int record = tradeRequestCountMapper.insertSelective(tradeRequestCountEntity);
        log.error("受影响的行数为："+record);
        return record;
    }
}
