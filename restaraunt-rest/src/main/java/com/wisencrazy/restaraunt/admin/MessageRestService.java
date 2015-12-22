package com.wisencrazy.restaraunt.admin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: Wisencrazy
 */
@Path("/message")
public class MessageRestService {
	
	Logger logger=LoggerFactory.getLogger(MessageRestService.class);
    @GET
    @Path("/{param}")
    public Response printMessage(@PathParam("param") String msg) {
    	logger.error("Testing the info build");
        String result = "Restful example Changed: " + msg;
        return Response.status(200).entity(result).build();
    }
}
