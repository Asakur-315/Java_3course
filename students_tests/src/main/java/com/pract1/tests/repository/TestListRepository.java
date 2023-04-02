package com.pract1.tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract1.tests.models.TestList;


public interface TestListRepository extends JpaRepository<TestList, Integer> {
    TestList findTestListByRowId(Integer rowId);
}
