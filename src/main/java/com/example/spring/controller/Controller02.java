package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        String address = request.getParameter("address");
        System.out.println("address = " + address);
        System.out.println("Controller02.sub4");
    }


    // @RequestParam : 해당 이름의 request parameter를 method parameter 에 binding 해줌

    // /main2/sub5?email=gmail
    @RequestMapping(value = "/main2/sub5", params = "email")
    public void sub5(@RequestParam("email") String str) {
        System.out.println("str = " + str);
    }


    // /main2/sub6?email=yahoo&age=55
    @RequestMapping(value = "/main2/sub6", params = {"email", "age"})
    public void sub6(@RequestParam("email") String str,
                     @RequestParam("age") String v) {
        System.out.println("str = " + str);
        System.out.println("v = " + v);
    }

    // /main2/sub6?email=yahoo&age=55
    @RequestMapping("/main2/sub7")
    public void sub7(@RequestParam("email") String str,
                     @RequestParam("age") String v) {
        System.out.println("str = " + str);
        System.out.println("v = " + v);
    }

    // 연습 : 아래 URL을 사용한 요청을 적절히 처리하는 메소드 작성하기
    // /main2/sub8?address=jeju&country=korea&city=gangnam
    @RequestMapping("/main2/sub8")
    public void method8(@RequestParam("address") String address,
                        @RequestParam("country") String country,
                        @RequestParam("city") String city) {

        System.out.println("address = " + address);
        System.out.println("country = " + country);
        System.out.println("city = " + city);
    }

    // /main2/sub9?city=seoul&age=44
    @RequestMapping("/main2/sub9")
    public void method9(@RequestParam("city") String city,
                        @RequestParam("age") String age) {
        System.out.println("city = " + city);
        System.out.println("age = " + age);
        int i = Integer.parseInt(age);
        System.out.println("i = " + i);
    }

    // /main2/sub10?city=seoul&age=44
    @RequestMapping("/main2/sub10")
    public void method10(@RequestParam("city") String city,
                         @RequestParam("age") int age) {
        System.out.println("city = " + city);
        System.out.println("age = " + age);
    }


    // request parameter 의 이름이 method parameter와 같으면 
    // @RequestParam의 value 속성을 생략 해도 됨
    // /main2/sub11?city=seoul&age=44
    @RequestMapping("/main2/sub11")
    public void method11(@RequestParam String city,
                         @RequestParam int age) {
        System.out.println("city = " + city);
        System.out.println("age = " + age);
    }

    // request parameter 의 이름이 method parameter와 같으면
    // @RequestParam의 value 속성을 생략 해도 됨
    // @RequestParam을 생략해도 됨
    // /main2/sub11?city=seoul&age=44
    @RequestMapping("/main2/sub12")
    public void method12(String city, int age) {
        System.out.println("city = " + city);
        System.out.println("age = " + age);
    }

    // 연습 : 아래 URL로 요청 올 때 적절히 처리하는 메소드 작성
    // /main2/sub13?email=gmail&score=88.8&married=true


}
