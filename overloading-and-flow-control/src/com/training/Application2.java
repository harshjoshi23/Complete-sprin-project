package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageEmployee obj = new ManageEmployee(); 
		
		Employee ram = new Employee(101, "Ram", 45000); 
		Employee laxman = new Employee(102, "Laxman", 55000);
		Employee hanuman = new Employee(102, "Hanuman", 25000);

		
		// use the service.add method and add employee 
//		Employee[] List = obj.getAll();
		
		System.out.println(obj.add(ram));
		System.out.println(obj.add(laxman));
		System.out.println(obj.add(hanuman));
		System.out.println(obj.add(new Employee()));
		 
		
		Employee[] arr = obj.getAll();
		for(Employee eachEmplayee : arr) { 
			System.out.println(eachEmplayee);
		}
		obj.findPosition(laxman);
//		Employee[] List = obj.getAll();

				
		
	}

}
