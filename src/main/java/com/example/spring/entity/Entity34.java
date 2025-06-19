package com.example.spring.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "my_table34")
public class Entity34 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String name;
    private LocalDate birthDate;
    private String info;
}
