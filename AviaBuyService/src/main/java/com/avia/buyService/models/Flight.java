package com.avia.buyService.models;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name="flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer routeId;
    private String aviaName;
    private Timestamp dateTime;
    private Integer duration;
}
