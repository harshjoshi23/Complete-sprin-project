package com.training.resources;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Collection;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.example.demo.repos.StudentRepositoryImpl;
import com.training.exception.ElementNotFoundException;
import com.training.model.Student;

import jakarta.ws.rs.*;

@Path("/api/students")
public class StudentResource {

	StudentRepositoryImpl repo = null;

	public StudentResource() {
		super();
		repo = new StudentRepositoryImpl();
		// TODO Auto-generated constructor stub
	}

	@Produces(value = MediaType.APPLICATION_JSON)
	@GET
	public Collection<Student> findAllStudent() {
		return repo.findAll();
	}

//	@Produces(value = MediaType.APPLICATION_JSON)
//	@Consumes(value = MediaType.APPLICATION_JSON)
//	
//	
//	@Produces(value = MediaType.APPLICATION_JSON)
//	@Path("{menu_Id}")
//	@GET
//	public Student getStudentBy

	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/{rollNumber}")
	@GET
	public Student findByStudentId(@PathParam("rollNumber") int id) throws ElementNotFoundException {
		return repo.findById(id);
	}

	
	
	// produces - jo user ko dere ho
	// consumes - jo user dega
	@Produces(value = MediaType.APPLICATION_JSON)
	@Consumes(value = MediaType.APPLICATION_JSON)
	@POST
	public Response addStudent(Student entity) {
		repo.save(entity);
		return Response.ok(entity).status(HttpStatus.CREATED_201.getStatusCode(), "Created").build();

	}

	@DELETE
	@Produces(value = MediaType.APPLICATION_JSON)
	@Consumes(value = MediaType.APPLICATION_JSON)

	public Response delete(Student entity) {
		try {
			repo.delete(entity);
			return Response.ok().status(HttpStatus.NO_CONTENT_204.getStatusCode()).build();
		} catch (Exception e) {
			return Response.serverError().status(HttpStatus.BAD_REQUEST_400.getStatusCode(), e.getMessage()).build();
		}
	}

}
