package com.trade.D001.T0002.Service;

import com.trade.D001.T0002.Entity.CompanyEntiry;

public interface CompanyService {

    /**
     * 根据主键查询
     * @param companyCode  公司代码
     * @return CompanyEntity 实体类
     */
    CompanyEntiry selectByPrimaryKey(String companyCode);
}
