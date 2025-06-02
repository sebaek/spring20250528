package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("sub1")
    public String sub1() {

        return "main9/sub1";
    }

    @RequestMapping("sub2")
    public String sub2(String name, Integer age, String address) {

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("address = " + address);

        return "main9/sub2";
    }
}
