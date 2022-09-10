package com.example.demo.repos;

import java.sql.Connection;
import java.util.Collection;

import com.example.demo.utils.ConnectionFactory;
import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Restaurant;

public class RestaurantRepository implements CrudRepository<Restaurant> {
	// For Setting up Db connection
	private ConnectionFactory conFact  ;
	private Connection con; 
	
	
	public RestaurantRepository() {
		super();
		conFact = new ConnectionFactory();
		// TODO Auto-generated constructor stub
		con = conFact.getMySqlConnection();
	}
	
	
	@Override
	public boolean save(Restaurant obj) {
		// TODO Auto-generated method stub
//		getMySqlConnection()
		return false;
	}

	@Override
	public Collection<Restaurant> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Restaurant obj) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int key) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Restaurant findById(int key) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Restaurant obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
