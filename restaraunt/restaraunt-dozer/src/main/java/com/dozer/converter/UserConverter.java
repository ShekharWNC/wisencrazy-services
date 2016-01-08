package com.dozer.converter;

import java.io.Serializable;

import org.dozer.ConfigurableCustomConverter;

import com.wisencrazy.restaraunt.datasource.IPersistenceService;

public class UserConverter implements ConfigurableCustomConverter {
	private String parameter;
	
	private IPersistenceService<Serializable> persistenceServiceImpl;
	
	public UserConverter() {
	}
	
	public UserConverter(IPersistenceService<Serializable> persistenceServiceImpl){
		this.persistenceServiceImpl = persistenceServiceImpl;
	}
	
	public Object convert(Object destFieldValue,	Object sourceFieldValue, Class<?> destinationClass,	Class<?> sourceClass) {
		if(sourceFieldValue == null){
			return null;
		}
		
		if(destFieldValue == null){
			try {
				destFieldValue = persistenceServiceImpl.getEntityBySid(parameter, sourceFieldValue.toString());
			} catch (NumberFormatException e) {
				return null;
			} catch (Exception e) {
				return null;
			}
		}
		
		return destFieldValue;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

}
