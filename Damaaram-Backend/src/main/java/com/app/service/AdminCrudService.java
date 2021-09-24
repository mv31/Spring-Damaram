package com.app.service;

import com.app.model.User;

public interface AdminCrudService {
	public User getUserById(int id);
	public User updateUser(User user);
	public void deleteUser(int id);

	
}
