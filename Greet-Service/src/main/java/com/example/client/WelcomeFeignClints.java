package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-SERVICE")
public interface WelcomeFeignClints {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg();
		
	

}
