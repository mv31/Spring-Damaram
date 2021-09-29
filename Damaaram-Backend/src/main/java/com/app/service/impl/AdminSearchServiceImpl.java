package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.RegistrationRepository;
import com.app.service.AdminSearchService;

@Service
public class AdminSearchServiceImpl implements AdminSearchService {

	@Autowired
	private RegistrationRepository repo;

	

	@Override
	public User  getUserById(int id){
		return repo.findById(id).get();
	}
	
	@Override
	public List<User> getUserByContact(long contact) {
		return repo.findByContact(contact);
	}

	@Override
	public List<User> getUserByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<User> getUserByEmail(String email) {
		return null;
	}
	
}
