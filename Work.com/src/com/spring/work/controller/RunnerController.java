package com.spring.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RunnerController {
	
	@RequestMapping("/running")
	public String goRun()
	{
		return "Running";
	}

}
