package com.trade.D001.T0001.Controller;

import com.message.Response;
import com.trade.D001.T0001.Entity.UserEntityKey;
import com.trade.D001.T0001.Entity.UserEntityWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.TreeSet;

@RequestMapping("T0001")
@RestController
public class UserController {

    @Autowired
    private com.trade.D001.T0001.Service.UserServiceImp userServiceImp;

    /**返回体body**/
    Response response;

    /**
     * 根据主键查询单条UserEntityWithBLOBs
     * **/
    @PostMapping("Q01")
    public UserEntityWithBLOBs selectUserEntityWithBLOBs(){
        UserEntityKey userEntityKey = new UserEntityKey();
        userEntityKey.setHost("localhost");
        userEntityKey.setUser("root");
        return  userServiceImp.selectByPrimaryKey(userEntityKey);
    }

    /**
     * 查询全量UserEntityWithBLOBs
     */
    @RequestMapping(value = "Q02",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    Response findUserEntityBLOBsAll(){

        response = new Response(userServiceImp.findUserEntityBLOBsAll());
        return response;
    }

    /**
     * 查询全量UserEntityWithBLOBs 返回TreeSet<UserEntityBLOBs></>
     *
     */
    @PostMapping("Q03")
    TreeSet<UserEntityWithBLOBs> findUserEntityBLOBsAllToSort(){
        return  userServiceImp.findUserEntityBLOBsAllToSort();
    }

    /**
     *
     * 查询全量UserEntityWithBLOBs
     */
    @RequestMapping(value = "Q04",method = RequestMethod.POST)
    @ResponseBody
    public Response findUserAll(){
        response = new Response(userServiceImp.findUserBLOBsALL());
        return response;
    }

    /**
     * 返回UserEntityBLOBs 对象,且LinkedHashMap访问顺序恒等于插入顺序
     */
    @RequestMapping(value = "Q05",method = RequestMethod.POST)
    public  Response findUserByLinkedHashMap(){
        response = new Response(userServiceImp.findUserByLinkedHashMap());
        return response;
    }

    /**
     * 返回body
     */
    @RequestMapping(value = "Q06",method = RequestMethod.POST)
    public Response findUserByTreeMap(){
        UserEntityKey userEntityKey = new UserEntityKey();
            userEntityKey.setUser("root");
            userEntityKey.setHost("localhost");
        response = new Response(userServiceImp.findUserByTreeMap(userEntityKey));
            return response;
    }
}
