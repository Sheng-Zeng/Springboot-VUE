package com.ccb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

@Controller
@RequestMapping("hello")
public class HelloController {

    @Autowired
    Calendar calendar;

    @RequestMapping("hello")
    @ResponseBody
    public String Hello() {
        System.out.println(calendar.getTime());
        System.out.println("Hello Spring");
        return "Hello";
    }

}
