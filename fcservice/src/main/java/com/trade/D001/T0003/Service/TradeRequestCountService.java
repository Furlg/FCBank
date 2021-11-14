package com.trade.D001.T0003.Service;

import com.trade.D001.T0003.Entity.TradeRequestCountEntity;

public interface TradeRequestCountService {

    /**
     * insert 向trade_request_count表中增加一条数据
     * @return int 受影响的结果数
     */
    public int insertSelective(TradeRequestCountEntity tradeRequestCountEntity);
}
