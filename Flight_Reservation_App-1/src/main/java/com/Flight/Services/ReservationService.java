package com.Flight.Services;

import java.util.Optional;

import com.Flight.dto.ReservationRequest;
import com.Flight.entity.Reservation;

public interface ReservationService {
Reservation bookFlight(ReservationRequest request);
Optional<Reservation> findByID(long id);

}
