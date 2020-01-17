package com.xd.admin.controller;

import com.xd.admin.service.UserService;
import com.xd.common.domain.Api;
import com.xd.common.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.admin.controller
 */
@EnableSwagger2
@RestController
public class UserController {
    @Value("${server.port}")  //该服务的端口号
    private String port;
    @Autowired
    private UserService userService;

//    根据Id查询用户
    @ApiOperation(value = "根据Id查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid",value = "用户Id",required = true,dataType = "String",paramType = "path")
    })
    @RequestMapping(value = "GetUserById/{userid}",method = RequestMethod.GET)
    public Api GetUserById(@PathVariable(value = "userid") String userid){
        Api api = new Api();
        System.out.printf("\n\nid="+userid);
        User user = userService.selectUserById(userid);
        api.setCode(200);
        api.setMessage("成功");
        api.setData(user);
        return api;
    }
}
