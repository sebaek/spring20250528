package com.example.spring.service;

import com.example.spring.entity.Entity16;
import com.example.spring.repository.Entity16Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Service3 {

    private final Entity16Repository entity16Repository;

    public void action1() {
        // findById() : pk로 하나의 레코드 조회
        Entity16 entity16 = entity16Repository.findById(1).get();
        System.out.println(entity16);
    }

    public void action2() {
        // findAll() : 모든 레코드 조회
        List<Entity16> list = entity16Repository.findAll();
        System.out.println(list.size());
    }
}
