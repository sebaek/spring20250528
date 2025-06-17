package com.example.spring.service;

import com.example.spring.entity.Entity16;
import com.example.spring.entity.Entity19;
import com.example.spring.repository.Entity16Repository;
import com.example.spring.repository.Entity19Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Service4 {
    private final Entity16Repository entity16Repository;
    private final Entity19Repository entity19Repository;

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

    public void action2() {
        System.out.println("########### 1 page ##############");
        List<Entity19> list1 = entity19Repository.findAll(PageRequest.of(1 - 1, 7)).getContent();
        for (Entity19 entity19 : list1) {
            System.out.println(entity19);
        }

        System.out.println("########### 2 page ##############");
        List<Entity19> list2 = entity19Repository.findAll(PageRequest.of(2 - 1, 7)).getContent();
        for (Entity19 entity19 : list2) {
            System.out.println(entity19);
        }
    }

    public void action3() {
        // 페이징 and 정렬
        System.out.println("########### 1 page ##############");
        List<Entity19> list1 = entity19Repository
                .findAll(PageRequest.of(1 - 1, 7, Sort.by("productName")))
                .getContent();
        for (Entity19 entity19 : list1) {
            System.out.println(entity19);
        }
    }

    public void action4() {
        // 계약명 기준 역순 으로 1페이지 출력하기 (1페이지에 10개 데이터)
        List<Entity16> list1 = entity16Repository
                .findAll(PageRequest.of(1 - 1, 10, Sort.by("contactName").descending()))
                .getContent();

        for (Entity16 entity16 : list1) {
            System.out.println(entity16);
        }
    }

    public void action5() {
        // 가격 역순으로 10개씩 1페이지 상품 내용 보기
        
    }
}
