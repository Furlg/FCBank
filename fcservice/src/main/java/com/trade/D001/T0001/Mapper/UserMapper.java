package com.trade.D001.T0001.Mapper;

import com.trade.D001.T0001.Entity.UserEntity;
import com.trade.D001.T0001.Entity.UserEntityKey;
import com.trade.D001.T0001.Entity.UserEntityWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * delete
     * @param key
     * @return int 受影响的行数
     */
    int deleteByPrimaryKey(UserEntityKey key);

    /**
     * insert
     * @param record
     * @return int 受影响的行数
     */
    int insert(UserEntityWithBLOBs record);

    /**
     *
     * @param record
     * @return int 受影响的行数
     */
    int insertSelective(UserEntityWithBLOBs record);

    /**
     * 根据主键select
     * @param key
     * @return UserEntityWithBLOBs
     */
    UserEntityWithBLOBs selectByPrimaryKey(UserEntityKey key);

    /**
     * 查询全量UserEntityWithBLOBs
     * @return List<UserEntityWithBLOBs> </>
     */
    List<UserEntityWithBLOBs> findUserEntityBLOBsAll();

    int updateByPrimaryKeySelective(UserEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserEntityWithBLOBs record);

    /**
     * 根据主键更新
     * @param record
     * @return 受影响的行数
     */
    int updateByPrimaryKey(UserEntity record);
}