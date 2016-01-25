package com.wisencrazy.restaraunt.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.dto.RestarauntDTO;
import com.dto.RestarauntHasReviewsDTO;
import com.dto.RestarauntHasReviewsInput;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.ErrorCode;
import com.wisencrazy.restaraunt.rest.dto.ManualLocationInput;
import com.wisencrazy.restaraunt.rest.dto.GoogleLocationInput;
import com.wisencrazy.restaraunt.services.RestarauntManage;
import com.wisencrazy.restaraunt.services.RestarauntSearch;

@Path("/restaraunt/review")
public class RestarauntReviewRest {

		private static RestarauntSearch restaraunt=new RestarauntSearch();
		
		@Path("/info")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response findSearchPageReview(List<RestarauntDTO> restarauntDTOs){
			try {
				return Response.status(Status.OK).entity(restaraunt.searchpageRestarauntReview(restarauntDTOs)).build();
			} catch (ApplicationException e) {
				return ErrorCode.getErrorResponse(e);
			}
			
		}


		@Path("/submit")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response submit(RestarauntHasReviewsDTO hasReviewsDTO){
			try {
				return Response.status(Status.OK).entity(restaraunt.submitReview(hasReviewsDTO)).build();
			} catch (ApplicationException e) {
				return ErrorCode.getErrorResponse(e);
			} catch (Exception e) {
				return ErrorCode.getErrorResponse(e);
			}
			
		}
		
		@Path("/{sid}")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response getReviews(@PathParam("sid")String restroSid,RestarauntHasReviewsInput input){
			try {
				return Response.status(Status.OK).entity(restaraunt.getRestarauntReviews(restroSid, input)).build();
			} catch (ApplicationException e) {
				return ErrorCode.getErrorResponse(e);
			} catch (Exception e) {
				return ErrorCode.getErrorResponse(e);
			}
		}
}
