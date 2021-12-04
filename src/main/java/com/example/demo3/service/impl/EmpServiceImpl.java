package com.example.demo3.service.impl;

import com.example.demo3.service.EmpService;
import com.example.demo3.shuju.EmpClass;
import com.example.demo3.shuju.repository.EmpRepository1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    EmpRepository1 empRepository1;


    @Override
    public EmpClass findOne(String name) {

        return empRepository1.findOne(name);
    }
}
