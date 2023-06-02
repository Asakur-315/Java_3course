package com.hotel.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity(name="additionalService")
@Data
public class AddServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private Double price;

    @ManyToMany(mappedBy = "AddServiceSet")
    private Set<Booking> bookingSet;
}
