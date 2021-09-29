package com.app.service;

import java.util.List;

import com.app.model.User;

public interface AdminCrudService {
	
	 List<User> getAllUsers();
	public User updateUser(User user);
	public void deleteUser(int id);

	
}
