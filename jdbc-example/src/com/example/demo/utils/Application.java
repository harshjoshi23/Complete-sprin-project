package com.example.demo.utils;

import java.sql.Connection;

import com.example.demo.repos.StudentRepositoryImpl;
import com.training.exception.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(ConnectionFactory.getMySqlConnection());
		Connection con = ConnectionFactory.getMySqlConnection();
		CrudRepository<Student> repo = new StudentRepositoryImpl(con);
		Student stud1 = new Student(101,"Stud1",83);
//		System.out.println("Is Added:= " +repo.save(stud1));
//		try {
//			System.out.println(repo.delete(stud1));
//		} catch (ElementNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Student stud2 = new Student(102,"Stud2",89);
//		System.out.println("Is Added:= " +repo.save(stud2));
		Student stud3 = new Student(103,"Stud3",83);
//		System.out.println("Is Added:= " +repo.save(stud3));
		Student stud4= new Student(104,"Stud4",83);
//		System.out.println("Is Added:= " +repo.save(stud4));
		
//		for(Student i: repo.findAll()) {
//			System.out.println(i);
//		}
		
			try {
				System.out.println(repo.findById(103));
			} catch (ElementNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

//	private static char[] findById(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
