package com.example.spring.controller;

import com.example.spring.service.Service4;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main22")
public class Controller22 {
    private final Service4 service4;

    @GetMapping("sub1")
    public String sub1() {
        service4.action1();
        return "main22/sub1";
    }

    @GetMapping("sub2")
    public String sub2() {
        // 연습 
        // 상품 정보를 7개씩
        // 1페이지, 2페이지 내용을 출력
        service4.action2();

        return "main22/sub2";
    }

    @GetMapping("sub3")
    public String sub3() {
        service4.action3();
        return "main22/sub3";
    }

    @GetMapping("sub4")
    public String sub4() {
        service4.action4();
        return "main22/sub4";
    }
}
