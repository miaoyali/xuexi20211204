package com.example.demo3.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClass {
    @RequestMapping(value = "/sayHello")
    private String sayHello(){
        Logger logger = LoggerFactory.getLogger(HelloClass.class);
        logger.info("hhh");
        return "hello";
    }
}
