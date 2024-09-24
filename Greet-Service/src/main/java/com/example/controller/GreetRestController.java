package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.WelcomeFeignClints;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClints clints;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String welcomeMsg=clints.getWelcomeMsg();
		
		String GreetMsg="Good Morning!";
		return GreetMsg+welcomeMsg;
	}

}
