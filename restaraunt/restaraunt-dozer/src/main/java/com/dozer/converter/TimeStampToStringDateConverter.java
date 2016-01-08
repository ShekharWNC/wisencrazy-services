package com.dozer.converter;

import java.sql.Timestamp;

import org.dozer.CustomConverter;

import com.wisencrazy.common.DateUtils;

/**
 * 
 * @author vikash
 *
 */
public class TimeStampToStringDateConverter implements CustomConverter {
	private DateUtils dateUtils;

	public TimeStampToStringDateConverter() {
		// TODO Auto-generated constructor stub
	}

	public TimeStampToStringDateConverter(DateUtils dateUtils) {
		this.dateUtils = dateUtils;
	}

	@Override
	public Object convert(Object destinationFieldValue,
			Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		if (sourceFieldValue == null) {
			return null;
		}

		if (destinationFieldValue == null) {
			Timestamp sqlDate = (Timestamp) sourceFieldValue;
			return dateUtils.convertDataTOString(sqlDate);
		}
		return null;
	}

}
