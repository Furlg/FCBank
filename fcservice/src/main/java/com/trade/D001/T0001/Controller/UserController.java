package com.trade.D001.T0001.Controller;

import com.trade.D001.T0001.Entity.UserEntityKey;
import com.trade.D001.T0001.Entity.UserEntityWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("T0001")
@RestController
public class UserController {

    @Autowired
    private com.trade.D001.T0001.Service.UserService userService;

    /**
     * 根据主键查询单条UserEntityWithBLOBs
     * **/
    @PostMapping("Q01")
    public UserEntityWithBLOBs selectUserEntityWithBLOBs(){
        UserEntityKey userEntityKey = new UserEntityKey();
        userEntityKey.setHost("localhost");
        userEntityKey.setUser("root");
        return  userService.selectByPrimaryKey(userEntityKey);
    }

    /**
     * 查询全量UserEntityWithBLOBs
     */
    @PostMapping("Q02")
    List<UserEntityWithBLOBs> findUserEntityBLOBsAll(){
        return userService.findUserEntityBLOBsAll();
    }
}
