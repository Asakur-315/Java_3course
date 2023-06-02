package com.pract3.trains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract3.trains.models.Train;

public interface TrainRepository extends JpaRepository<Train,Integer> {
    
}
