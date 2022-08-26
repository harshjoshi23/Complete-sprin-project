package com.training;

public class EmployeeService {

	public double calculateBonus(Employee employee) { 
		
		return employee.getSalary() *0.10; 
		
	}
	
	public double calculateBonus(double salary, String employeeName) { 
		
		double bonus = 0.0; 
		if(employeeName.contains("s")) bonus = salary * .20; 
		
		else bonus = salary * .10;
				
		return bonus;
		
	}
	
	public double calculateBonus(String employeeName) { 
		double bonus = 0.0;

		if(employeeName.equals("Krishna")) bonus = 50000;
		else bonus = 2500;
		
		return bonus;
		
	}
	
	public double calculateBonus(Employee employee, double bonusPrecentage) { 
		
//		if employee name = "ram " = 10000
//				if name = "laxman" = 20000
//				if name = "hanuman" = 30000
//				in all other 35000
		
			
		switch (employee.getEmployeeName()) {
		case "ram":
			return 10000; 
		case "laxman": 
			return 20000; 
		case "hanuman":
			return 30000; 
		default: 
			return 35000;
			
		}
				
		
	}
	
	
}

