package com.example.spring.controller;

import com.example.spring.dto.MyBean053;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main8")
public class Controller08 {
    @RequestMapping("sub1")
    public String sub1(Model model) {

        model.addAttribute("students",
                List.of(new MyBean053(10, 33.3, "trump", true),
                        new MyBean053(20, 44.4, "donald", false),
                        new MyBean053(30, 55.5, "musk", true),
                        new MyBean053(40, 66.6, "elvis", false),
                        new MyBean053(50, 77.7, "elon", true)));


        return "main8/sub1";
    }

}
