package com.trade.D001.T0002.Service;

import com.trade.D001.T0002.Entity.CompanyEntiry;
import com.trade.Mappers.CompanyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CompanyServiceImp implements CompanyService {

    @Resource
    CompanyMapper companyMapper;

    /**
     * 根据主键查询
     *
     * @param companyCode 公司代码
     * @return CompanyEntity 实体类
     */
    @Override
    public CompanyEntiry selectByPrimaryKey(String companyCode) {
        return companyMapper.selectByPrimaryKey(companyCode);
    }

}
