package com.trade.D001.T0002.Controller;

import com.message.Response;
import com.trade.D001.T0002.Service.CompanyService;
import com.trade.D001.T0002.Service.CompanyServiceImp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "T0002")
public class CompanyController {

    @Resource
    CompanyServiceImp companyServiceImp;

    Response response ;
    @PostMapping(value = "Q01")
    public Response selectByPrimaryKey(){
        response = new Response(companyServiceImp.selectByPrimaryKey("10000810"));
        return  response;
    }
}
