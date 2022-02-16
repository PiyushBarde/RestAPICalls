package com.bridgelabz.restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestAPICallsController {
	@GetMapping("/query")
	public String sayHello(@RequestParam(value="name")String name){
		return "Hello " + name + " from BridgeLabz";
	}
	@GetMapping(("/param/{name}"))
	public String sayHello1(@PathVariable String name){
		return "Hello " + name + " from BridgeLabz";
	}
}