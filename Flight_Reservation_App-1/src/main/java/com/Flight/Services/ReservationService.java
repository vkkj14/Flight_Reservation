package com.Flight.Services;

import com.Flight.dto.ReservationRequest;
import com.Flight.entity.Reservation;

public interface ReservationService {
Reservation bookFlight(ReservationRequest request);

}
