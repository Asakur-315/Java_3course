package com.pract3.trains.services;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.pract3.trains.models.City;
import com.pract3.trains.repositories.CityRepository;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

   public void save(City city){
    cityRepository.save(city);
   }
}
