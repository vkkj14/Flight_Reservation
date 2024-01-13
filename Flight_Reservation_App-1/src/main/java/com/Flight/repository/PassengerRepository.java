package com.Flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> { }
