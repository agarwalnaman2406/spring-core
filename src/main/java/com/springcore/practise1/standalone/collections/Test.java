package com.springcore.practise1.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new  ClassPathXmlApplicationContext("com/springcore/practise1/standalone/collections/aloneconfig.xml");
		Person per = con.getBean("person1",Person.class);
		System.out.println(per);
		System.out.println(per.getFriends().getClass());
		System.out.println("===================");
		System.out.println(per.getFeestructure());
		System.out.println(per.getFeestructure().getClass());
		System.out.println("===================");
		System.out.println(per.getProp());
		System.out.println(per.getProp().getClass());
	}

}
