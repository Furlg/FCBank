package com.authbank;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("controllerTest")
@RestController
public class ControllerTest {

    @RequestMapping("/con")
    public String conTest(){
        return "sss";
    }
}
