package com.techtutorial.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/StudentService")
public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	
	@GET
	@Path("/student")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent() {
		 
		return studentDao.getStudent();
 
	}
	
	@GET
	@Path("/students")
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudents() {
		
		return studentDao.getStudents();
 
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_XML)
	public Response consumeXML( Student student ) {

		String output = student.toString();

		return Response.status(200).entity(output).build();
	}
}