package com.techtutorial.rest.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionHandler implements
		ExceptionMapper<RuntimeException> {

	public Response toResponse(RuntimeException arg0) {

		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity("Some Other Problem While Processing Your Request").type(MediaType.TEXT_PLAIN)
				.build();

	}

}
