package com.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Order;
import com.app.model.Product;
import com.app.model.User;
import com.app.repository.OrderRepository;
import com.app.repository.RegistrationRepository;
import com.app.service.OrderService;

@RestController
public class OrderController {
	
    @Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderRepository orderRepo;
    
	@PostMapping("user/placeorder")
	public Order placeOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}
	
	@GetMapping("/findallorders")
	public List<Order> findAllOrders(){
	return orderRepo.findAll(); 
	}
	
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return orderService.addProduct(product);
	}

}
