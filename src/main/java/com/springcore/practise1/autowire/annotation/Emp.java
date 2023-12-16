package com.springcore.practise1.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcore.practise1.autowire.annotation.Address;

public class Emp {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
}
