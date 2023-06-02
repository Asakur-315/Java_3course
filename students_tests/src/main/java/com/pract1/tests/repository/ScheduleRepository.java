package com.pract1.tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract1.tests.models.Schedule;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
    List<Schedule> findAllByGroupId(Integer group_id);
}
