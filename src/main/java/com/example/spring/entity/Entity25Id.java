package com.example.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class Entity25Id implements Serializable {
    private static final long serialVersionUID = -238409536354227771L;
    @Column(name = "class_number", nullable = false)
    private Integer classNumber;

    @Column(name = "student_number", nullable = false)
    private Integer studentNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Entity25Id entity = (Entity25Id) o;
        return Objects.equals(this.studentNumber, entity.studentNumber) &&
                Objects.equals(this.classNumber, entity.classNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNumber, classNumber);
    }

}