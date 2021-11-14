package com.message.rulesFieldCheck.Entity;

import java.io.Serializable;
import lombok.Data;

/**
 * trade_request_rules
 * @author 
 */
@Data
public class TradeRequestRulesEntity implements Serializable {
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
     * 是否通用规则非通用规则则不进行检查
     */
    private Object iscommon;

    /**
     * 是否必输(0-否,1-是)
     */
    private Object require;

    /**
     * 字段名称
     */
    private String filedname;

    /**
     * 字段描述
     */
    private String fileddes;

    /**
     * 字段类型(0-字符串,1-数组,2-列表,3-对象)
     */
    private Object filedtype;

    /**
     * 字段长度
     */
    private String filedlength;

    private static final long serialVersionUID = 1L;
}