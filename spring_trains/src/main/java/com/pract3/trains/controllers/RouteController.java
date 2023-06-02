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

import com.pract3.trains.repositories.RouteRepository;
import com.pract3.trains.models.Route;

@RestController
@RequestMapping("/routes")
public class RouteController {
    @Autowired
    RouteRepository routeRepository;

    @GetMapping("")
    public List<Route> getAllTrains(){
        return routeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Route getTrainById(@PathVariable(value="id") Integer id){
        return routeRepository.findById(id).get();
    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Route route){
        routeRepository.save(route);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}