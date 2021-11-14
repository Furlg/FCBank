package com.message.rulesFieldCheck.Service;


import com.message.rulesFieldCheck.Entity.TradeRequestRulesEntity;

import javax.servlet.ServletRequest;

/**
 * 交易请求字段规则服务
 */
public interface TradeRequestRulesService {

    /**
     * 解析报文头字段是否必输
     *
     */
    public boolean resolveRequestHeadRule(ServletRequest request);
}
