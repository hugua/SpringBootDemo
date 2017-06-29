package com.chen.web.task;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by cvter on 2017/6/29.
 */
@Component
public class PrintTask {
    @Scheduled(cron ="*/10 * * * * *")
    public void  print(){
        System.out.println("printTask");
    }
}
