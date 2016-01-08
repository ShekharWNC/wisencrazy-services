package com.dozer.producerutils;
import java.io.Serializable;

import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.restaraunt.datasource.DatasourceFactory;
import com.wisencrazy.restaraunt.datasource.IPersistenceService;
public class ProducerUtils {
	
	IPersistenceService<Serializable> persistenceService;

	public IPersistenceService<Serializable> getPersistenceService(){
		try {
			return DatasourceFactory.getAbsPersistence();
		} catch (ApplicationException e) {
			e.printStackTrace();
			return null;
		}
	}
}
