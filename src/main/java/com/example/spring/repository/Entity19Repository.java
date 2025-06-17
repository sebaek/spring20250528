package com.example.spring.repository;

import com.example.spring.entity.Entity19;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Entity19Repository extends JpaRepository<Entity19, Integer> {
    // findById

    // 연습 7개 메소드 만들기
    // SELECT * FROM product WHERE category_id = :categoryId

    // SELECT * FROM product WHERE supplier_id = :supplierId

    // SELECT * FROM product WHERE price BETWEEN :p1 AND :p2

    // SELECT * FROM product WHERE price >= :price

    // SELECT * FROM product WHERE category_id IN (?, ?...?)

    // SELECT * FROM product WHERE product_name LIKE :keyword
    // with wildcard
    // without wildcard
}