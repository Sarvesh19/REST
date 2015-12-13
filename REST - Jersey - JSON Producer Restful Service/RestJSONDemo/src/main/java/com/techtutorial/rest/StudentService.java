package com.techtutorial.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/StudentService")
public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	
	@GET
	@Path("/student")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent() {
		 
		return studentDao.getStudent();
 
	}
	
	@GET
	@Path("/students")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {
		
		return studentDao.getStudents();
 
	}
}
