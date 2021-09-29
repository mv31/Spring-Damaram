package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Order;
import com.app.model.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	List<Order> findByUser(int id);

}
