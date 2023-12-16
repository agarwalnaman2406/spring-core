package com.springcore.practise1.autowire.qualifier.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practise1/autowire/qualifier/annotation/autoconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp);
	}

}
