package com.springcore.auto.wired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wired/annotation/autowiring.xml");
		Emp emp=context.getBean("emp1",Emp.class);
		System.out.println(emp);
	}
}
