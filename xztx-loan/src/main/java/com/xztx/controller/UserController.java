package com.xztx.controller;

import com.xztx.model.User;
import com.xztx.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取user信息
     * @return
     */
    @GetMapping("/getUser/{userId}")
    public List<User> getUserMessage(@PathVariable("userId") String userId) {
        return userService.getUserMessage(userId);
    }

}
