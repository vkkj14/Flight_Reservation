package com.Flight.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight.entity.Flight;
import com.Flight.repository.FlightRepository;

@Controller
public class FlightController {
@Autowired
private FlightRepository flightRepo;
@RequestMapping("/findFlights")
public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
@RequestParam("departureDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date departureDate, ModelMap model) {
List<Flight> findFlights = flightRepo.findFlights(from , to , departureDate);
model.addAttribute("findFlights", findFlights);
return "Display";
}
}
