package com.pract1.tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract1.tests.models.StudentAnswer;

import java.util.List;

public interface StudAnswRepository extends JpaRepository<StudentAnswer, Integer> {
    List<StudentAnswer> findAllByUserId(Integer user_id);
}
