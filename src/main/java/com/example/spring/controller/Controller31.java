package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/api/main31")
@ResponseBody
public class Controller31 {

    @PostMapping("sub1")
    public String sub1(
            @RequestParam("name") String name,
            @RequestParam("age") Integer age,
            @RequestParam("myFiles[]") MultipartFile[] files) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        if (files != null && files.length > 0) {
            for (MultipartFile file : files) {
                System.out.println("file = " + file.getOriginalFilename());
                System.out.println("file = " + file.getSize());
            }
        }

        return null;
    }

    @PostMapping("sub2")
    public String sub2(String address, Double score,
                       @RequestParam("yourFiles[]")
                       MultipartFile[] yourFiles) {
        System.out.println("address = " + address);
        System.out.println("score = " + score);
        if (yourFiles != null && yourFiles.length > 0) {
            for (MultipartFile file : yourFiles) {
                System.out.println("file = " + file.getOriginalFilename());
                System.out.println("file = " + file.getSize());
            }
        }
        System.out.println();

        return null;
    }
}
