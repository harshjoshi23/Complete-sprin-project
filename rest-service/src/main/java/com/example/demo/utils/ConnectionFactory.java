package com.example.demo.utils;

import java.sql.*;
import java.util.ResourceBundle;
import java.io.*;

public class ConnectionFactory {

	public static Connection getMySqlConnection() {
		Connection con = null;
		// Driver manager is class with method called get connection that returns con(or
		// conn we declared)
		//

		try {
			// To opean a particular file
			// All resource bundle will have extention as property
			ResourceBundle bundle = ResourceBundle.getBundle("application");
			String url = bundle.getString("datasource.url");
			String userName = bundle.getString("datasource.username");
			String pass = bundle.getString("datasource.password");

//			con = DriverManager.getConnection();

			// ConnectionImplementation is class which implements the connection - by
			// polymorphism
			// The class is an implementaion of connection
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Password12");
			con = DriverManager.getConnection(url, userName, pass);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return con;
	}

}
