package com.dozer.converter;

import java.sql.Timestamp;

import org.dozer.CustomConverter;

import com.common.utils.DateUtils;

public class TimestampToStringConverter implements CustomConverter {

	private DateUtils dateUtils;
	
	public TimestampToStringConverter() {
	}
	
	public TimestampToStringConverter(DateUtils dateUtils) {
		this.dateUtils = dateUtils;
	}

	@SuppressWarnings("static-access")
	public Object convert(Object destinationFieldValue, Object sourceFieldValue, Class<?> destinationClass, Class<?> sourceClass) {
		if(sourceFieldValue == null){
			return null;
		}
		
		if(destinationFieldValue == null){
			Timestamp timestamp	= (Timestamp) sourceFieldValue;
			return dateUtils.convertTimeStampToString(timestamp);
		}
		return null;
	}
}