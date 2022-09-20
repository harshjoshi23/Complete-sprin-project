package com.example.demo.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/api/v1")
public class BookController {
	// To map the port with port no of yml
	// We use @Vaue annotion
	@Value("${server.port}")
	private String port;
	
	// Admin user will only access this endpoint
	@GetMapping(path = "/book")
	@RolesAllowed(value = {"Role_Admin"})
	public String[] getBestBooks() {
		
		
		return new String[] {"HeadFirstJava","Thinking in java","Effective Java",port};
	}
	
//	

}
