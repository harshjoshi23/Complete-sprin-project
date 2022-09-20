package com.example.demo.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/api/v1")
public class BookController {
	
	// Admin user will only access this endpoint
	@GetMapping(path = "/best")
	@RolesAllowed(value = {"Role_Admin"})
	public String[] getBestBooks() {
		return new String[] {
				"HeadFirstJava","Thinking in java","Effective Java"
		};
	}
	
	@GetMapping(path = "/useful")
	public String[] getUsefulBooks() {
		return new String[] {
				"tutorialpoint", "geeksforgeek","stackOverflow"
		};
	}
	
	// Any user will only access this endpoint
	@GetMapping(path = "/best/actors")
	@RolesAllowed(value = {"ROLE_ADMIN","ROLE_USER"})
	public String[] getBestActors() {
		return new String[] {
				"Jhonny Depp","Jhonny Sins","Lana Rhodes"
		};
	}

}
