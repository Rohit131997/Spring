package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	
	@Scheduled(fixedRate=1000)
	public void schedule() {
		System.out.println("Welcome on "+ new java.util.Date());
	}

}
