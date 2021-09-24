package com.app.service;

import java.util.List;

import com.app.model.User;

public interface AdminSearchService {

	 List<User> getAllUsers();
	 List<User> getUserByContact(long contact);
	 List<User> getUserByName(String name);
	 List<User> getUserByEmail(String email);

}
