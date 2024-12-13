package com.example.demo.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department { //部門
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //部門序號
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "department") 
	//一(部門)對多(員工)，一(部門)方放棄維護關聯
	@OrderBy("id ASC")// 透過部門去查找員工，員工會 根據 id 由小到大 排序
	private Set<Employee> employees = new LinkedHashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}