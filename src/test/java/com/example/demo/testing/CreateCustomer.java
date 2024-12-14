package com.example.demo.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootTest
public class CreateCustomer {

	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	public void test() {
		Customer c1 = new Customer();
		c1.setName("Allen01");
		
		Customer c2 = new Customer();
		c2.setName("Becky02");
		
		Customer c3 = new Customer();
		c3.setName("Candy03");
		
		Customer c4 = new Customer();
		c4.setName("David04");
		
		Customer c5 = new Customer();
		c5.setName("Eric05");
		
		// 儲存
		customerRepository.save(c1);
		customerRepository.save(c2);
		customerRepository.save(c3);
		customerRepository.save(c4);
		customerRepository.save(c5);
		
		System.out.println("OK");
	}
}