package com.example.spring.service;

import com.example.spring.entity.Entity16;
import com.example.spring.repository.Entity16Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Service4 {
    private final Entity16Repository entity16Repository;

    public void action1() {
        System.out.println("11111111111111111111111111111111111111");
        // paging
        Page<Entity16> list1 = entity16Repository.findAll(PageRequest.of(1 - 1, 10));
        List<Entity16> data1 = list1.getContent();
        for (Entity16 entity16 : data1) {
            System.out.println(entity16);
        }

        System.out.println("222222222222222222222222222222222222222");
        List<Entity16> list2 = entity16Repository.findAll(PageRequest.of(2 - 1, 10)).getContent();
        for (Entity16 entity16 : list2) {
            System.out.println(entity16);
        }


    }
}
