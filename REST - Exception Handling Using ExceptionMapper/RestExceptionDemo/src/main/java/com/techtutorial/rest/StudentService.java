package com.techtutorial.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.techtutorial.rest.exception.MyApplicationException;

@Path("/StudentService")
public class StudentService {

	@GET
	@Path("/studentById/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getStudent(@PathParam("id") String id)
			throws MyApplicationException {

		int serialNumber = 0;

		try {

			Integer.parseInt(id);
			serialNumber = 50000 / Integer.parseInt(id);

		} catch (NumberFormatException e) {

			throw new MyApplicationException("id is not a number !!");
		} 

		return Response
				.status(Status.OK)
				.entity("Welcome Student with ID :" + id + "and serialNumber: "
						+ serialNumber).build();

	}

}
