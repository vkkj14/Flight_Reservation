package com.Flight.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flight.dto.ReservationRequest;
import com.Flight.entity.Flight;
import com.Flight.entity.Passenger;
import com.Flight.entity.Reservation;
import com.Flight.repository.FlightRepository;
import com.Flight.repository.PassengerRepository;
import com.Flight.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
@Autowired
private PassengerRepository passengerRepo;
@Autowired
private FlightRepository flightRepo;
@Autowired
private ReservationRepository reservationRepo;
//@Autowired
//private PDFgenerator pdfGenerator;
//@Autowired
//private EmailUtil emailUtil;
@Override
public Reservation bookFlight(ReservationRequest request) {
	
	Passenger passenger = new Passenger();
	passenger.setFirstName(request.getFirstName());
	passenger.setMiddleName(request.getMiddleName());
	passenger.setLastName(request.getLastName());
	passenger.setEmail(request.getEmail());
	passenger.setPhone(request.getPhone());
	passengerRepo.save(passenger);
	
	long flightId = request.getFlightId();
	Optional<Flight> findById = flightRepo.findById(flightId);
	Flight flight = findById.get();
	Reservation reservation = new Reservation();
	reservation.setFlight(flight);
	reservation.setPassenger(passenger);
	reservation.setCheckedIn(false);
	reservation.setNumberOfBags(0);
//	String filePath = "C:\\ishaan\\sts 14\\FlightReservationapp\\tickets\\reservation" + 
//	reservation.getId();
	reservationRepo.save(reservation);
//	pdfGenerator.generateItinerary(reservation, filePath);
//	emailUtil.sendItinerary(passenger.getEmail(), filePath);
	return reservation;
	} 
}
	