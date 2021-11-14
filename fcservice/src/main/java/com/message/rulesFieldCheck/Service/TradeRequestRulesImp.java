package com.message.rulesFieldCheck.Service;

import com.message.ErrorCodeAndMessage;
import com.message.GlobalException;
import com.message.rulesFieldCheck.Entity.TradeRequestRulesEntity;
import com.trade.Mappers.TradeRequestRulesMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.ListIterator;

@Slf4j
@Service
public class TradeRequestRulesImp implements TradeRequestRulesService {

    @Resource
    TradeRequestRulesMapper tradeRequestRulesMapper;
    /**
     * 解析报文头字段是否必输
     *
     * @param servletRequest
     * @return  true 检查通过 false 检查失败
     */
    @Override
    public boolean resolveRequestHeadRule(ServletRequest servletRequest) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        TradeRequestRulesEntity tradeRequestRulesEntity = new TradeRequestRulesEntity();
            tradeRequestRulesEntity.setChannel(request.getHeader("ChannelCode"));
            tradeRequestRulesEntity.setServicecode(request.getHeader("ServiceCode"));
            tradeRequestRulesEntity.setScenecode(request.getHeader("SceneCode"));
        ArrayList<TradeRequestRulesEntity> list = tradeRequestRulesMapper.selectRulesBySSC(tradeRequestRulesEntity);
            if (list.isEmpty()) {
                //这里需要处理查询无记录的问题.需要返回给前端查询无记录
            };

            //构建列表ListIterator迭代器
        ListIterator iterator =list.listIterator();
        while (iterator.hasNext()){
           TradeRequestRulesEntity tr = (TradeRequestRulesEntity) iterator.next();

            /**
             * 首先检查报文体APP_HEAD字段
             */
            if(tr.getIscommon().equals("Y") && tr.getRequire().equals("Y") ){

            }

            //是否通用的规则并且require 为1-必输
            if(tr.getIscommon().equals("Y") && tr.getRequire().equals("1")){

                //当前字段为报文头APP_HEAD字段
                if(tr.getFiledname().equals("APP_HEAD") && tr.getFiledtype().equals("object")){

                }

            }
        }

        return false;
    }
}
