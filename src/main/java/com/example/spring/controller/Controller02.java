package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class Controller02 {

    // /main2/sub1?name
    @RequestMapping(value = "/main2/sub1", params = "name")
    public void sub1(WebRequest request) {
        // header 정보
        request.getHeader("User-Agent");


        System.out.println("Controller02.sub1");
    }

    // /main2/sub2?name&address
    // ? : query string
    // query string : name1=value1&name2=value2
    @RequestMapping(value = "/main2/sub2", params = {"name", "address"})
    public void sub2(WebRequest request) {

        System.out.println("Controller02.sub2");
    }

    // /main2/sub3?name=musk
    @RequestMapping(value = "/main2/sub3", params = "name")
    public void sub3(WebRequest request) {
        String name = request.getParameter("name");
        System.out.println("name = " + name);
        System.out.println("Controller02.sub3");
    }

    // /main2/sub3?address=seoul
    // /main2/sub3?address=jeju
    @RequestMapping(value = "/main2/sub3", params = "address")
    public void sub4(WebRequest request) {
        // address request parameter 를 얻어서 출력하는 코드
        
        System.out.println("Controller02.sub4");
    }
}
