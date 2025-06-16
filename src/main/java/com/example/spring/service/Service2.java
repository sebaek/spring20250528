package com.example.spring.service;

import com.example.spring.entity.*;
import com.example.spring.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Service2 {

    private final Entity1Repository entity1Repository;
    private final Entity2Repository entity2Repository;
    private final Entity3Repository entity3Repository;
    private final Entity4Repository entity4Repository;
    private final Entity5Repository entity5Repository;
    private final Entity10Repository entity10Repository;
    private final Entity11Repository entity11Repository;
    private final Entity12Repository entity12Repository;

    public void process1() {
        System.out.println("실제 업무 로직 (business logic, crud)");

    }

    public void process2() {
        // business logic

        // spring data jpa 를 사용해서 crud
        Entity1 res = entity1Repository.findById(1).get();
        System.out.println(res.getId());
        System.out.println(res.getName());
        System.out.println(res.getAddress());
        System.out.println(res.getCity());


    }

    // jpa 사용
    // 1. Entity

    /// / : table과 1대1 매칭되는 클래스
    /// / : 이 클래스로 만든 각 객체는  table의 각 행과 매치됨
    /// / : @Entity, @Table(클래스-테이블)
    /// / : @Column(클래스필드와 - 테이블컬럼)
    /// / : @Id(클래스필드 - 테이블PK)

    // 2. Repository
    public void process3() {

        Entity2 data = entity2Repository.findById(2).get();
        System.out.println(data);

    }


    // 연습
    // my_table3 과 매핑되는 Entity3 만들어 보기
    public void process4() {
        Entity3 data = entity3Repository.findById(1).get();
        System.out.println(data);
    }

    public void process5() {
        Entity4 res = entity4Repository.findById(1).get();

        System.out.println(res);
    }

    public void process6() {
        Entity5 entity5 = entity5Repository.findById(1).get();
        System.out.println(entity5);
    }

    public void process7() {
        // findById : 키(id)로 하나의 record(row)를 조회함
        Optional<Entity10> data = entity10Repository.findById(1);

        System.out.println(data.isPresent()); // true
        System.out.println(data.isEmpty()); // false

    }

    // 연습
    // entity11Repository.findById()를 사용해서 하나의 record를 조회하는
    // process8 메소드 작성
    // Controller에 request handler method
    public void process8() {
        Optional<Entity11> data = entity11Repository.findById(1);
        System.out.println(data.isPresent());
        System.out.println(data.isEmpty());
    }

    public void process9() {
        Optional<Entity12> data = entity12Repository.findById(1);
        System.out.println(data.isPresent());
        System.out.println(data.isEmpty());
    }

}
