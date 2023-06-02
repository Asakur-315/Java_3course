package com.pract1.tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract1.tests.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUsersByRoleId(Integer roleId);
}
