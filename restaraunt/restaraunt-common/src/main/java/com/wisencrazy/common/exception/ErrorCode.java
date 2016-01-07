package com.wisencrazy.common.exception;


import java.io.Serializable;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorCode extends Exception implements Serializable {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(ErrorCode.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 
	 */
	public ErrorCode() {
		super();
	}
	
	
	public static CommonErrorCode getCommonErrorObject(Exception exception){
		logger.debug("getCommonErrorObject(Exception) - start"); 

		String developerMessage = "check whether the exception is initialized or not";
		if(exception.getCause() != null){
			developerMessage = exception.getCause().getMessage();
		}
		CommonErrorCode returnCommonErrorCode = new CommonErrorCode(exception.getMessage(), exception.getMessage(), developerMessage);
		logger.debug("getCommonErrorObject(Exception) - end"); 
		return returnCommonErrorCode;
	}
	
	/**
	 * @author ShekharWNC
	 * @param exception
	 * @return This is used to return Response object for exceptions.
	 */
	public static Response getErrorResponse(Exception exception, int httpStatusCode){
		logger.debug("getErrorResponse(Exception, int) - start"); 

		Response returnResponse = Response.status(httpStatusCode).entity(getCommonErrorObject(exception)).build();
		logger.debug("getErrorResponse(Exception, int) - end"); 
		return returnResponse;
	}
	
	/**
	 * @author ShekharWNC
	 * @param exception
	 * @return This is used to return Response object for exceptions.
	 */
	public static Response getErrorResponse(Exception exception){
		logger.debug("getErrorResponse(Exception) - start"); 

		Response returnResponse = Response.status(417).entity(getCommonErrorObject(exception)).build();//417 - Expectation Failed.
		logger.debug("getErrorResponse(Exception) - end"); 
		return returnResponse;
	}
}
