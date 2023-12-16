package com.springcore.practise1.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Naman Agarwal")
	private String studentName;
	@Value("Sitapur")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	
}
