package com.training.services;

import java.sql.*;
import java.util.*;

import com.example.demo.utils.ConnectionFactory;
import com.training.entity.Course;
import com.training.entity.Participant;

public class CourseService {
	private Connection con;

	public CourseService() {
		super();
		// TODO Auto-generated constructor stub
		this.con = ConnectionFactory.getMySqlConnection();
		System.out.println("Connection Established: " + this.con);
		
	}
	
	public int addCourse(Course course) {
		int rowAdded = 0;
		String sql = "insert into new_student values (?,?,?)";
		
		// Using try with resource
		// The prepared ststemnt will always get sotred 
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, course.getCourseId());
			pstmt.setString(2, course.getCourseName());
			java.sql.Date date = java.sql.Date.valueOf(course.getStartDate());
			pstmt.setDate(3, date);
			
			rowAdded = pstmt.executeUpdate();


			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return rowAdded;
	}
	public Course findByCourseName(int courseId) {
		
		Course course = new Course();
		String sql ="SELECT p.firstName,p.email,c.courseName, c.startDate FROM test.participant p ,test.new_student c where p.courseref=?" ;
		Set<Participant> list = new HashSet<>();

		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, courseId);
			
			ResultSet rs = pstmt.executeQuery();
//			Set<Participant> list = new HashSet<>();
			// we create participant objec
			Participant obj = new Participant();
			
			while(rs.next()) {
				String firstName = rs.getString(1);
				String email = rs.getString(2);
				obj.setFirstName(firstName);
				obj.setEmail(email);
				list.add(obj);
				//Before add 
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));

			}
			
		} catch (SQLException e) {
			// TODO: handle exception			
			e.printStackTrace();
		}
		course.setCourseId(courseId);
		course.setList(list);
		
		return course;
	}
	
}
