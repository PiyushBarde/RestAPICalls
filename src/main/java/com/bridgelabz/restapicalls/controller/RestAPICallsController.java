package com.bridgelabz.restapicalls.controller;
import com.bridgelabz.restapicalls.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " from bridgelabz";
	}
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,@RequestParam(value="lastName") String lastName) {
	return "Hello "+firstName + " "+ lastName + " from bridgelabz!";
	}
}