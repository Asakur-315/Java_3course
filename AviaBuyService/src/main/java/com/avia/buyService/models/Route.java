package com.avia.buyService.models;

import jakarta.persistence.*;

@Entity
@Table(name="Route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer cityFrom, cityTo;
}
