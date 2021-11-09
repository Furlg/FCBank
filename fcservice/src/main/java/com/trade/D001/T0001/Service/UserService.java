package com.trade.D001.T0001.Service;

import com.trade.D001.T0001.Entity.UserEntity;
import com.trade.D001.T0001.Entity.UserEntityKey;
import com.trade.D001.T0001.Entity.UserEntityWithBLOBs;
import com.trade.D001.T0001.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserMapper {

    @Autowired
    private com.trade.D001.T0001.Mapper.UserMapper userMapper;

    /**
     * delete
     *
     * @param key
     * @return int 受影响的行数
     */
    @Override
    public int deleteByPrimaryKey(UserEntityKey key) {
        return 0;
    }

    /**
     * insert
     *
     * @param record
     * @return int 受影响的行数
     */
    @Override
    public int insert(UserEntityWithBLOBs record) {
        return 0;
    }

    /**
     * @param record
     * @return int 受影响的行数
     */
    @Override
    public int insertSelective(UserEntityWithBLOBs record) {
        return 0;
    }

    /**
     * 根据主键select
     *
     * @param key
     * @return UserEntityWithBLOBs
     */
    @Override
    public UserEntityWithBLOBs selectByPrimaryKey(UserEntityKey key) {
        return userMapper.selectByPrimaryKey(key);
    }

    /**
     * 查询全量UserEntityWithBLOBs
     *
     * @return List<UserEntityWithBLOBs> </>
     */
    @Override
    public List<UserEntityWithBLOBs> findUserEntityBLOBsAll() {
        return userMapper.findUserEntityBLOBsAll();
    }

    @Override
    public int updateByPrimaryKeySelective(UserEntityWithBLOBs record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(UserEntityWithBLOBs record) {
        return 0;
    }

    /**
     * 根据主键更新
     *
     * @param record
     * @return 受影响的行数
     */
    @Override
    public int updateByPrimaryKey(UserEntity record) {
        return 0;
    }
}
