package com.example.demo3.controller;

import com.example.demo3.service.EmpService;
import com.example.demo3.shuju.EmpClass;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api
public class EmpController {

    @Resource
    private EmpService empService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    //http://localhost:8080/swagger-ui.html
    @RequestMapping(value = "/huoqu/{name}" , method = RequestMethod.GET)
    @ApiOperation(value = "根据姓名查找员工全部信息")
    public EmpClass findOne(@PathVariable("name") String name){
        System.out.println("进入根据姓名查找员工全部信息的方法了");
        //redisTemplate.opsForValue().set("HHH","123");
        //System.out.println(redisTemplate.opsForValue().get("HHH"));
        return empService.findOne(name);
    }

}
