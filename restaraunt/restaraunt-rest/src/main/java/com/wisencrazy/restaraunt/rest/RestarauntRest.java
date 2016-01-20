package com.wisencrazy.restaraunt.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.ErrorCode;
import com.wisencrazy.restaraunt.rest.dto.ManualLocationInput;
import com.wisencrazy.restaraunt.rest.dto.GoogleLocationInput;
import com.wisencrazy.restaraunt.services.RestarauntSearch;

@Path("/restaraunt")
public class RestarauntRest {

		private static RestarauntSearch restaraunt=new RestarauntSearch();
	
		@POST
		@Path("/search/nearest/")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response findNearByRestaraunts(GoogleLocationInput locationInput){
			try {
				return Response.status(Status.OK).entity(restaraunt.searchRestarauntNearBy(locationInput)).build();
			} catch (ApplicationException e) {
				return ErrorCode.getErrorResponse(e);
			}
		}
		
		@GET
		@Path("/states")
		@Produces(MediaType.APPLICATION_JSON)
		public Response getStateList(){
			try {
				return Response.status(Status.OK).entity(restaraunt.getStates()).build();
			} catch (ApplicationException e) {
				return ErrorCode.getErrorResponse(e);
			}		
		}
		
		@GET
		@Path("/cities/state/{stateName}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response getCityByStateName(@PathParam("stateName")String stateName){
			try {
				return Response.status(Status.OK).entity(restaraunt.getCityByStateName(stateName)).build();
			} catch (ApplicationException e) {
				return ErrorCode.getErrorResponse(e);
			}		
		}
		
		@GET
		@Path("/areas/city/{citySid}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response getAreaByCitySid(@PathParam("citySid")String citySid){
			try {
				return Response.status(Status.OK).entity(restaraunt.getAreaByCitySid(citySid)).build();
			} catch (ApplicationException e) {
				return ErrorCode.getErrorResponse(e);
			}		
		}
		
		@POST
		@Path("/search")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response findRestaraunts(ManualLocationInput locationInput){
			return null;
		}
}
