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

    @RequestMapping("/")
    public String index(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        return modelAndView;
        Connection connection = null;
        try{
            connection = dataSource.getConnection();
            System.out.println(connection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return "index";
    }



}
