package com.chen.web.controller;

import com.chen.pojo.User;
import com.chen.service.IndexService;
import com.chen.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by cvter on 2017/6/29.
 */
@RestController
public class UserController {
    @Resource
    UserService userService;
    @GetMapping("/user/list")
    public List<User> getIndex(@PathParam("name") String name){
        return userService.listUser();
    }

}
