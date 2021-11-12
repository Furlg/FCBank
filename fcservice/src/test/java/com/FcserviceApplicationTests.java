package com;

import com.trade.D001.T0001.Service.UserServiceImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FcserviceApplicationTests {

    @Autowired
    UserServiceImp userService;

    @Test
    void contextLoads() {
        System.out.println(userService.findUserEntityBLOBsAll());
    }

}
