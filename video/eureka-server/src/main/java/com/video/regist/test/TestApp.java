package com.video.regist.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestApp {
    @Value("${eureka.instance.hostname}")
    private String port;

    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String content;

    public void test(){
        System.out.println("===========================================================================================" + port);
        System.out.println("===========================================================================================" + content);
    }
}
