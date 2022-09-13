package com.example.demo.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.demo.utils.ConnectionFactory;
import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Restaurant;

public class RestaurantRepository implements CrudRepository<Restaurant> {

	private Connection con;
	
	public RestaurantRepository() {
		super();
		con = ConnectionFactory.getMySqlConnection();
	}
	
	@Override
	public boolean save(Restaurant obj) {
		
		String sql = "insert into restaurant values(?,?,?,?)";
		
		int rowUpdated = 0;
		
		try(			PreparedStatement pstmt = con.prepareStatement(sql);
) {
			
			pstmt.setInt(1, obj.getId());
			pstmt.setString(2, obj.getRestaurantName());
			pstmt.setLong(3, obj.getPinCode());
			pstmt.setString(4, obj.getCuisine());
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated==1?true:false;
		
	}

	@Override
	public Collection<Restaurant> findAll() {
		
		List<Restaurant> itemList = new ArrayList<>();
		try {
			
			String sql = "select * from restaurant";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String restaurantName = rs.getString("restaurantName");
				long pinCode = rs.getLong("pinCode");
				String cuisine = rs.getString("cuisine");
				
				Restaurant obj = new Restaurant(id, restaurantName, pinCode, cuisine);
				
				itemList.add(obj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return itemList;
		
	}

	@Override
	public boolean delete(Restaurant obj) throws ElementNotFoundException {
		
		String sql = "delete from restaurant where id=?";
		
		Restaurant found = findById(obj.getId());
		int rowDeleted = 0;
		
		if(found == null) {
			throw new ElementNotFoundException("ERR-101", "Row is not present");
		}
		else {
			try {
				
			    PreparedStatement pstmt = con.prepareStatement(sql);
			    pstmt.setInt(1, obj.getId());
			    rowDeleted = pstmt.executeUpdate();
			    
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowDeleted==1?true:false;
		
	}

	@Override
	public Restaurant findById(int key) throws ElementNotFoundException {
		
		String sql = "select * from restaurant where id=?";
		Restaurant obj = null;
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				int id = rs.getInt("id");
				String restaurantName = rs.getString("restaurantName");
				long pinCode = rs.getLong("pinCode");
				String cuisine = rs.getString("cuisine");
				
				obj = new Restaurant(id, restaurantName, pinCode, cuisine);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
		
	}

	@Override
	public int update(Restaurant obj) {
		
		String sql = "update restaurant set restaurantName=?, pinCode=?, cuisine=? where id=?";
		
		int rowUpdated = 0;
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.getRestaurantName());
			pstmt.setLong(2, obj.getPinCode());
			pstmt.setString(3, obj.getCuisine());
			pstmt.setInt(4, obj.getId());
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

}
