package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.User;

@Repository
public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
	public User findUserByEmailAndPassword(String email, String Password);
    List<User> findByContact(long contact);
    List<User> findByName(String name);
}

