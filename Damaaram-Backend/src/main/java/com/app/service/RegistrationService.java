package com.app.service;

import org.springframework.aop.ThrowsAdvice;

import com.app.model.Admin;
import com.app.model.User;

public interface RegistrationService {
	
	//public User saveUser(User user);
	public User fetchUserByEmail(String email,User user) throws Exception;
	public User fetchUserByEmailAndPassword(String email, String Password) throws Exception;
	public Admin fetchAdminByAdminEmailAndAdminPassword(String adminEmail, String adminPassword) throws Exception;
}
