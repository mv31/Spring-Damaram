package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.AdminSearchService;


@RestController
public class AdminSearchController {
	
	@Autowired
	private AdminSearchService service;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.getAllUsers();
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
