package com.chen.service.impl;

import com.chen.service.IndexService;
import org.springframework.stereotype.Service;

/**
 * Created by cvter on 2017/6/29.
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public String sayHello(String name) {
        return "hello " +  name;
    }
}
