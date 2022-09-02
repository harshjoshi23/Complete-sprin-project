package com.training;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.training.exception.ElementNotFoundException;
import com.training.idaos.StudentRepositoryImpl;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;
import com.training.utils.FirstNameComparator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key=1; 
		Student obj1 = new Student(101,"Harsh",91);
		Student obj2 = new Student(102,"Jarsh",41);
		Student obj3 = new Student(103,"Karsh",78);
		Student obj4 = new Student(103,"Barsh",100);


		CrudRepository<Student> repo = new StudentRepositoryImpl();
		
		
		System.out.println("is Element Added:= " + repo.save(obj1));
		System.out.println("is Element Added:= " + repo.save(obj2));
		System.out.println("is Element Added:= " + repo.save(obj3));
		System.out.println("is Element Added:= " + repo.save(obj4));

		// Collection is and interface 
//		 Collection<Student> list = repo.findAll();
		 
		 // Collections is a class and sort is a static method 
		 // but collections is going to be interface 
		 List<Student> list = (List<Student>) repo.findAll();
		 
		 Collections.sort(list);
		 
		 for(Student eachStudent:list) {
			 System.out.println(eachStudent);
		 }
		 
		 Collections.sort(list,new FirstNameComparator());
		 
		 boolean result;
			try {
//				Student obj4 = new Student(102,"Larsh",41);

				result = repo.delete(obj2);
				System.out.println("Is Deleted:= "+ result);

			} catch (ElementNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
//		
//		do {
//			
//		switch (key) {
//		case 1: 
//
//			// cahnge add
//			System.out.println("is Element Added:= " + repo.save(obj1));
//			System.out.println("is Element Added:= " + repo.save(obj2));
//			System.out.println("is Element Added:= " + repo.save(obj3));
//
//			break;
//			
//		case 2: 
//			 Collection<Student> list = repo.findAll();
//			 for(Student eachStudent:list) {
//				 System.out.println(eachStudent);
//			 }
//			 break; 
//		case 3: 
//			boolean result;
//			try {
////				Student obj4 = new Student(102,"Larsh",41);
//
//				result = repo.delete(obj2);
//				System.out.println("Is Deleted:= "+ result);
//
//			} catch (ElementNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//			 
//			 default: 
//				 break; 
//				
//		}key++;
//		}
//
//		while(key<4); 
//		}

}
}