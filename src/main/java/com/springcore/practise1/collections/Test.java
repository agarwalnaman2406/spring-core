package com.springcore.practise1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practise1/collections/collectionconfig.xml");
		Employee e = (Employee) context.getBean("employee1");
		System.out.println(e.getName());
		System.out.println(e.getAddresses());
		System.out.println(e.getCourses());
		System.out.println(e.getPhone());
		System.out.println(e.getProp());
	}

}
