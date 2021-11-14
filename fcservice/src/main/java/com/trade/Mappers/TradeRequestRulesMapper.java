package com.trade.Mappers;

import com.message.rulesFieldCheck.Entity.TradeRequestRulesEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TradeRequestRulesMapper {
    int insert(TradeRequestRulesEntity record);

    int insertSelective(TradeRequestRulesEntity record);

    /**
     * 根据SSC(服务码 ServiceCode , 场景码 SceneCode ，渠道号 Channel) 查询
     */
    ArrayList<TradeRequestRulesEntity> selectRulesBySSC(TradeRequestRulesEntity tradeRequestRulesEntity);
}