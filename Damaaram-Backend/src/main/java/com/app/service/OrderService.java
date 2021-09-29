package com.app.service;

import java.util.List;

import com.app.model.Order;
import com.app.model.User;

public interface OrderService {
	public Order addOrder(Order order);
	public List <Order> getAllOrderByUserId(int id); 

}
