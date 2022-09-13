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
	@Produces(value = MediaType.APPLICATION_JSON)
	@GET
	public Collection<Student> findAllStudent() {
		StudentRepositoryImpl repo = new StudentRepositoryImpl();
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
        StudentRepositoryImpl repo = new StudentRepositoryImpl();
        return repo.findById(id);
    }
    
	
	// produces - jo user ko dere ho 
	// consumes - jo user dega 
	@Produces(value = MediaType.APPLICATION_JSON)
	@Consumes(value = MediaType.APPLICATION_JSON)
	@POST
	public Response addStudent(Student entity) {
		StudentRepositoryImpl repo = new StudentRepositoryImpl();
		repo.save(entity);
		return
		Response.ok(entity).status(HttpStatus.CREATED_201.getStatusCode(), "Created").build();

	}
}
