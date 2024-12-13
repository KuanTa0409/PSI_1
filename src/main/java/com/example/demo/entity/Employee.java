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
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //員工序號
	
	@Column
	private String name;
	
	//多(員工)對一(部門)
	@ManyToOne 
	@JoinColumn(name = "department_id") //由多方維護
	private Department department; // 部門序號

	//一(員工)對多(商品)
	@OneToMany(mappedBy = "employee") //一方放棄維護關聯關係
	@OrderBy("id DESC") //透過員工查找商品，商品會根據 id 由大到小排序
	private Set<Product> products = new LinkedHashSet<>(); 
	
	//一(員工)對多(訂單)
	@OneToMany(mappedBy = "employee")
	@OrderBy("id ASC")
	private Set<Order> orders = new LinkedHashSet<>();
}