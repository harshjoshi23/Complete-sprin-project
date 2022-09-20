package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.controllers.MobilePlanController;
import com.example.demo.entity.MobilePlan;
import com.example.demo.ropo.PlanRepository;

@SpringBootApplication
public class MobilePhoeServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilePhoeServicesApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		// Anonymous class is getting created here
		return new CommandLineRunner() {
			
			
			 @Autowired
			PlanRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				repo.save(new MobilePlan(102,"PRE-11",502,"128 days") );
				
				
			}
		};
	}
}
