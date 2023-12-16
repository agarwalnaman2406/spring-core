package com.springcore.practise1.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phone;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties prop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> phone, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.courses = courses;
	}
}
