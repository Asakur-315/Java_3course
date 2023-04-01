package com.avia.buyService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avia.buyService.models.Route;

public interface RouteRepository extends JpaRepository<Route,Integer>{
    
}
