package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa samosa;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study()
	{
		System.out.println("student is reading");
	}

}
