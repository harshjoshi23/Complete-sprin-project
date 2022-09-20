package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Payment;
import com.example.demo.services.PaymentService;

@SpringBootApplication
public class SpringMvcPaymentServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringMvcPaymentServiceApplication.class, args);
		
		Payment stud1 = ctx.getBean("stud1",Payment.class);
		Payment stud2 = ctx.getBean("stud2",Payment.class);
		Payment stud3 = ctx.getBean("stud3",Payment.class);
		Payment stud4 = ctx.getBean("stud4",Payment.class);
		PaymentService service = ctx.getBean(PaymentService.class);
		
		service.save(stud1);
		service.save(stud2);
		service.save(stud3);
		service.save(stud4);
		
		service.findAll().forEach(System.out::println);
	}
		@Bean
		public Payment stud1() {
			return new Payment(101,"stud1",LocalDate.of(2022, 06, 10), 48932);
		}
		@Bean
		public Payment stud2() {
			return new Payment(102,"stud2",LocalDate.of(2022, 07, 23), 34122);
		}
		@Bean
		public Payment stud3() {
			return new Payment(103,"stud3",LocalDate.of(2022, 06, 31), 76564);
		}
	
		@Bean
		public Payment stud4() {
			return new Payment(104,"stud4",LocalDate.of(2022, 05, 05), 89712);
		}
	

}
