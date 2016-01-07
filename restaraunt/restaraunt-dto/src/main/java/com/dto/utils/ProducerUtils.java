package com.dto.utils;

import javax.ejb.EJB;
import javax.enterprise.inject.Produces;

import com.dto.persistence.IDtoPersistence;

public class ProducerUtils {
	private static IDtoPersistence dtoPersistence1;
	
	@EJB(lookup="java:global/repositoryservice/repositoryservice-ejb/DtoPersistenceImpl!com.dto.persistence.IDtoPersistence")
	IDtoPersistence dtoPersistence;
	
	@Produces
	public IDtoPersistence getDtoPersistence(){
		dtoPersistence1 = dtoPersistence;
		return dtoPersistence;
	}

	public static IDtoPersistence getDtoPersistenceRemote() {
		return dtoPersistence1;
	}
	

}
