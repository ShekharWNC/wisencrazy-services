package com.dozer.converter;

import org.dozer.CustomConverter;

public class EnumToStringConverter implements CustomConverter{

	
	public EnumToStringConverter() {
	}
	
	@SuppressWarnings("static-access")
	public Object convert(Object destinationFieldValue, Object sourceFieldValue, Class<?> destinationClass, Class<?> sourceClass) {
		if(sourceFieldValue == null){
			return null;
		}
		
		if(destinationFieldValue == null){
			Enum enum1	= (Enum) sourceFieldValue;
			return enum1.name();
		}
		return destinationFieldValue;
	}
}
