package com.example.demo.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
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
	
	//一(商品)對多(訂單明細)
	@OneToMany(mappedBy = "product")
	@OrderBy("id ASC")
	// 透過商品，查找多筆訂單明細
	private Set<OrderItem> orderItems = new LinkedHashSet<>();
	
}