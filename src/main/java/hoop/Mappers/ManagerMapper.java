package hoop.Mappers;

import hoop.Trade.T001.Entity.ManagerEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper {
    int deleteByPrimaryKey(String managerId);

    int insert(ManagerEntity record);

    int insertSelective(ManagerEntity record);

    ManagerEntity selectByPrimaryKey(String managerId);

    int updateByPrimaryKeySelective(ManagerEntity record);

    int updateByPrimaryKey(ManagerEntity record);
}