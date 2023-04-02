package com.pract3.trains.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    //@SequenceGenerator(name = "id_generator", sequenceName = "cities_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
