package com.Flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight.entity.User;
import com.Flight.repository.UserRepository;


@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;

	@RequestMapping("/Home")
	public String homepage() {
	return "Home";
	}
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
	return "login";
	}
	
	@RequestMapping("/showReg")
	public String showReg() {
	return "ShowReg";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") User user) {
	userRepo.save(user);
	return "login";
	}
	

	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId, @RequestParam("password") 
	String password , ModelMap model) {
	User user = userRepo.findByEmail(emailId);
	if(user!=null) {
	if(user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
	return "Search";
	}else {
	model.addAttribute("error", "Invalid username/password");
	return "login";
	}
	}else {
	model.addAttribute("error", "Invalid username/password");
	return "login";
}
	}
  }

