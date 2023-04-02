package com.pract1.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pract1.tests.models.Schedule;
import com.pract1.tests.repository.ScheduleRepository;


import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    @Autowired
    ScheduleRepository ScheduleRepository;


    @GetMapping("/all")
    public List<Schedule> allSchedules() {
        return ScheduleRepository.findAll();
    }

}
