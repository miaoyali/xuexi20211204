package com.example.demo3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@Configuration
public class GlobleException implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if(ex instanceof  NullPointerException){
            modelAndView.setViewName("NullPointerException");
        }
        System.out.println(ex.toString());
        modelAndView.addObject("myerror",ex.toString());
        return modelAndView;
    }
}*/
