package com.exam.shopwarehouse;

import jakarta.persistence.*;

@Entity
@Table(name = "goods")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer quantity;

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

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
