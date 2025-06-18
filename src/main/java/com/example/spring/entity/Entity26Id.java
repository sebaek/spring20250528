package com.example.spring.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Entity26Id implements Serializable {
    private String name;
    private Integer number;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entity26Id that = (Entity26Id) o;
        return Objects.equals(name, that.name) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
