package com.example.demo.services;

import static java.util.stream.Collectors.toList;
import java.util.List;

import com.example.demo.repos.RestaurantRepository;
import com.training.model.Restaurant;

public class RestaurantService {
	
	List<Restaurant> itemList;
	RestaurantRepository dao;
	
	public RestaurantService() {
		dao = new RestaurantRepository();
	}
	public List<Restaurant> findAll(){
		
		this.itemList = (List<Restaurant>) dao.findAll();

		return this.itemList;
	}
	public List<Restaurant> displayAllRestaurants() {
		return this.findAll().stream().collect(toList());
	}
	
	public boolean addRestaurant(Restaurant newRestaurant){
		return dao.save(newRestaurant);
	}
	
	public List<Restaurant> findByRestaurantName(String name) {
		return this.itemList.stream().filter(e -> e.getRestaurantName().equals(name)).collect(toList());
	}
	
	public List<Restaurant> findByCuisine(String cuisine) {
		return this.itemList.stream().filter(e -> e.getCuisine().equals(cuisine)).collect(toList());
	}
	
	public List<Restaurant> findByPincode(Long pinCode) {
		return this.itemList.stream().filter(e -> e.getPinCode() == pinCode).collect(toList());
	}

}
