package com.springcore.practise1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
//	@Autowired
	private Samosa samosa;
	
	public Employee(Samosa samosa) {
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public void work() {
		samosa.display();
		System.out.println("Employee is doing work");
	}
	
}
