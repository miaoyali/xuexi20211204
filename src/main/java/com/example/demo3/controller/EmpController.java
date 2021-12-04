package com.example.demo3.controller;

import com.example.demo3.service.EmpService;
import com.example.demo3.shuju.EmpClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmpController {
    @Resource
    private EmpService empService;

    @RequestMapping(value = "/huoqu/{name}")
    private EmpClass findOne(@PathVariable("name") String name){
        System.out.println(name);
        return empService.findOne(name);
    }
/*@RequestMapping(value = "/huoqu")
private EmpClass findOne(String name){
    return new EmpClass();
}*/
}
