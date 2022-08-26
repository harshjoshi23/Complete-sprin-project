package com.training;

import java.util.Objects;

public class Employee {
	//Adding attributes 
	private int employeeId; 
	private String employeeName; 
	private double salary;
	
	public Employee() {
		// We have generated a super constructor we can have it in multi class.
		super();
		//this(); either use this() or super()
		System.out.println("Zero argument constructor called");
	}
	// Creating parameterized constructor
	
	public Employee(int employeeId) {
		this(employeeId,"New Employee",23000);
		this.employeeId = employeeId;
		System.out.println("One argument constructor called");

	}
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		System.out.println("Three Param constructr called");
	}
	
	

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + employeeId;
//		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(salary);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		// checking if it's null or not
		if (obj == null)
			return false;
		// Get class comparisions 
		if (getClass() != obj.getClass())
			return false;
		
		// Casting others from object to employee
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	} 
	
	
}
