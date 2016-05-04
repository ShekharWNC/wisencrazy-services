package com.wisencrazy.restaraunt.rest;

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

import org.apache.commons.httpclient.HttpStatus;

import com.dto.OrderDTO;
import com.dto.PaymentDTO;
import com.dto.PaymentDTO.PaymentMode;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.ErrorCode;
import com.wisencrazy.common.exception.IncorrectArgumentException;
import com.wisencrazy.common.exception.NoResultException;
import com.wisencrazy.common.exception.PersistenceException;
import com.wisencrazy.restaraunt.rest.dto.OrderSearchDTO;
import com.wisencrazy.restaraunt.rest.resource.PaymentRes;
import com.wisencrazy.restaraunt.services.OrderManagementServices;

@Path("/order")
public class OrderRest {


	private static OrderManagementServices orderService=new OrderManagementServices();
	
	@Path("")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response submitOrder(OrderDTO orderDTO){
		try {
			return Response.status(Status.OK).entity(orderService.createOrder(orderDTO)).build();
		} catch (IncorrectArgumentException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (NoResultException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}
	}

	@Path("/{sid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrder(@PathParam("sid")String orderSid){
		try {
			return Response.status(Status.OK).entity(orderService.getOrderBySid(orderSid)).build();
		} catch (IncorrectArgumentException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (NoResultException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_NOT_FOUND);
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}
	}
	
	@Path("/orders/{sid}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response findOrdersForRestaraunt(@PathParam("sid")String restarauntSid,OrderSearchDTO searchDTO){
		try {
			return Response.status(Status.OK).entity(orderService.getOrdersByRestroSid(restarauntSid, searchDTO)).build();
		} catch (IncorrectArgumentException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (NoResultException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_NOT_FOUND);
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}
	}	
	
	@Path("/orders/{sid}")
	@GET
	@Produces("application/vnd.ms-excel")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response findOrdersForRestarauntXL(@PathParam("sid")String restarauntSid,OrderSearchDTO searchDTO){
		try {
			return Response.status(Status.OK).entity(orderService.getOrdersByRestroSid(restarauntSid, searchDTO)).build();
		} catch (IncorrectArgumentException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (NoResultException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_NOT_FOUND);
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}
	}	
	
	@Path("/status/{orderSid}/{status}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateOrderStatus(@PathParam("orderSid")String orderSid,@PathParam("status")String status){
		try {
			return Response.status(Status.OK).entity(orderService.updateDeliveryStatus(orderSid, status)).build();
		} catch (IncorrectArgumentException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (NoResultException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_NOT_FOUND);
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		} catch (PersistenceException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}		
	}
	
	@Path("/payment/{orderSid}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postPaymentInfo(@PathParam("orderSid")String orderSid,PaymentRes payment){
		try {
			PaymentDTO paymentDTO=new PaymentDTO();
			paymentDTO.setPaymentAmount(payment.getPaymentAmount());
			paymentDTO.setPaymentMode(Enum.valueOf(PaymentMode.class, payment.getPaymentMode()));
			return Response.status(Status.OK).entity(orderService.insertPayment(orderSid, paymentDTO)).build();
		} catch (IncorrectArgumentException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (NoResultException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_NOT_FOUND);
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}		
	}
	
	@Path("/payment/status/{paymentSid}/{status}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updatePaymentStatus(@PathParam("paymentSid")String paymentSid,@PathParam("status")String status){
		try {
			return Response.status(Status.OK).entity(orderService.updatePaymentStatus(paymentSid, status)).build();
		} catch (IncorrectArgumentException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_BAD_REQUEST);
		} catch (NoResultException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_NOT_FOUND);
		} catch (ApplicationException e) {
			return ErrorCode.getErrorResponse(e,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}		
	}
	
}
