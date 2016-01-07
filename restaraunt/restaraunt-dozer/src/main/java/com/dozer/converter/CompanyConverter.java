package com.dozer.converter;

import java.io.Serializable;

import org.dozer.CustomConverter;

import com.callcomm.eserve.persistence.entity.Company;
import com.common.exception.ApplicationException;
import com.repositoryservice.persistenceservice.IPersistenceService;

public class CompanyConverter implements CustomConverter {

	private IPersistenceService<Serializable> persistenceServiceImpl;
	
	public CompanyConverter() {
	}
	
	public CompanyConverter(IPersistenceService<Serializable> persistenceServiceImpl) {
		this.persistenceServiceImpl = persistenceServiceImpl;
	}
	
public Object convert(Object destFieldValue,	Object sourceFieldValue, Class<?> destinationClass,	Class<?> sourceClass) {
		
		if(sourceFieldValue == null){
			return null;
		}
		
		if(destFieldValue == null){
			try {
				destFieldValue = persistenceServiceImpl.findEntityById(Company.class, Integer.parseInt(sourceFieldValue.toString()));
			} catch (NumberFormatException e) {
				return null;
			} catch (ApplicationException e) {
				return null;
			}
		}
		
		return destFieldValue;
	}

}
