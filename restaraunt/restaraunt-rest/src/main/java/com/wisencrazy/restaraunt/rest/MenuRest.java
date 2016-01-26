package com.wisencrazy.restaraunt.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.ErrorCode;
import com.wisencrazy.restaraunt.services.MenuViewServices;

@Path("/menu")
public class MenuRest {


	private static MenuViewServices menuServices=new MenuViewServices();
	
	@Path("/{restroSid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findSearchPageReview(@PathParam("restroSid")String restroSid){
		try {
			return Response.status(Status.OK).entity(menuServices.getAllItemsForRestaraunt(restroSid)).build();
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e);
		}
		
	}

}
