package com.spring.example.objinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Emloyee1 employee = context.getBean("employee",Emloyee1.class);
		employee.calling();	
		
		Employee2 emp = context.getBean("emp",Employee2.class);
		emp.startcalling();
		
	}

}
