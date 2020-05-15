package com.spring.example.objinjection;

public class Employee2 {
	
	private Client call;

	public void setCall(Client call) {
		this.call = call;
	}
	
	public void startcalling()
	{
		call.clientCalling();
	}

}
