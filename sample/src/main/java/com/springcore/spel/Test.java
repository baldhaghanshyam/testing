package com.springcore.spel;

import java.beans.Expression;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/stereoconfig.xml");
		Demo d = context.getBean("demo", Demo.class);
		System.out.println(d);

		SpelExpressionParser temp = new SpelExpressionParser();
		org.springframework.expression.Expression expression = temp.parseExpression("20+12");
		System.out.println(expression.getValue());

	}

}
