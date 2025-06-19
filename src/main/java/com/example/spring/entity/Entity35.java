package com.example.spring.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "my_table35")
public class Entity35 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lectureTitle;
    private String info;
    private String place;
}
