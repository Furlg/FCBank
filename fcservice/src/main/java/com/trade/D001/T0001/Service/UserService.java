package com.trade.D001.T0001.Service;


import com.trade.D001.T0001.Entity.UserEntityKey;
import com.trade.D001.T0001.Entity.UserEntityWithBLOBs;
import org.omg.CORBA.OBJ_ADAPTER;

import java.util.*;

public interface UserService {


    /**
     * 查询全量UserEntityWithBLOBs
     *
     * @return List<UserEntityWithBLOBs> </>
     */
    public List<UserEntityWithBLOBs> findUserEntityBLOBsAll();


    /**
     * 查询全量UserEntitywithBLOBs 根据主键排序
     * @return  TreeSet<UserEntityWithBLOBs>
     */
    public TreeSet<UserEntityWithBLOBs> findUserEntityBLOBsAllToSort();


    /**
     * 根据主键select
     *
     * @param key
     * @return UserEntityWithBLOBs
     */
    public UserEntityWithBLOBs selectByPrimaryKey(UserEntityKey key);

    /**
     *
     * 返回Map对象
     *
     */
    public HashMap<Object, Object> findUserBLOBsALL();

    /****
     * 返回一个LinkedHashMap ,LinkedHashMap保证顺序 即访问顺序恒等于插入顺序
     */
    public LinkedHashMap<Object,Object> findUserByLinkedHashMap();

    /**
     * 返回一个TreeMap  TreeMap按照自然顺序进行排序
     */
    public TreeMap<Object,Object> findUserByTreeMap(UserEntityKey userEntityKey);
}
