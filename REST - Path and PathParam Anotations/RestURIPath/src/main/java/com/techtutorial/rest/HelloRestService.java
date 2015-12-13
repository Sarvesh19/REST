package com.techtutorial.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloRestService {

	@GET
	public Response getHello() {

		String output = " Hello Welcome  ";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("{myMsg}")
	public Response getMyMsg(@PathParam("myMsg") String myMsg) {

		String output = "Hello Welcome by Rest :  " + myMsg;
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/message")
	public Response getHelloMsg() {

		String output = "Hello Welcome by message Rest Default";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/message/{myMsg}")
	public Response getMySecondMsg(@PathParam("myMsg") String myMsg) {

		String output = "Hello Welcome by message Rest :  " + myMsg;
		return Response.status(200).entity(output).build();
	}

}