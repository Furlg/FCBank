package com;

import com.trade.D001.T0001.Entity.UserEntityKey;
import com.trade.D001.T0001.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Callable;

@SpringBootTest
class FcserviceApplicationTests {

    @Autowired
    UserService userService;


    @Test
    void contextLoads() {
    }

}
