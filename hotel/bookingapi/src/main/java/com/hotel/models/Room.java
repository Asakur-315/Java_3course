package com.hotel.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
@Entity(name="room")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private Integer floor;
    private String type;
    private Double price;

    @OneToMany(mappedBy = "roomId")
    @JsonIgnore
    private Set<Booking> bookingSetRoom;
}
