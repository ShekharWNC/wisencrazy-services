package com.dozer.converter;

import org.dozer.CustomConverter;

import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;

public class EntityByteArrayToSid implements CustomConverter {

	@Override
	public Object convert(Object existingDestinationFieldValue,
			Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		if(sourceFieldValue == null){
			return null;
		}
		if(existingDestinationFieldValue == null){
			AbsBaseEntity baseEntity = (AbsBaseEntity) sourceFieldValue;
			return baseEntity.bytesToHexStringBySid(baseEntity.getSid());
		}
		
		return null;
	}

}
