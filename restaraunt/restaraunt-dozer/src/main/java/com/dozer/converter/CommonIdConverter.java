package com.dozer.converter;

import java.io.Serializable;

import org.dozer.ConfigurableCustomConverter;

import com.repositoryservice.persistenceservice.IPersistenceService;

public class CommonIdConverter implements ConfigurableCustomConverter {
	private String parameter;
	
	private IPersistenceService<Serializable> persistenceServiceImpl;
	
	public CommonIdConverter() {
	}
	
	public CommonIdConverter(IPersistenceService<Serializable> persistenceServiceImpl){
		this.persistenceServiceImpl = persistenceServiceImpl;
	}
	
	public Object convert(Object destFieldValue,	Object sourceFieldValue, Class<?> destinationClass,	Class<?> sourceClass) {
		if(sourceFieldValue == null){
			return null;
		}
		
		if(destFieldValue == null){
			try {
				destFieldValue = persistenceServiceImpl.findIdBySid(parameter, sourceFieldValue.toString());
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