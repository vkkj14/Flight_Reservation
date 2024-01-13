package com.Flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Flight.Services.ReservationService;
import com.Flight.dto.ReservationRequest;
import com.Flight.entity.Reservation;

@Controller
public class ReservationController {
@Autowired
private ReservationService reservationService;
@RequestMapping("/confirmReservation")
public String confirmReservation(ReservationRequest request, ModelMap model) {
Reservation reservationId = reservationService.bookFlight(request);
model.addAttribute("reservationId", reservationId.getId());
return "ConfirmReg";
}
}
