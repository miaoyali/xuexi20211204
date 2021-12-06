
package com.example.demo3.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TryAspectClass {

    @Before("execution(* com.example.demo3.controller.*.*(..))")
    public void  doSome(){
        System.out.println("doSome");
    }

}


