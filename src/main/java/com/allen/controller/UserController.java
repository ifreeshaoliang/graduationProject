package com.allen.controller;

import com.alibaba.fastjson.JSON;
import com.allen.pojo.User;
import com.allen.service.Impl.UserServiceImpl;
import com.allen.utils.JWTUtil;
import com.allen.utils.constants.JWTConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author ifree
 */
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
//@CrossOrigin
@RestController
public class UserController {
    private UserServiceImpl userService;

    @Autowired
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }


    @RequestMapping("/user")
    String user() {
        return JSON.toJSONString(userService.queryAllUser());
    }

    @PostMapping("/user/login/{user}")
    String userLogin(@PathVariable("user") User user, HttpServletResponse response) throws Exception {
        final User user1 = userService.queryUserByAccountPassword(user.getUserAccount(), user.getUserPassword());
        if (user1 == null) {
            return "loginError";
        }
        else {
            final String jwt = JWTUtil.createJWT(user.getUserID() + "", user.getUserAccount(), JWTConstant.JWT_TIME_TO_LIVE_MILLIS);
            response.addHeader(JWTConstant.HEADER_TOKEN, JWTConstant.HEADER_TOKEN_PREFIX+jwt);
            return "loginSucceeded";
        }
    }

}
