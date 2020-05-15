package com.spring.example.objinjection;

public class Emloyee1 {
	
	int empId;
	Client clientcalling;
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setClientcalling(Client clientcalling) {
		this.clientcalling = clientcalling;
	}
	
	public void calling()
	{
		clientcalling.clientCalling();
	}
	
	
}
