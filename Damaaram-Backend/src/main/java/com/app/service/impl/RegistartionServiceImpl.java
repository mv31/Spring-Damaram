package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.app.model.Admin;
import com.app.model.User;
import com.app.repository.AdminRepository;
import com.app.repository.RegistrationRepository;
import com.app.service.RegistrationService;

@Service
public class RegistartionServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository repo;
	
	@Autowired
	private AdminRepository adRepo;
	

	@Override
	public User fetchUserByEmail(String tempEmail,User user) throws Exception  {
		User userobj = null;
		if(tempEmail != null && !"".equals(tempEmail)) {
			 userobj = repo.findByEmail(tempEmail);
			if(userobj != null) {
				throw new Exception("User with "+tempEmail+" is already exist");
			}
			
		}
		return  repo.save(user);
	}

	@Override
	public User fetchUserByEmailAndPassword(String tempEmail, String tempPass) throws Exception {
		User userobj = null;
		if(tempEmail != null && tempPass !=null) {
			userobj = repo.findUserByEmailAndPassword(tempEmail, tempPass);
		}
		if(userobj == null) {
			throw new Exception("Invalid Credentials");
		}
		
		return userobj;
	}

	@Override
	public Admin fetchAdminByAdminEmailAndAdminPassword(String email, String Password) throws Exception {
		Admin adminobj = null;
		if(email != null && Password !=null) {
			adminobj = adRepo.findAdminByAdminEmailAndAdminPassword(email, Password);
		}
		if(adminobj == null) {
			throw new Exception("Invalid Credentials");
		}
		
		return adminobj;
		
	}
	
	

}
