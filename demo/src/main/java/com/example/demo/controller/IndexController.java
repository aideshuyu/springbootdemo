package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class IndexController {

    @Resource
    public DataSource dataSource;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String gotoWelcom(){

        return "pages/welcome";
    }

    @RequestMapping("/login")
    public String goToLoginPage(){
        return "login";
    }


}
