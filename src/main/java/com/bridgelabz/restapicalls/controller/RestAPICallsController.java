package com.bridgelabz.restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPICallsController {
	@GetMapping("/hello")
	public String sayHello(){
		return "Hello from BridgeLabz";
	}
}