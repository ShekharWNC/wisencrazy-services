package com.wisencrazy.restaraunt.datasource;

import java.io.Serializable;

import com.wisencrazy.common.exception.ApplicationException;

public class DatasourceFactory {
	private static AbsPersistenceService<Serializable> absPersistenceService;
	
	public static AbsPersistenceService<Serializable> getAbsPersistence() throws ApplicationException{
		if(absPersistenceService==null){
			absPersistenceService=new AbsPersistenceService<Serializable>();
		}
		return absPersistenceService;
	}
	
	
}
