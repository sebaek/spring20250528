package com.example.spring.service;

import com.example.spring.entity.Entity16;
import com.example.spring.repository.Entity16Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Service5 {
    private final Entity16Repository entity16Repository;

    public void action1(Integer page) {
        // repository 사용
        Page<Entity16> pageContent = entity16Repository
                .findAll(PageRequest.of(page - 1, 10, Sort.by("id").descending()));

        List<Entity16> content = pageContent.getContent();
        content.forEach(System.out::println);
    }

    public void action2(String country) {
        List<Entity16> list = entity16Repository
                .findByCountry(country);
        list.forEach(System.out::println);
    }

    public void action3(String country, Integer page) {
        Page<Entity16> pageContent = entity16Repository
                .findByCountry(country,
                        PageRequest.of(page - 1, 10, Sort.by("id").descending()));

        List<Entity16> content = pageContent.getContent();
        content.forEach(System.out::println);

    }
}
