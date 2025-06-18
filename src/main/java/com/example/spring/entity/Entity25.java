package com.example.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "my_table25", schema = "jpa")
public class Entity25 {
    @EmbeddedId
    private Entity25Id id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "score")
    private Integer score;

}