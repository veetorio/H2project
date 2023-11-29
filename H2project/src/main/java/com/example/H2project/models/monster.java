package com.example.H2project.models;

import jakarta.persistence.*;

@Entity
public class monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome",length = 30,nullable = false)
    private String name;
    @Column(name = "descricao",length = 30,nullable = false)
    private String describe;

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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public monster() {
    }
}
