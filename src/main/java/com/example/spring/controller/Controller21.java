package com.example.spring.controller;

import com.example.spring.service.Service3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main21")
public class Controller21 {

    private final Service3 service3;

    @GetMapping("sub1")
    public String sub1() {

        service3.action1();

        return "main21/sub1";
    }

    @GetMapping("sub2")
    public String sub2() {
        service3.action2();

        return "main21/sub2";
    }

    @GetMapping("sub3")
    public String sub3() {
        service3.action3();
        return "main21/sub3";
    }

    // /main21/sub4?country=mexico
    @GetMapping("sub4")
    public String sub4(String country) {
        service3.action4(country);

        return "main21/sub4";
    }

    // 연습
    // get /main21/sub5?city=berlin
    // service3.action5()
    // entity16Repository.query2()
    @GetMapping("sub5")
    public String sub5(String city) {
        service3.action5(city);

        return "main21/sub4";
    }

    // get /main21/sub6?city1=berlin&city2=london
    @GetMapping("sub6")
    public String sub6(String city1, String city2) {
        service3.action6(city1, city2);

        return "main21/sub6";
    }

    // get /main21/sub7?start=1950-01-01&end=1959-12-31
    // controller.sub7()
    // service.action7()
    // entity17repository.query1()
    // SELECT * FROM employee WHERE birth_date BETWEEN :start AND :end
}
