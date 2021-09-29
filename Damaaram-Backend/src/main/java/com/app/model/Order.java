package com.app.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Order {
	@Id
	@GeneratedValue
	private int orderId;
	private String orderStatus;
	
	@OneToOne//(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "uo_fk")//,referencedColumnName = "id")
	private User user;
	
	@OneToOne//(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "po_fk")//,referencedColumnName = "productId")
	private Product product;
	

}
