package com.wisencrazy.common.exception;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ApplicationExceptionHandler implements ExceptionMapper<ApplicationException> {

	public Response toResponse(ApplicationException applicationException) {
		// TODO Auto-generated method stub
		return Response.status(401).entity(applicationException.getMessage()).build();
	}

}
