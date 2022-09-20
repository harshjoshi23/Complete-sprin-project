package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.MobilePlan;

import lombok.AccessLevel;

@Controller
public class WelcomeController {
	
	private RestTemplate template ; 
	
	public WelcomeController(RestTemplate template) {
		this.template = template ; 
	}
	
	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public String welcomePage() {
		return "index" ; 
	}
	
	@GetMapping(path="/plans")
	public String getMobilePlans(Model model) {
		MobilePlan[] plans = template.getForObject("http://localhost:8080/api/v1/plans", MobilePlan[].class) ; 
		model.addAttribute("plans", plans);
		return "search" ; 
	}
}
