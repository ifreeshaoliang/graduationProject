package com.allen.controller;

import com.alibaba.fastjson.JSON;
import com.allen.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ifree
 */
@RestController
public class UserController {
    private UserServiceImpl userService;

    @Autowired
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @CrossOrigin
    @RequestMapping("/user")
    String User() {
        return JSON.toJSONString(userService.queryAllUser());
    }
}
