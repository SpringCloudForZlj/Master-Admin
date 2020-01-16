package com.xd.admin.controller;

import com.xd.admin.service.UserService;
import com.xd.common.domain.Api;
import com.xd.common.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.admin.controller
 */
@RestController
public class UserController {
    @Value("${server.port}")  //该服务的端口号
    private String port;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "GetUserById",method = RequestMethod.GET)
    public Api GetUserById(@RequestParam(value = "userid") String userid){
        Api api = new Api();
        System.out.printf("\n\nid="+userid);
        User user = userService.selectUserById();
        api.setCode(200);
        api.setMessage("成功");
        api.setData(user);
        return api;
    }
}
