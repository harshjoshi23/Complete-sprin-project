package com.training;

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
	

}
