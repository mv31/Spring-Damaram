package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.RegistrationService;
//import com.app.service.impl;

@RestController
@CrossOrigin
public class RegistrationController {
	
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmail();
		return service.fetchUserByEmail(tempEmail,user);
		
	}
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmail();
		String tempPass = user.getPassword();
		
		return service.fetchUserByEmailAndPassword(tempEmail, tempPass);
	}
}

