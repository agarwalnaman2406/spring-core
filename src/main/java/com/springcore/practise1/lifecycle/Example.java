package com.springcore.practise1.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String Subject;

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	private void end() {
		System.out.println("Ending Method");
	}
	
}
