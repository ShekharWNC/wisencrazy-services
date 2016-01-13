package com.wisencrazy.restaraunt.admin;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dto.CustomerSignupDTO;
import com.dto.DirectoryCustomerViewDTO;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.ErrorCode;

/**
 * User: Wisencrazy
 */
@Path("/customer")
public class CustomerAccount {

	
	private static Logger logger=LoggerFactory.getLogger(MessageRestService.class);

	
	@Path("signup")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response customerSignup(CustomerSignupDTO customerSignupDTO,
			@Context HttpServletRequest request) {
		logger.debug("customerSignup(CustomerSignupDTO, HttpServletRequest)",JsonUtils.toJson(customerSignupDTO));
		DirectoryCustomerViewDTO customer = null;
		try{
			String url = request.getRequestURL().substring(0, (request.getRequestURL().length()-request.getRequestURI().length()));
			customer = profileModel.customerSignup(customerSignupDTO);
		}catch(ApplicationException applicationException){
			return ErrorCode.getErrorResponse(applicationException);
		}
		logger.debug("Completed sign up for customer");
		logger.trace("customerSignup(CustomerSignupDTO, HttpServletRequest) - End");
		return Response.status(Status.OK).entity(customer).build();//Customer registered successfully.
	}
	
	
}
