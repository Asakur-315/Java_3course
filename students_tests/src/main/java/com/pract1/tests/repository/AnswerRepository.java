package com.pract1.tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract1.tests.models.Answer;


public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Answer findAnswerByRowId(Integer rowId);
}
