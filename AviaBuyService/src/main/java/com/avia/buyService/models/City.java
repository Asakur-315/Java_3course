package com.avia.buyService.models;

import jakarta.persistence.*;

@Entity
@Table(name="Cities")
public class City {

    private @Id @GeneratedValue Long id;
    private String name;

    City() {}

    City(String name){
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
