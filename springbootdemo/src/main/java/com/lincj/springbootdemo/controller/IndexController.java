package com.lincj.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        return modelAndView;
        return "index";
    }

}
