package com.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Order;
import com.app.service.OrderService;

@RestController
public class OrderController {
	
    @Autowired
	private OrderService orderService;
	
	
	@PostMapping("user/placeorder")
	public Order placeOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}
	
	//@GetMapping("/findallorders")
	//public List<User> findAllOrders(){
		//return repo.findAll(); 
	

}
