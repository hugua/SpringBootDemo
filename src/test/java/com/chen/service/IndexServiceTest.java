package com.chen.service;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by cvter on 2017/6/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexServiceTest extends AbstractTestNGSpringContextTests{
    Logger LOGGER = LoggerFactory.getLogger(IndexServiceTest.class);
    @Resource
    IndexService indexService;

    @DataProvider(name = "index_test_cases")
    public Object[][] index_test_cases(){
        return new Object[][]{{"chen"},{"test"}};
    }

    @Test(description = "indexServiceTest",dataProvider ="index_test_cases" )
    public void indexServiceTest(String name){
        LOGGER.info(indexService.sayHello(name));
    }

}
