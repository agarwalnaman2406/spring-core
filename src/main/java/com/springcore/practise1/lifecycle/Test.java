package com.springcore.practise1.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practise1/lifecycle/lifecycleconfig.xml");
//		Samosa s1 = (Samosa)context.getBean("s1");
//		System.out.println(s1);
//		context.registerShutdownHook();
//		
//		System.out.println("//////////////////////");
//		
//		Pepsi p1 = (Pepsi) context.getBean("p1");
		
		Example example = (Example) context.getBean("e1");
		System.out.println(example);
		
	}

}
