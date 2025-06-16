package com.example.spring.service;

import com.example.spring.entity.Entity1;
import com.example.spring.entity.Entity2;
import com.example.spring.entity.Entity3;
import com.example.spring.repository.Entity1Repository;
import com.example.spring.repository.Entity2Repository;
import com.example.spring.repository.Entity3Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Service2 {

    private final Entity1Repository entity1Repository;
    private final Entity2Repository entity2Repository;
    private final Entity3Repository entity3Repository;

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

}
