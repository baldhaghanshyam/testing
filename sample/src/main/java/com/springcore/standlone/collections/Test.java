package com.springcore.standlone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext contex =new ClassPathXmlApplicationContext("com/springcore/standlone/collections/aloneconfig.xml");
 		Person p=contex.getBean("person1", Person.class);
		System.out.println(p);
		System.out.println(p.getFeestructure());
		System.out.println(p.getProperties());
	}
}
