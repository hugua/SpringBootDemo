package com.chen.web.controller;

import com.chen.service.IndexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * Created by cvter on 2017/6/29.
 */
@RestController
public class IndexController {
    @Resource
    IndexService indexService;
    @GetMapping("/")
    public String getIndex(@PathParam("name") String name){
        return indexService.sayHello(name);
    }

}
