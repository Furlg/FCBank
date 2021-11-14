package com.trade.D001.T0001.Service;

import com.utils.MapUtil;
import com.trade.Mappers.UserMapper;
import com.trade.D001.T0001.Entity.UserEntityKey;
import com.trade.D001.T0001.Entity.UserEntityWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserServiceImp implements UserService {


    @Resource
    UserMapper userMapper;

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
     * 返回Map对象 HashMap不保证顺序,即访问顺序不一定等于插入顺序
     */
    HashMap<Object,Object> hashMap;
    @Override
    public HashMap<Object, Object> findUserBLOBsALL() {
        hashMap = new HashMap<Object, Object>();
        hashMap.put("userName","沙建斌");
        hashMap.put("UserEntityList",userMapper.findUserEntityBLOBsAll());
        return hashMap;
    }

    /****
     * 返回一个LinkedHashMap ,LinkedHashMap保证顺序 即访问顺序恒等于插入顺序
     */
    @Override
    public LinkedHashMap<Object, Object> findUserByLinkedHashMap() {
        LinkedHashMap<Object,Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        linkedHashMap.put("姓名","沙建斌");
        linkedHashMap.put("userList",userMapper.findUserEntityBLOBsAll());
        linkedHashMap.put("年龄","22");
        return linkedHashMap;
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

    /**
     * 查询全量UserEntitywithBLOBs 根据主键排序
     *
     * @return TreeSet<UserEntityWithBLOBs>
     */
    @Override
    public TreeSet<UserEntityWithBLOBs> findUserEntityBLOBsAllToSort() {
        TreeSet<UserEntityWithBLOBs> treeSet = (TreeSet<UserEntityWithBLOBs>) userMapper.findUserEntityBLOBsAll();
        if (treeSet.isEmpty()){
            System.out.println("查询结果为空！");
        }

        return treeSet;
    }

    /**
     * 返回一个TreeMap  TreeMap按照自然顺序进行排序
     */
    @Autowired
    MapUtil mapUtil;
    @Override
    public TreeMap<Object, Object> findUserByTreeMap(UserEntityKey userEntityKey) {
        System.out.println(userMapper.selectByPrimaryKey(userEntityKey));
        Map<String,Object> map =mapUtil.objectToMap(userMapper.selectByPrimaryKey(userEntityKey));
        TreeMap<Object,Object> userTreeMap = new TreeMap<Object, Object>(map);
            //userTreeMap.put("mysql.user",userMapper.selectByPrimaryKey(userEntityKey));
        return userTreeMap;
    }
}
