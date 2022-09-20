package com.training.model;

// Comparable type ka bana rahe hain so we need a comparator inc

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String firstName;
	private double markScored;

	public Student() {
		super();
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
