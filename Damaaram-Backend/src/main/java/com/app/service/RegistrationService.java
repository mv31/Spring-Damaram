package com.app.service;

import com.app.model.User;

public interface RegistrationService {
	
	//public User saveUser(User user);
	public User fetchUserByEmail(String email,User user);
	public User fetchUserByEmailAndPassword(String email, String Password);
	
}
