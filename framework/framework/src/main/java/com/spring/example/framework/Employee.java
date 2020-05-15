package com.spring.example.framework;

public class Employee {

	private String employeeName;
	
// Using setter injection

//	public void setEmployee(String employee) {
//		employeeName = employee;
//	}
	
	// Using constructor injection	
   public Employee(String employeeName) {
	this.employeeName = employeeName;
}

public void display()
{
	System.out.println("Name is:" +employeeName);
}
}
