package com.example.core.app3;

import org.springframework.boot.SpringApplication;

public class App3 {
    public static void main(String[] args) {
        var context = SpringApplication.run(App3.class, args);

        // context 에서 getBean() 메소드로
        // com.example.core.app3.Controller1 로 만든 객체 꺼내서
        // method1() 실행시켜보기
    }
}
