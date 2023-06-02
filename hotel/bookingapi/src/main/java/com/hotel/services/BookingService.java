package com.hotel.services;

import com.hotel.models.Booking;
import com.hotel.models.Room;
import com.hotel.models.Client;

import jakarta.transaction.Transactional;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.repos.BookingRepo;

public class BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    public List<Booking> getAllBookings(){
        return bookingRepo.findAll();
    }

    public List<Booking> getBookingByRoomId(Room room){
        return bookingRepo.findByRoomId(room);
    }
    public List<Booking> getBookingByClientId(Client client){
        return bookingRepo.findByClientId(client);
    }
    public List<Booking> getBookingByStartDate(LocalDate date){
        return bookingRepo.findByStartDate(date);
    }
    public List<Booking> getBookingByEndDate(LocalDate date){
        return bookingRepo.findByEndDate(date);
    }
    public List<Booking> getBookingByCost(Double cost){
        return bookingRepo.findByCost(cost);
    }

    public void saveBooking(Booking booking){
        bookingRepo.save(booking);
    }
    public void deleteBooking(Integer id){
        bookingRepo.deleteById(id);
    }

    public Booking getBookingById(Integer id){
        return bookingRepo.findById(id).orElse(null);
    }

}
