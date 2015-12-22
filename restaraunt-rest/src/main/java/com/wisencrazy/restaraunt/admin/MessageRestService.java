package com.wisencrazy.restaraunt.admin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * User: Hoa Ho
 * Date: 3/7/13
 * Time: 1:31 PM
 */
@Path("/message")
public class MessageRestService {
    @GET
    @Path("/{param}")
    public Response printMessage(@PathParam("param") String msg) {
        String result = "Restful example : " + msg;
        return Response.status(200).entity(result).build();
    }
}
