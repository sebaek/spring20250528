package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {
    @RequestMapping("sub1")
    public String sub1(){


        return "main8/sub1";
    }

}
