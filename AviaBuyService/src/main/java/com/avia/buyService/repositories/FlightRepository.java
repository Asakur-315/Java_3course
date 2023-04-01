package com.avia.buyService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avia.buyService.models.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer>{
    
}
