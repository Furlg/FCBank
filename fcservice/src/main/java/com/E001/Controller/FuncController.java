package com.E001.Controller;

import com.E001.Entity.Func;
import com.E001.Service.FuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("E001")
public class FuncController {

    @Autowired
    FuncService funcService;

    @PostMapping("selectFunc")
    public Func selectByPrimaryKey(){
        return funcService.selectByPrimaryKey("ssh");
    }
}
