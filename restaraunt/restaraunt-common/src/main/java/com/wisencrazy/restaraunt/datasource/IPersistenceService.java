package com.wisencrazy.restaraunt.datasource;

import java.util.List;
import java.util.Map;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;

import com.dto.MaxMinRecordDTO;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.DuplicateEntryException;
import com.wisencrazy.common.exception.NullKeyException;
import com.wisencrazy.common.exception.PersistenceException;
import com.wisencrazy.common.exception.UserNotFoundException;

public interface IPersistenceService<T> {

	<T> T findDtoBySid(Class<T> dtoName, String entityName, String sid, String mapId) throws ApplicationException;

	void save(T t) throws ApplicationException;

	void persist(T t) throws DuplicateEntryException, ApplicationException;

	// we can find user details by input emailId
	T findUserByEmailId(String emailId) throws UserNotFoundException;

	// we can find user details by input emailId
	T findCustomerByEmailId(String emailId) throws UserNotFoundException;

	EntityManager getEntityManager();

	T update(T t) throws PersistenceException;

	T findEntityById(Class entityName, int id) throws ApplicationException;

	T findEntityByObjectKey(Class entityName, Object key) throws NullKeyException;

	T findTableEntityById(Class entityName, int id) throws ApplicationException;

	<T> T getEntityBySid(Class<T> clazz, String sid) throws ApplicationException;

	<T> T getEntityBySid(String entity, String sid)
			throws com.wisencrazy.common.exception.NoResultException, ApplicationException;

	void remove(T t) throws ApplicationException;

	<U, V> void deleteOrphan(U entity, U entityCheck) throws ApplicationException;

	Integer findIdBySid(String parameter, String sid) throws Exception;

	String findSidById(String entityName, Integer id) throws ApplicationException;

	String findVirtualAccountSidByAgentSid(String agentSid, String companySid) throws ApplicationException;

	<T> List<T> findEntityList(Class<T> clazz) throws ApplicationException;

	T removeEntityBySid(Class clazz, String sid) throws ApplicationException;

	void removeEntityByNamedQuery(String namedQuery, Map<String, Object> parameters) throws ApplicationException;

	T findSingleByNamedQuery(String queryName, Map<String, Object> parameters) throws ApplicationException;

	List findEntityListByNamedQuery(String queryName, Map<String, Object> parameters, int limits)
			throws ApplicationException;

	List findEntityListByNamedQuery(String queryName, Map<String, Object> parameters) throws ApplicationException;

	Integer findIdByName(String entityName, String name) throws ApplicationException;

	MaxMinRecordDTO getMaxMinRecord(Integer pageNumber, Integer recordLimit) throws ApplicationException;

	<T> List<T> findEntityListByQuery(Class<T> t, String queryString, Map<String, Object> parameters)
			throws ApplicationException;

	void executeFunction(String procedure) throws ApplicationException;

	void executeNativeQuery(String queryString) throws ApplicationException;

	void insertOrUpdateByNamedQuery(String namedQuery, Map<String, Object> parameters) throws ApplicationException;

	void insertOrUpdateByNativeQuery(String namedQuery, Map<String, Object> parameters) throws ApplicationException;

	void deleteEntityBySid(String entityName, String sid) throws ApplicationException;

	List findEntityListUsingNamedQueryByPagination(String queryString, Map<String, Object> parameters, int startLimit,
			int endLimit) throws ApplicationException;

	<T> List<T> findEntityListByNativeQuery(String queryString, Map<String, Object> parameters, Class<T> clazz)
			throws ApplicationException;

	<T> List<T> findEntityListByNativeQueryByPagination(String queryString, Map<String, Object> parameters,
			Class<T> clazz, int startLimit, int endLimit) throws ApplicationException;

	<T> int findEntityListSizeByNativeQuery(String queryString, Map<String, Object> parameters, Class<T> clazz)
			throws ApplicationException;

	<T, U> List<U> getDtoListByEntity(Class<T> entityClass, Class<U> dtoClass) throws ApplicationException;

}