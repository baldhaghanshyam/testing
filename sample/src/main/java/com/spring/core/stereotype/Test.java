package com.spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/stereotype/stereoconfig.xml");
		Student student=context.getBean("student" ,Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		
		
		Teacher t=context.getBean("teacher",Teacher.class);

		Teacher t1=context.getBean("teacher",Teacher.class);
	System.out.println( t.hashCode());
	 System.out.println(t1.hashCode());
	}

}
