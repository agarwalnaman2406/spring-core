package com.springcore.practise1.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init
		System.out.println("Taking Pepsi");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// Destroy
		System.out.println("Destroy Method Pepsi");
	}
	
}
