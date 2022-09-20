package com.training.rest_service_client;

import com.training.model.Student;

//import javax.xml.ws.Response;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Application {
	
	private static Builder builderGeneric() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/myapp/");
		target = target.path("api/students");
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		return builder;
	}
	
	
	// make the variables private
	
	public static void getAll() {
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/myapp/");
//		target = target.path("api/students");
//		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
//		
		Builder builder = builderGeneric();
		Response resp = builder.get();
		// Find all method returns many student so we using it
		Student[] list = resp.readEntity(Student[].class);
		for (Student i : list)
			System.out.println(i);

//		System.out.println(resp.readEntity(Student.class));
//		System.out.println(resp.getEntity(Student.class));

		System.out.println("Status:=> " + resp.getStatus());

	}
	public static void add(Student stud) {
//		Client client = ClientBuilder.newClient();
//		WebTarget webTarget = client.target("http://localhost:8080/myapp/");
//		webTarget = webTarget.path("api/students/");
//		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Builder invocationBuilder = builderGeneric();
		Response response = invocationBuilder.post(Entity.entity(stud, MediaType.APPLICATION_JSON));
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getAll();
		Student  user = new Student(107, "Darshan",78);
		add(user);
		
	}

}
