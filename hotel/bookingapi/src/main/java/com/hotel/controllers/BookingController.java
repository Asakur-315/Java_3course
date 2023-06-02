package com.hotel.controllers;

import com.hotel.models.Booking;
import com.hotel.models.Client;
import com.hotel.models.Room;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hotel.services.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController{
    @Autowired
    private BookingService bookingService;

    @GetMapping("")
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Booking> get(@PathVariable Integer id){
        try{
            Booking booking = bookingService.getBookingById(id);
            return new ResponseEntity<Booking>(booking, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/room-id/{roomId}")
    public List<Booking> getByRoomId(@PathVariable Room roomId){
        return bookingService.getBookingByRoomId(roomId);
    }
    
    @GetMapping("/client-id/{clientId}")
    public List<Booking> getByClientId(@PathVariable Client clientId){
        return bookingService.getBookingByClientId(clientId);
    }

    @GetMapping("start-date/{startDate}")
    public List<Booking> getByStartDate(@PathVariable String startDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate _startDate = LocalDate.parse(startDate, formatter);
        return bookingService.getBookingByStartDate(_startDate);
    }

    @GetMapping("/end-date/{endDate}")
    public List<Booking> getByEndDate(@PathVariable String endDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate _endDate = LocalDate.parse(endDate, formatter);
        return bookingService.getBookingByEndDate(_endDate);
    }

    @GetMapping("/cost/{cost}")
    public List<Booking> getByCost(@PathVariable Double cost){
        return bookingService.getBookingByCost(cost);
    }

    @PostMapping("/")
    public void add(@RequestBody Booking booking){
        bookingService.saveBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        bookingService.deleteBooking(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Booking booking, @PathVariable Integer id){
        try{
            Booking baseBooking = bookingService.getBookingById(id);
            baseBooking.updateBooking(booking);
            bookingService.saveBooking(baseBooking);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}