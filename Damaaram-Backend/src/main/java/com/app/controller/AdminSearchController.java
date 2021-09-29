package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.AdminSearchService;


@RestController
@CrossOrigin
public class AdminSearchController {
	
	@Autowired
	private AdminSearchService service;
	
	
	@GetMapping("/user/{id}")
	public User getUserByID(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@GetMapping("/users/name/{name}")
	public List<User> getUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
	@GetMapping("/users/contact/{contact}")
	public List<User> getUserByContact(@PathVariable long contact) {
		return service.getUserByContact(contact);
	}
	
	@GetMapping("/users/email/{email}")
	public List<User>  getUserByEmail(@PathVariable String email) {
		return service.getUserByEmail(email);
	}
	
	

}
