package com.Flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	
}