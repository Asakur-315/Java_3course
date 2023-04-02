package com.pract3.trains.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pract3.trains.models.Train;
import com.pract3.trains.repositories.TrainRepository;

@RestController
@RequestMapping("/trains")
public class TrainController {
    @Autowired
    TrainRepository trainRepository;

    @GetMapping("")
    public List<Train> getAllTrains(){
        return trainRepository.findAll();
    }

    @GetMapping("/{id}")
    public Train getTrainById(@PathVariable(value="id") Integer id){
        return trainRepository.findById(id).get();
    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Train train){
        trainRepository.save(train);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
