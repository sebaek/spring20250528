package com.example.spring.controller;

import com.example.spring.service.Service5;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("main23")
public class Controller23 {
    private final Service5 service5;

    // /main23/sub1?page=3
    @GetMapping("sub1")
    public String sub1(@RequestParam(defaultValue = "1") Integer page) {
        service5.action1(page);

        return "main23/sub1"; // Exception
    }

    // /main23/sub2?country=mexico
    @GetMapping("sub2")
    public String sub2(String country) {
        service5.action2(country);

        return "main23/sub2";
    }

    // /main23/sub3?country=mexico&page=1
    @GetMapping("sub3")
    public String sub3(String country,
                       @RequestParam(defaultValue = "1") Integer page) {
        service5.action3(country, page);

        return "main23/sub3";
    }

    // 연습
    // get /main23/sub4?keyword=alex&page=2
    // 고객명 또는 고객의계약명 에  "alex"가 포함된 고객들 조회 with paging
    // request handler method, service.action4(), repository 메소드
    
}
