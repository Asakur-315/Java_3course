package com.pract1.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pract1.tests.models.Answer;
import com.pract1.tests.repository.AnswerRepository;


import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    AnswerRepository answerRepository;


    @GetMapping("/all")
    public List<Answer> allAnswers() {
        return answerRepository.findAll();
    }

}
