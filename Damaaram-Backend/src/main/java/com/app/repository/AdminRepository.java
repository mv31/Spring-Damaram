package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.User;

@Repository
public interface AdminRepository extends JpaRepository<User, Long>{

	public List<User> findAll();

}
