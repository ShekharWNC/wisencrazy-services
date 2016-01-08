package com.dozer.converter;

import java.sql.Date;

import org.dozer.CustomConverter;

import com.wisencrazy.common.DateUtils;

public class SqlDateToStringConverter implements CustomConverter {

	private DateUtils dateUtils;
	
	public SqlDateToStringConverter() {
		// TODO Auto-generated constructor stub
	}
	
	public SqlDateToStringConverter(DateUtils dateUtils){
		this.dateUtils = dateUtils;
	}
	
	@Override
	public Object convert(Object destinationFieldValue,
			Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		if(sourceFieldValue == null){
			return null;
		}
		
		if(destinationFieldValue == null){
			Date sqlDate	= (Date) sourceFieldValue;
			return dateUtils.convertSqlDateToString(sqlDate);
		}
		return null;
	}

}
