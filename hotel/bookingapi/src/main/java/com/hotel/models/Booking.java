package com.hotel.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity(name="booking")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="roomId", nullable = false)
    private Room roomId;

    @ManyToOne
    @JoinColumn(name="clientId", nullable = false)
    private Client clientId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate startDate, endDate;

    private Double cost;
    @ManyToMany
    @JoinTable(name = "bookingAdditionalService",
            joinColumns = {
                    @JoinColumn(name = "bookingId", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "additionalServiceId", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<AddServices> addServiceSet;

    public void updateBooking(Booking booking){
        if(booking.roomId != null){
            this.roomId = booking.roomId;
        }
        if(booking.clientId != null){
            this.clientId = booking.clientId;
        }
        if(booking.startDate != null){
            this.startDate = booking.startDate;
        }
        if(booking.endDate != null){
            this.endDate = booking.endDate;
        }
        if(booking.cost != null){
            this.cost = booking.cost;
        }
    }
}
