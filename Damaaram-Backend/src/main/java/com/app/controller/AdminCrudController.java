package com.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.AdminCrudService;



@RestController
@CrossOrigin

public class AdminCrudController {

	@Autowired
	private AdminCrudService service;
	
	
	@GetMapping("/user/{id}")
	public User getUserByID(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@PostMapping("/User")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		 service.deleteUser(id);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

