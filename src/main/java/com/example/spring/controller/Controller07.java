package com.example.spring.controller;

import com.example.spring.dto.MyBean57;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main7")
public class Controller07 {

    @RequestMapping("sub1")
    public String sub1(Model model) {

        model.addAttribute("aiList", List.of("gpt", "gemini", "grok", "deep"));

        return "main7/sub1";
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {
        /*
        |번호|이름|생일|가격|
        |1  |    |   |   |
        |2  |    |   |   |
        |3  |    |   |   |
        |4  |    |   |   |
        |5  |    |   |   |
         */

        model.addAttribute("myList", List.of(
                new MyBean57("lee", "01-01", 5000),
                new MyBean57("kim", "02-02", 4000),
                new MyBean57("son", "03-03", 6000),
                new MyBean57("park", "04-04", 3000),
                new MyBean57("choi", "05-05", 7000)));

        return "main7/sub2";
    }
}
