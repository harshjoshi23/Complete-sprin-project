package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

//import com.netflix.discovery.converters.Auto;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path="/api/v1/client")
public class ClientController {

	
	@Autowired
	private WebClient client;
	
	@GetMapping(path = "/books")
	public Flux<String> getBooks() {
		
		// Ispe hum uri mai service ka naamdinge jo ureka mai registerd hai 
		// Usse we are indirectly accessing the book-service's service
		return client.get().uri("lb://BOOK-SERVICE/api/v1/book").retrieve().bodyToFlux(String.class);
	}
}
