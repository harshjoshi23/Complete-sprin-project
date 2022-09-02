/**
 * 
 */
package com.example.demo;
import com.example.services.EmployeeService;
import com.training.*;

/**
 * @author AD18860
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Employee ram = new Employee(); 
//		ram.setEmployeeId(101);
//		ram.setEmployeeName("Ram Sharma");
//		ram.setSalary(60000);
//		System.out.println(ram);
		
//		Employee shyam = new Employee(104, "Shiavm Gupta", 46000);
//		System.out.println(shyam);
//		
//		Employee ganesh = new Employee(103);
////		ganesh.setEmployeeName("Ganesh Dutt");
//		ganesh.setEmployeeName(args[0]);
//
//		System.out.println(ganesh);
////		int employeeId = Integer.parseInt(args[1]);
////		Integer.parseInt(args[3]);
////		double salary = Double.parseDouble(args[3]);
//		
////		Employee obj = new Employee(employeeId, args[2], salary);
//		Employee obj = new Employee(Integer.parseInt(args[1]), args[2], Double.parseDouble(args[3]));
//		
//		System.out.println(obj);
		
		
		//Static method should not be acceced in a non static way
		
		EmployeeService obj2 = new EmployeeService(); 
//		// Calling static method in non static way : 
//		obj2.showEmployee(new Employee(101,"Ramesh",45999));
		
//		// Static method in a static way
//		
//		EmployeeService.showEmployee(new Employee(101,"Ramesh",45999));
//	
////		EmployeeService.displayEmployee(new Employee(101,"Ramesh",45999));
		
		Employee swagesh = new Employee(106, "Swagesh", 56000); 
		System.out.println("Before: \n" +swagesh);
		EmployeeService.showEmployee(swagesh);
		System.out.println("After: \n"+ swagesh);
		System.out.println(obj2.getBonus(swagesh));

	}

}
