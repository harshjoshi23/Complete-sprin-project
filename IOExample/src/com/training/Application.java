package com.training;

import java.io.File;
import java.io.IOException;

import com.training.model.Student;
import com.training.services.FileService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileService service = new FileService();
		
		//"e:.." for a specific directory
//		File bookFile = new File("BookData.txt");
//		File studFile = new File("StudentData.txt");
		
		
		int choice=1; 
		File studentFile = new File("StudentData.txt");
        if(choice==1) {
            Student Student1 = new Student(101, "Student1", 81.5);
            Student Student2 = new Student(102, "Student2", 44.6);
            Student Student3 = new Student(104, "Student3", 99.7);
            Student Student4 = new Student(105,"Student4",67.4);
            Student Student5 = new Student(106,"Student5",22.5);
            
            System.out.println("Information added:= "+service.writeToTextFile(Student1, studentFile));
            System.out.println("Information added:= "+service.writeToTextFile(Student2, studentFile));
            System.out.println("Information added:= "+service.writeToTextFile(Student3, studentFile));
            System.out.println("Information added:= "+service.writeToTextFile(Student4, studentFile));
            System.out.println("Information added:= "+service.writeToTextFile(Student5, studentFile));
        }
        
        if(choice==2) {
            try {
                double maxMark = service.findMaxMArks(studentFile);
                System.out.println("MaxMark is:= "+maxMark);
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
		
//		int choice=4;
//		if(choice==1) {
//			
//			
//			Book headFirstJava = 
//					new Book(101,"Head First Java","Kathy Sieera",450.00);
//			
//			
//			
//		System.out.println("is File Cerated := " + service.writeToTextFile(headFirstJava, bookFile));
//		service.writeToTextFile(headFirstJava, bookFile);
//		
//		
//			}
//		
//		if(choice==2) {
//				
//				Book[] list; 
//				try {
//					
//					list = service.readFromTextFile(bookFile);
//					for(Book eachBook:list) {
//						System.out.println(eachBook);
//					}
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			// A serialization file
//			File serFile = new File("BookData.ser");
//			
//			if(choice==3) {
//				
//				Book headFirstJava = 
//						new Book(202,"Hello BRO","XXAUTORXX",2250.00);
//				
//				System.out.println(service.serialize(headFirstJava, serFile));
//			}
//			
//			if(choice==4) {
//				System.out.println("Deserialized Book:= "+ 
//			service.deserialize(serFile));
//			}
			
		
			}
		
	
}
