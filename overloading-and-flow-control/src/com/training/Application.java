package com.training;
import java.util.*;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// THE SCANNER CLASS 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Employee Id: ");
//		int employeeId = sc.nextInt();
//		
//		System.out.println("Employee Name: ");
//		String employeeName = sc.next(); 
//		
//		System.out.println("Salary: ");
//		double salary = sc.nextDouble();
//		
//		Employee obj = new Employee(employeeId, employeeName, salary);
//		
//		System.out.println(obj);
//		
//		EmployeeService service = new EmployeeService(); 
//		
//		service.calculateBonus(obj);
//		System.out.println(service.calculateBonus(obj));
//		System.out.println(service.calculateBonus(obj.getSalary(), obj.getEmployeeName()));
//		System.out.println(service.calculateBonus(obj.getEmployeeName()));
//
//		sc.close();
		
		Employee ram = new Employee(101, "Ram", 45000); 
		Employee laxman = new Employee(101, "Ram", 45000);
		Employee hanuman = ram;
		EmployeeService service = new EmployeeService(); 

		// Currently the output is flase as equals method is comparing 
		// the equals from obj class. 
		// They are comparing location of the two objects
		
		System.out.println("is Equal : " +ram.equals(laxman));
		
		// hanuman is refuring to the same var as ram 
		
		System.out.println("is Equal : " +ram.equals(hanuman));
		
		System.out.println(service.calculateBonus(hanuman, 90));
	}

}
