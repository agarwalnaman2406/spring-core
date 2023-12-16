package com.springcore.practise1.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("firstStudent", Student.class);
		System.out.println(student);
		student.study();
		ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee employee = context1.getBean("getEmployee", Employee.class);
		System.out.println(employee);
		employee.work(); 
	}

}
