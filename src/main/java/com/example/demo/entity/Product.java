package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //商品序號
	
	@Column
	private String name;
	
	@Column
	private Integer cost;
	
	@Column
	private Integer price; 
	
	@Column
	private String description; //商品描述
	
	@ManyToOne//多(商品)對一(員工)
	@JoinColumn(name = "employee_id")
	private Employee employee; //員工序號

}