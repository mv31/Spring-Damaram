package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Product {
	 @Id
	 @GeneratedValue
	  private int productId;
	  private String productName;

}
