package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Order;
import com.app.model.Product;
import com.app.model.User;
import com.app.repository.OrderRepository;
import com.app.repository.ProductRepository;
import com.app.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {

	//Order Services
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ProductRepository productRepository;
	@Override
	public Order addOrder(Order order) {
		
		return orderRepository.save(order);
	}
	@Override
	public List<Order> getAllOrderByUserId(int id) {
		return orderRepository.findByUser(id);
	}
	
	
	
	
	//product services
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	

}
