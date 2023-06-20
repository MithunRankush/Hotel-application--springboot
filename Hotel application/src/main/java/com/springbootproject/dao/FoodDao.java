package com.springbootproject.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.demo.entity.Food;

@Repository
public interface FoodDao extends JpaRepository<Food,Integer> {

}
