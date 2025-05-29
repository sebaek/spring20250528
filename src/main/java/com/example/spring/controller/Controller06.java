package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("main6")
public class Controller06 {

    @RequestMapping("sub1")
    public String sub1(Model model) {

        model.addAttribute("cars", Set.of("tesla", "uber", "waymo"));
        model.addAttribute("list", List.of("java", "spring", "react"));

        return "main6/sub1";
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {

        return "main6/sub2";
    }

}
