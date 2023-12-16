package com.springcore.practise1.javaconfig;

import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {
	public void study(){
		System.out.println("Student is studying");
	}
}
