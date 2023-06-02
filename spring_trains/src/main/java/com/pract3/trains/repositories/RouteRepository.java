package com.pract3.trains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract3.trains.models.Route;

public interface RouteRepository extends JpaRepository<Route,Integer> {
    
}
