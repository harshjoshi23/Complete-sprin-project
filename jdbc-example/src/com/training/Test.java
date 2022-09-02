package com.training;
import java.sql.*;
public class Test {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Password12");
			System.out.println(con);
		} catch (Exception e) {

			e.printStackTrace();
		}
		

	}

}
