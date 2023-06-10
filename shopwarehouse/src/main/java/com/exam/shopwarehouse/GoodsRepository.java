package com.exam.shopwarehouse;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.shopwarehouse.Good;

public interface GoodsRepository extends JpaRepository<Good,Integer> {
    void deleteById(Integer id);
    Good findByid(Integer id);
}
