package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") // order 在 mysql 中是保留字。
public class Order { //訂單

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //訂單序號
	
	@Column
	private Date date; //訂單日期
	
	@Column
	private Date shipDate; // 出貨日期(t+2天)
	
	@Column
	private String memo; //備註
}