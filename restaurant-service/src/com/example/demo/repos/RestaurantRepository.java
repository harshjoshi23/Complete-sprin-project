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
	// For Setting up Db connection
	private ConnectionFactory conFact;
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

//		int id, String restaurantName, long pinCode, String cuisine
		String sql = "insert into restaurant (id,restaurantName,pinCode,cuisine) values(?,?,?,?)";
		int res = 0;
		try (PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setInt(1, obj.getId());
			pst.setString(2, obj.getRestaurantName());
			pst.setLong(3, obj.getPinCode());
			pst.setString(4, obj.getCuisine());

			res = pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 

		return (res == 1) ? true : false;
	}

	@SuppressWarnings("finally")
	@Override
	public Collection<Restaurant> findAll() {

		// TODO Auto-generated method stub
		List<Restaurant> restList = new ArrayList<>();
		try {
			String str = "select * from restaurant";
			PreparedStatement pstm = con.prepareStatement(str);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				// Property name = coloumn name

				// start
//				Restaurant newRes = new Restaurant();

				Restaurant obj = new Restaurant(rs.getInt(1), rs.getString(2), rs.getLong(3), rs.getString(4));
				// end

				restList.add(obj);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return restList;
		}
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
