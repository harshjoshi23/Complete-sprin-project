package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component(value = "teacher")
public class Teacher {
	// field injection
	
//	@Autowired
	private List<Student> stud;

	// Even without using autowired it will automatically create a obj
	
//	//constructor injection 
//	@Autowired
	
	
	@Autowired
	public Teacher(List<Student> stud) {
		super();
		this.stud = stud;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Student getStud() {
//		return stud;
//	}
//	

	// Setter injection
//	@Autowired
//	public void setStud(Student stud) {
//		this.stud = stud;
//	}
	
	

//	@Override
//	public String toString() {
//		return "Teacher [stud=" + stud + "]";
//	}
	

	public List<Student> getStud() {
		return stud;
	}
	
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Teacher [stud=" + stud + "]";
	}

	
	
	
}
