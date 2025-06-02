package com.example.spring.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("main11")
public class Controller11 {

    @GetMapping("sub1")
    public String sub1() {
        System.out.println("Controller11.sub1");
        return "main11/sub1";
    }


    // HttpSession : session 객체의 타입
    @PostMapping("sub1")
    public String sub2(String[] item, HttpSession session) {
        System.out.println("Controller11.sub2");
        System.out.println("Arrays.toString(item) = " + Arrays.toString(item));

        // getAttribute: session 에서 attribute 꺼내기
        var map = (Map<String, Integer>) session.getAttribute("cart");

        if (map == null) {
            // setAttribute : session 에 attribute 넣기
            session.setAttribute("cart", new HashMap<String, Integer>());
        }

        if (item != null && item.length > 0) {
            for (String i : item) {
                if (map.containsKey(i)) {
                    Integer count = map.get(i);
                    map.put(i, count + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        return "main11/sub1";
    }
}
