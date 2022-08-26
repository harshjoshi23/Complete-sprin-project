package com.training;

public class ManageEmployee {
	private Employee[] arrayemp; 
	private static int count = 0; 
	// making 3 indexes 
	// all initialization at cons level 
	public ManageEmployee() { 
		super(); 
		this.arrayemp= new Employee[3];
	}
	
	public boolean add(Employee employee) { 
		if(count>2) {return false;}
		arrayemp[count] = employee; 
		count++; 
		return true;
//		return count<=2?true:false;
	}
	
	// all service methods should return something
		public Employee[] getAll() { 
			return arrayemp;
		}
		
		public int findPosition(Employee emp) {
			
			for(int i=0;i<arrayemp.length;i++) {
				
				if(arrayemp[i].equals(emp)) {
					System.out.println(i);
				}
			}
					return -1;
				}
		}
		
//		// calling position at 0th postion so NULL pointer exception
//		employeeList[0] = employee; 		
	


