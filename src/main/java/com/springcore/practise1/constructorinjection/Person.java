package com.springcore.practise1.constructorinjection;

public class Person {
	private String name;
	private int personid;
	Certi certi;
	public Person(String name, int personid, Certi certi) {
		super();
		this.name = name;
		this.personid = personid;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personid=" + personid + "]";
	}
	
	
}
