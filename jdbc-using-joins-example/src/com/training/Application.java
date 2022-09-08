package com.training;

import java.time.LocalDate;
import java.time.Month;

import com.training.entity.Course;
import com.training.services.CourseService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseService services = new CourseService();
		
		Course java = new Course(890,"Core Java", LocalDate.of(2022,Month.SEPTEMBER,12));
//		System.out.println("Row Added:= "+services.addCourse(java));
//		services.findByCourseName(890);
		services.findByCourseName(340);
		services.findByCourseName(450);

		
		
	}

//	private static LocalDate LocalDateof(int i, Month september, int j) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
