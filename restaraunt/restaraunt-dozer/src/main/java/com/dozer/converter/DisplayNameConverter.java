package com.dozer.converter;

import java.io.Serializable;

import org.dozer.CustomConverter;

import com.callcomm.eserve.persistence.entity.Appuser;
import com.common.exception.UserNotFoundException;
import com.repositoryservice.persistenceservice.IPersistenceService;

public class DisplayNameConverter implements CustomConverter {

	private IPersistenceService<Serializable> persistenceServiceImpl;
	
	public DisplayNameConverter() {
	}
	
	public DisplayNameConverter(IPersistenceService<Serializable> persistenceServiceImpl) {
		this.persistenceServiceImpl = persistenceServiceImpl;
	}
	
	public Object convert(Object destFieldValue,	Object sourceFieldValue, Class<?> destinationClass,	Class<?> sourceClass) {
		
		if(sourceFieldValue == null){
			return null;
		}
		
		if(destFieldValue == null){
			try {
				Appuser user= (Appuser) persistenceServiceImpl.findUserByEmailId(sourceFieldValue.toString());
				destFieldValue = user.getDisplayName();
			} catch (NumberFormatException e) {
				return null;
			} catch (UserNotFoundException e) {
				return null;
			}
		}
		
		return destFieldValue;
	}

}