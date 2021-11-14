package com.trade.D001.T0003.Entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * trade_request_count
 * @author 
 */
@Data
public class TradeRequestCountEntity implements Serializable {
    /**
     * 渠道
     */
    private String channel;

    /**
     * 服务码
     */
    private String servicecode;

    /**
     * 场景码
     */
    private String scenecode;

    /**
     * 请求时间
     */
    private Date requesttime;

    private static final long serialVersionUID = 1L;
}