package com.wisencrazy.restaraunt.admin;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dto.CustomerDTO;
import com.dto.CustomerSignupDTO;
import com.dto.constants.EnumConstants.SignupType;
import com.google.dto.CustomerLoginDTO;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.ErrorCode;
import com.wisencrazy.restaraunt.account.CustomerLogin;

/**
 * User: Wisencrazy
 */
@Path("/customer")
public class CustomerAccount {

	
	private static Logger logger=LoggerFactory.getLogger(MessageRestService.class);

	private static CustomerLogin customerLogin=new CustomerLogin();
	
	@Path("signup")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response customerSignup(CustomerSignupDTO customerSignupDTO,
			@Context HttpServletRequest request) {
		logger.debug("customerSignup(CustomerSignupDTO, HttpServletRequest)",JsonUtils.toJson(customerSignupDTO));
		CustomerDTO customer = null;
		try{
			customer = customerLogin.customerSignup(customerSignupDTO);
		}catch(ApplicationException applicationException){
			return ErrorCode.getErrorResponse(applicationException);
		}
		logger.debug("Completed sign up for customer");
		logger.trace("customerSignup(CustomerSignupDTO, HttpServletRequest) - End");
		return Response.status(Status.OK).entity(customer).build();//Customer registered successfully.
	}
	
	@GET
	@Path("/json/{className}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response customerSignup(@PathParam("className")String className) {
		CustomerSignupDTO customer=new CustomerSignupDTO();
		customer.setEmail("email");
		customer.setPassword("passowrd");
		customer.setName("Shekhar");
		customer.setSignupType(SignupType.restaraunt);
		return Response.status(Status.OK).entity(customer).build();//Customer registered successfully.
	}
	
	@GET
	@Path("/{emailId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getcustomerEmail(@PathParam("emailId")String email){
		try {
			return Response.status(Status.OK).entity(customerLogin.getCustomerEmail(email)).build();
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e);
		}		
	}
	
	@POST
	@Path("/login/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response customerLogin(CustomerLoginDTO customerLoginDTO){
		try {
			return Response.status(Status.OK).entity(customerLogin.customerLogin(customerLoginDTO)).build();
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e);
		}		
	}
}
