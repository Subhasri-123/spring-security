package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Hello World";
	}
	@GetMapping("/user")
	public String homeUsers() {
		return "Welcome Users";
	}
	@GetMapping("/admin")
	public String homeAdmin() {
		return "Welcome Admin";
	}
}
