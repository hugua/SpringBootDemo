package com.chen.controller;

import com.chen.service.IndexServiceTest;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SpringBootTest
@AutoConfigureMockMvc
public class IndexControllerTest extends AbstractTestNGSpringContextTests{
    Logger LOGGER = LoggerFactory.getLogger(IndexServiceTest.class);

    @Autowired
	private MockMvc mockMvc;

    @Before

    @DataProvider(name = "index_test_cases")
    public Object[][] index_test_cases(){
        return new Object[][]{{"chen"},{"test"}};
    }
	@Test(description = "indexControllerTest",dataProvider = "index_test_cases")
	public void indexControllerTest(String name) throws Exception{
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/")
                .param("name",name);
        String result = mockMvc.perform(requestBuilder)
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse()
                .getContentAsString();
        LOGGER.info("indexControllerTest result===========> " + result);
    }

}
