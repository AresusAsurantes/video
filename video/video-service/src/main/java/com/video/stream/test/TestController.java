package com.video.stream.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @ResponseBody
    @GetMapping("test")
    public String testVideo(){
        return "test service is running!!!!!!!!!!!!!!!";
    }
}
