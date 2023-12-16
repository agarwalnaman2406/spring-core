package com.springcore.practise1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.practise1.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;
	}

	@Bean
	public Employee getEmployee() {
		Employee emp = new Employee(getSamosa());
		return emp;
	}
	
}
