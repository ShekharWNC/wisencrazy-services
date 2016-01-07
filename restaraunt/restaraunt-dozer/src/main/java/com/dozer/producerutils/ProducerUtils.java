package com.dozer.producerutils;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.inject.Produces;

import com.repositoryservice.persistenceservice.IPersistenceService;
public class ProducerUtils {
	
	@EJB(lookup="java:jboss/exported/repositoryservice/repositoryservice-common/PersistenceServiceImpl!com.repositoryservice.persistenceservice.IPersistenceService")
	IPersistenceService<Serializable> persistenceService;
	@Produces @EJBDozerProducerBean
	public IPersistenceService<Serializable> getPersistenceService(){
		return persistenceService;
	}
}
