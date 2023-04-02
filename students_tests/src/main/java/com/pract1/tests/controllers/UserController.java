package com.pract1.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pract1.tests.models.User;
import com.pract1.tests.repository.UserRepository;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("")

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/teachers")
    public List<User> getTeachers() {
        return userRepository.findUsersByRoleId(3);
    }
    
    @GetMapping("/students")
    public List<User> getStudents() {
        return userRepository.findUsersByRoleId(1);
    }

}
