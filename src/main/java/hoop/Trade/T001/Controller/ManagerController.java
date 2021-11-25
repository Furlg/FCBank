package hoop.Trade.T001.Controller;

import hoop.Trade.T001.Service.ManagerServiceImp;
import hoop.message.Response;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping(value = "T001")
public class ManagerController {

    @Resource
    ManagerServiceImp managerServiceImp;

    Response response;

    /***登录模块***/
    @RequestMapping(value = "Q01",method = RequestMethod.POST)
    @ResponseBody
    public Response logIn(@RequestBody Map<String,Object> map){
        response = new Response(managerServiceImp.selectByPrimaryKey((String) map.get("managerId"), (String) map.get("password")));
        return  response;
    }
}
