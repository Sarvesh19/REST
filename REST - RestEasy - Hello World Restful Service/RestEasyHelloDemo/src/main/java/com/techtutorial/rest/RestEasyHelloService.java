package com.techtutorial.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/hello")
public class RestEasyHelloService {
	
	@GET
	@Path("/{param}")
	public Response getHelloMsg(@PathParam("param") String msg) {
 
		String output = "Welcome by RestEasy : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

}