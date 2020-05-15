package com.spring.example.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Office {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Employee rohit = context.getBean("employee",Employee.class);
		rohit.display();

	}
}