package com.pract3.trains.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pract3.trains.models.City;
import com.pract3.trains.repositories.CityRepository;
import com.pract3.trains.services.CityService;


@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CityService cityService;

    @GetMapping("")
    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable(value="id") Integer id){
        return cityRepository.findById(id).get();
    }
    
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody City city){
        cityRepository.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@RequestBody City city, @PathVariable Integer id){
        City cityOr = cityRepository.findById(id).get();
        cityOr.setName(city.getName());
        cityRepository.save(cityOr);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
