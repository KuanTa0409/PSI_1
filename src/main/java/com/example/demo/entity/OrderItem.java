package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_item")
public class OrderItem { //訂單明細

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 訂單明細序號
	
	@Column
	private Integer amount; //訂購數量
	
}