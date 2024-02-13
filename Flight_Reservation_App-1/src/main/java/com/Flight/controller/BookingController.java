package com.Flight.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight.Services.ReservationService;
import com.Flight.entity.Reservation;


@Controller
public class BookingController {
	
@Autowired
 ReservationService reservationService;
	
	@RequestMapping("/bookingDetails")
	
	public String BookController() {
		return"BookingDetails";
	}
	@RequestMapping("/bookingSearch")
	public String bookingSearch(@RequestParam(name="flightId",required =false,defaultValue="-1") long id, ModelMap model) {
		try {
			if(id<=0) {
				model.addAttribute("msg","Invalid or missing Booking Id");
				return "BookingDetails";
			}
		
	Optional<Reservation> findCheckIn = reservationService.findByID(id);
	
	if(findCheckIn.isPresent()) {
		Reservation reservation=findCheckIn.get();
		model.addAttribute("reservation",reservation);
		return "Booking";
}else {
	model.addAttribute("msg","Booking not found By id");
	return"BookingDetails";
		}
	} catch(Exception e) {
		e.printStackTrace();
	
		return"BookingDetails";
	}
	
	
	}	
}
	

