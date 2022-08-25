package com.student;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		
		student.setStudentName("Harsh");
		String name = student.getStudentName();
		System.out.println(name);
		
		student.setRoll_no(1806381);
		int roll = student.getRoll_no();
		System.out.println(roll);
		
		student.setSection("B");
		String section = student.getSection();
		System.out.println(section);

	}

}
