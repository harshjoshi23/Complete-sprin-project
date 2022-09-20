package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Adding the annotation to make it a spring bean

// Empty is the id of bean now 

// Add compontent can be added to a class level 
@Component(value = "dummy")
public class Student implements Comparable<Student> {
	private int rollNumber;
	private String firstName;
	private double markScored;

	public Student() {
		super();
		System.out.println("Constructor Called");
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	
	public Student(int rollNumber, String firstName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", markScored=" + markScored + "]";
	}

	@Override
	public int compareTo(Student myObj) {
		// TODO Auto-generated method stub

		if (this.markScored < myObj.markScored)
			return 1;
		if (this.markScored > myObj.markScored)
			return -1;
		return 0;
	}

}
