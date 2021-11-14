package com.filter;

import com.message.ErrorCodeAndMessage;
import com.message.GlobalException;
import com.message.rulesFieldCheck.Service.TradeRequestRulesImp;
import com.trade.D001.T0003.Entity.TradeRequestCountEntity;
import com.trade.D001.T0003.Service.TradeRequestContImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * FilterSample 用来统计前端请求
 * **/
@Slf4j
@WebFilter
@Component
public class FilterSample implements Filter {

    @Resource
    TradeRequestContImp tradeRequestContImp;

    @Resource
    TradeRequestRulesImp tradeRequestRulesImp;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.error("FilterConfig："+filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.error(servletRequest+"<->"+servletResponse+"<->"+filterChain);
        log.error("sss"+String.valueOf(servletRequest));
        /**
         * 获取请求头信息
         * @param {ServiceCode} 服务码
         * @pram  {ChannelCode} 渠道码
         * @pram  {SceneCode}   场景码
         */
        HttpServletRequest  httpServletRequest =(HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;


        //tradeRequestRulesImp.resolveRequestHeadRule(servletRequest);  --请求字段校验为完成

        TradeRequestCountEntity tradeRequestCountEntity = new TradeRequestCountEntity();
            tradeRequestCountEntity.setServicecode(httpServletRequest.getHeader("ServiceCode"));
            tradeRequestCountEntity.setChannel(httpServletRequest.getHeader("ChannelCode"));
            tradeRequestCountEntity.setScenecode(httpServletRequest.getHeader("SceneCode"));
            tradeRequestCountEntity.setRequesttime(new Date());
         tradeRequestContImp.insertSelective(tradeRequestCountEntity);
         filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
       log.error("FilterDestroy");
    }
}
