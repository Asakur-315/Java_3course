package com.pract3.trains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract3.trains.models.City;

public interface CityRepository extends JpaRepository<City,Integer> {
    
}
