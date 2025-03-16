package com.example.kubotravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kubotravel.entity.House;

public interface HouseRepository extends JpaRepository<House, Integer> {

}
