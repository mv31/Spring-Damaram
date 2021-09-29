package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.RegistrationRepository;
import com.app.service.AdminCrudService;


@Service
public class AdminCrudServiceImpl implements AdminCrudService {

	@Autowired
	private RegistrationRepository regRepo;
	
	
	@Override
	public List<User> getAllUsers() {
		return regRepo.findAll();
	}

	@Override
	public User updateUser(User user) {
		return regRepo.save(user);
	}

	@Override
	public void deleteUser(int id) {
		regRepo.deleteById(id);
	}

}
