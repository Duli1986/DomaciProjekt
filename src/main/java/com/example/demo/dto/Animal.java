package com.example.demo.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "animals")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "type_sex", nullable = false)
    private String typeSex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTypesex() {
        return typeSex;
    }

    public void setTypesex(String typesex) {
        this.typeSex = typesex;
    }
}
