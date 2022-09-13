package com.example.demo.services;

import java.util.List;

import com.example.demo.repos.RestaurantRepository;
import com.training.model.Restaurant;


public class RestaurantService {
	// Function to fetch data 
	
	RestaurantRepository restRepo ;
	public RestaurantService() {
		super();
		// TODO Auto-generated constructor stub
		 restRepo = new RestaurantRepository();

	}

	public List<Restaurant> fetchData() {
		List<Restaurant> resturantList = (List<Restaurant>) restRepo.findAll();
		return resturantList;
	}
	
	public boolean saveData(Restaurant rest) {
		return restRepo.save(rest);
	}
	
	// Function to insert and save the data
}
