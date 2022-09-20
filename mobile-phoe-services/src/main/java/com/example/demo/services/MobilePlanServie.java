package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MobilePlan;
import com.example.demo.ropo.PlanRepository;
import com.training.exception.ElementNotFoundException;

@Service
public class MobilePlanServie {

	private PlanRepository repo;
	
	@Autowired
	public MobilePlanServie(PlanRepository repo) {
		super();
		this.repo = repo;
	}
	
	
//	public MobilePlanServie
	public List<MobilePlan> findAll(){
		return this.repo.findAll();
	}
	
	public MobilePlan add(MobilePlan entity) {
		return this.repo.save(entity);
	}
	

	public MobilePlan findById(int id) throws ElementNotFoundException {
		
		String message = new StringBuilder("Element With Given Id- ").append(id)
				.append("Not Found").toString();
		return this.repo.findById(id)
				.orElseThrow(()-> new ElementNotFoundException("Error 202", message));
	}
	
}
