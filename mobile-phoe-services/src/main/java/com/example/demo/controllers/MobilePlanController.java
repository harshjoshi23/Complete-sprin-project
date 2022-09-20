package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.MobilePlan;
import com.example.demo.services.MobilePlanServie;
import com.training.exception.ElementNotFoundException;

import lombok.AllArgsConstructor;

// Json way of working - Rest controller
@RestController
// v1 for version 1
@RequestMapping(path = "/api/v1/mobileplans")
// For adding the constructor with 1 arg to aurowire it
@AllArgsConstructor
public class MobilePlanController {
	// It is autowired as there is a one arg cons when obj is created it gets
	// injected
	private MobilePlanServie service;

	@GetMapping
	public List<MobilePlan> findAll() {

		return this.service.findAll();
	}
	
	@GetMapping("/srch/{id}")
	public MobilePlan findById(@PathVariable("id") int id) throws ElementNotFoundException {
		return this.service.findById(id);
	}
	

	@PostMapping
	public ResponseEntity<MobilePlan> add(@RequestBody MobilePlan entity) {

		MobilePlan addedObj = this.service.add(entity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getPlanId())
				.toUri();

		return ResponseEntity.created(location).body(addedObj);

	}
}
