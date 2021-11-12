package com.trade.D001.T0002.Entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * company
 * @author 
 */
@Data
public class CompanyEntiry implements Serializable {
    /**
     * 公司代码
     */
    private String companycode;

    /**
     * 公司名称
     */
    private String companyname;

    /**
     * 公司创建日期
     */
    private Date founddate;

    /**
     * 公司法人
     */
    private String legalperson;

    private static final long serialVersionUID = 1L;
}