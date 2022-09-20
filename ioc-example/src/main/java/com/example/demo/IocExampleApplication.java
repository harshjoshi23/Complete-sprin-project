package com.example.demo;

import org.example.demo.School;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","org.example.demo"})
public class IocExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext factory = SpringApplication.run(IocExampleApplication.class, args);
		
		// TO solve multiple bean problem 
		
		
//		Student obj	= factory.getBean("dummy",Student.class);
		
		// only default cons called 
		// Bean id is automatically made as class name with a small letter
		// We are using value in annotation to solve the issue
//		System.out.println(obj);
		
		// For now no unique bean exception 
		
//		Student stud = factory.getBean("student",Student.class);
//		Teacher teacher = factory.getBean("teacher",Teacher.class);
		Teacher teacher = factory.getBean("teacher",Teacher.class);
		
//		System.out.println(teacher);
		teacher.getStud().forEach(System.out::println);
		System.out.println(factory.getBean(School.class));

	}
	
	@Bean
	public Student student() {
		return new Student(110, "Stud 10",90);

	}
	@Bean
	public Student student2() {
		return new Student(112, "Stud 12",92);
	}
	@Bean
	public Student student3() {
		return new Student(113, "Stud 14",94);
	}
	@Bean
	public School school1() {
		return new School("School1");
	}
	@Bean
	public School school2() {
		return new School("School2");
	}
	@Bean 
	public Book book1() {
		return new Book("Book1");
	}
	
}
