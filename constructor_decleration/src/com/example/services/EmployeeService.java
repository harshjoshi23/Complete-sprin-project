package com.example.services;
import com.training.*;

public class EmployeeService {
	
	// Having an instance variable and static variable
	private int count; 
	private static int startingNumber; 
	
	//To display employee name in upper case
	
	// Static kyu banate hain function ko 
	
//	public static void showEmployee(Employee employee) {
////		System.out.println(count);
//		System.out.println(startingNumber);
//		System.out.println(employee.getEmployeeName().toUpperCase());
//	}
	
	public static void showEmployee(Employee employee) {
//		System.out.println(count);
//		System.out.println(startingNumber);
		employee.setEmployeeName(employee.getEmployeeName().toLowerCase());
//		System.out.println(employee);
	}

	// Static var can be accesed in a non static fn but no visa versa
	
//	public void displayEmployee(Employee employee) {
//		System.out.println(count);
//		System.out.println(startingNumber);
//		System.out.println(employee.getEmployeeName().toLowerCase());
//	}
//	
	// Local variable should be initialize 
	public double getBonus(Employee employee) { 
		double bonus; 
		bonus = 299;
		System.out.println(bonus);
		return (bonus*3);
		}
	
}
