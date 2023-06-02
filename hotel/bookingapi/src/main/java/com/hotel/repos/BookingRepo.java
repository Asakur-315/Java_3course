package com.hotel.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.models.Booking;
import com.hotel.models.Client;
import com.hotel.models.Room;

public interface BookingRepo extends JpaRepository<Booking, Integer> {
    List<Booking> findByRoomId(Room roomId);
    List<Booking> findByClientId(Client clientId);
    List<Booking> findByStartDate(LocalDate startDate);
    List<Booking> findByEndDate(LocalDate endDate);
    List<Booking> findByCost(Double cost);
}
