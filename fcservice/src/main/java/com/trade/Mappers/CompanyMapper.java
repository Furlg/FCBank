package com.trade.Mappers;

import com.trade.D001.T0002.Entity.CompanyEntiry;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {

    /**
     * 根据主键delete
     * @param companycode
     * @return
     */
    int deleteByPrimaryKey(String companycode);

    /**
     * insert
     * @param record
     * @return
     */
    int insert(CompanyEntiry record);

    /**
     *  insertSelective校验NULL值。当插入数据为空时会使用default默认值 insert 插入null时会忽略default将null插入
     * @param record
     * @return
     */
    int insertSelective(CompanyEntiry record);

    /**
     * 根据主键查询
     * @param companycode
     * @return CompanyEntiry
     */
    CompanyEntiry selectByPrimaryKey(String companycode);

    /**
     * 根据主键更新  ->忽略null将default插入
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CompanyEntiry record);

    /**
     * 根据主键更新  ->忽略default将null插入
     * @param record
     * @return int 受影响的行数
     */
    int updateByPrimaryKey(CompanyEntiry record);
}