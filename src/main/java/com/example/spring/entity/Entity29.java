package com.example.spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "my_table29", schema = "jpa")
@ToString
public class Entity29 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name", length = 10)
    private String firstName;

    @Column(name = "last_name", length = 10)
    private String lastName;

    @Column(name = "birth_date")
    private LocalDate birthDate;

}