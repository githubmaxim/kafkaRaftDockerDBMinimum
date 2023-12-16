package com.example.consumer.repository;

import com.example.consumer.entity.MyEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<MyEnt, Integer> {
}
