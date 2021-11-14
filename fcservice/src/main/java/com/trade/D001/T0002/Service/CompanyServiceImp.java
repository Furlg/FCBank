package com.trade.D001.T0002.Service;

import com.message.ErrorCodeAndMessage;
import com.message.GlobalException;
import com.trade.D001.T0002.Entity.CompanyEntiry;
import com.trade.Mappers.CompanyMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
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
        CompanyEntiry companyEntiry = companyMapper.selectByPrimaryKey(companyCode);

        if (companyEntiry == null){
            throw  new GlobalException(ErrorCodeAndMessage.QUERY_NULL);
        }
        return  companyEntiry;
    }

}
