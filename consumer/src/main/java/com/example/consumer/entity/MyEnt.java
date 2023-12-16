package com.example.consumer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "myEnt")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MyEnt {
    @Id
    @GeneratedValue
    public Integer id;

    public String text;


}
