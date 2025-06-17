package com.example.spring.repository;

import com.example.spring.entity.Entity19;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Entity19Repository extends JpaRepository<Entity19, Integer> {
    // findById

    // 연습 8개 메소드 만들기
    // SELECT * FROM product WHERE category_id = :categoryId
    List<Entity19> findByCategoryId(Integer id);

    // SELECT * FROM product WHERE supplier_id = :supplierId
    List<Entity19> findBySupplierId(Integer id);

    // SELECT * FROM product WHERE price BETWEEN :p1 AND :p2
    List<Entity19> findByPriceBetween(Double lower, Double higher);

    // SELECT * FROM product WHERE price >= :p1 AND price <= :p2
    List<Entity19> findByPriceGreaterThanEqualAndPriceLessThanEqual(Double lower, Double higher);

    // SELECT * FROM product WHERE price >= :price
    List<Entity19> findByPriceGreaterThanEqual(Double lower);

    // SELECT * FROM product WHERE category_id IN (?, ?...?)
    List<Entity19> findByCategoryIdIn(List<Integer> ids);

    // SELECT * FROM product WHERE product_name LIKE :keyword
    // with wildcard
    List<Entity19> findByProductNameLike(String k);

    // without wildcard
    List<Entity19> findByProductNameContaining(String k);
}