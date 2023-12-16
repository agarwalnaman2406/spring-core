package com.springcore.practise1.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practise1/constructorinjection/constructorinjectionconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		System.out.println(p.certi.name);
	}

}
