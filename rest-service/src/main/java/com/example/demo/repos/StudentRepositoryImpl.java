package com.example.demo.repos;

import java.util.Collection;

import com.example.demo.utils.ConnectionFactory;
import com.training.exception.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;
//forsql
import java.util.*;
import java.sql.*;

public class StudentRepositoryImpl implements CrudRepository<Student> {
	private Connection con;
	
	// Passing conn from the ConstionFactory
	public StudentRepositoryImpl() {
		super();
		this.con = ConnectionFactory.getMySqlConnection();
	}
				
	
	
	
	@Override
	public boolean save(Student obj) {
		// TODO Auto-generated method stub
		String sql= "insert into lumen_student values(?,?,?)";
		int rowUpdated = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// 1,2,3 is a placeholder 
			pstmt.setInt(1, obj.getRollNumber());
			pstmt.setString(2, obj.getFirstName());
			pstmt.setDouble(3, obj.getMarkScored());
			
			// We want to send a boolean value

			rowUpdated = pstmt.executeUpdate();
			
		} catch (Exception e) { // As sql passes the sql exception
			e.printStackTrace();
			
		}
		return rowUpdated==1?true:false;

	}
//		if(rowUpdated==0) {
//			return false;
//
//		}return true;
		//Wrong ternaty correct it afterwards 
//		return rowUpdated==0?false:true;
				
	
	@Override
	public boolean delete(Student obj) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		String sql2 =  "delete from lumen_student where rollNumber = ?";
		int rowUpdated=0;
		try { 
			PreparedStatement pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, obj.getRollNumber());
//			pstmt.setString(2, obj.getFirstName());
//			pstmt.setDouble(3, obj.getMarkScored());
			rowUpdated = pstmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		
		return rowUpdated==1?true:false;
	}
	// Find by id

	@Override
	public Collection<Student> findAll() {
		List<Student> studList = new ArrayList<>();
		try {
			String str = "select * from lumen_student";
			PreparedStatement pstm = con.prepareStatement(str);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				// Property name = coloumn name
				
				// start
				int rollNumber = rs.getInt("rollNumber");
				String firstName = rs.getString("firstName");
				double marksScored = rs.getDouble("marksScored");
				
				Student obj = new Student(rollNumber, firstName, marksScored);
				//end 
				
				studList.add(obj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return studList;
	}

// line no 85 to 
	
	
//DRY  dont repeat yourself

	@Override
		public Student findById(int key) throws ElementNotFoundException {
			
			String sql =  "select * from lumen_student where rollNumber= ?";
		Student stud = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// 1,2,3 is a placeholder 
			pstmt.setInt(1, key);
			
			ResultSet rs =  pstmt.executeQuery();

			if(rs.next()) {
				int rollNumber = rs.getInt("rollNumber");
				String firstName = rs.getString("firstName");
				double marksScored = rs.getDouble("marksScored");
				
				stud = new Student(rollNumber, firstName, marksScored);

			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		
		// TODO Auto-generated method stub
		return stud;
	}

	

}
