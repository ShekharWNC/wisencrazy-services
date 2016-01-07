package com.dozer.converter;

import org.dozer.CustomConverter;

import com.common.utils.DateUtils;

public class StringToTimestampConverter implements CustomConverter {

	private DateUtils dateUtils;
	
	public StringToTimestampConverter() {
	}

	public StringToTimestampConverter(DateUtils dateUtils) {
		this.dateUtils = dateUtils;
	}
	
	@SuppressWarnings({ "deprecation", "static-access" })
	public Object convert(Object destinationObject, Object sourceObject, Class<?> destinationClass, Class<?> sourceClass) {
		if(sourceObject == null){
			return null;
		}
		
		if(destinationObject == null){
			String dateString = (String)sourceObject;
			return dateUtils.convertStringToTimeStamp(dateString);
		}
		return null;
	}

}
