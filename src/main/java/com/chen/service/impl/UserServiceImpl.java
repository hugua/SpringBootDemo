package com.chen.service.impl;

import com.chen.dao.UserMapper;
import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cvter on 2017/6/29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Resource
    private StringRedisTemplate template;
    @Override
    public List<User> listUser() {
        template.opsForValue().set("chen","weifeng");
        return userMapper.listUsers();
    }
}
