package com.wisencrazy.restaraunt.datasource;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dto.MaxMinRecordDTO;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.DuplicateEntryException;
import com.wisencrazy.common.exception.NullKeyException;
import com.wisencrazy.common.exception.PersistenceException;
import com.wisencrazy.common.exception.UserNotFoundException;
import com.wisencrazy.restaraunt.datasource.entities.entity.AbsCompositeEntity;


class AbsPersistenceService<T> implements Serializable, IPersistenceService<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6958295831079445340L;

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(AbsPersistenceService.class);

	private static EntityManager entityManager;
	
	private static int instances=0;
	
	public AbsPersistenceService() throws ApplicationException{
		if(instances>0)throw new ApplicationException();
		entityManager=getEntityManager();
		instances=1;
	}
	
	public <T> T findDtoBySid(Class<T> dtoName, String entityName, String sid,
			String mapId) throws ApplicationException {
		return null;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)	
	public void save(T t) throws ApplicationException {
		logger.trace("save(T) - start"); 
		try{
			entityManager.merge(t);
		}catch(ConstraintViolationException exception){
			logger.error("save(T)", exception);
			throw new DuplicateEntryException("Error while saving ".concat(t.getClass().getSimpleName()),exception);			
		}catch(Exception exception){
			if(exception.getCause().toString().contains(ConstraintViolationException.class.getSimpleName())){
				throw new DuplicateEntryException("Error while saving ".concat(t.getClass().getSimpleName()),exception);
			}
			logger.error("save(T)", exception); 
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("save(T) - end"); 
	}
	
	public void persist(T t) throws DuplicateEntryException,ApplicationException {
		logger.trace("persist(T) - start"); 
		try{
			entityManager.persist(t);
		}catch(ConstraintViolationException exception){
			logger.error("save(T)", exception);
			throw new ApplicationException(ApplicationConstants.CONSTRAINT_VIOLATION);//Duplicate entry should not be allowed.
		}catch(Exception exception){
			if(exception.getCause().toString().contains(ConstraintViolationException.class.getSimpleName())){
				throw new DuplicateEntryException(ApplicationConstants.DUPLICATE_ENTRY,exception);//Duplicate entry should not be allowed.			
			}
			logger.error("persist(T)", exception); 
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("persist(T) - end"); 
	}
	
	public T findUserByEmailId(String emailId) throws UserNotFoundException {
		logger.debug("findUserByEmailId({}) - start",emailId); 

		Query userQuery = null;
		T user=null;
		try {
			userQuery=entityManager.createQuery("select u from Appuser u where u.username=:emailId");
			userQuery.setParameter("emailId", emailId);
			user=(T) userQuery.getSingleResult();
		}
		catch(NoResultException noResultException){
			logger.error("findUserByEmailId(String)", noResultException.getMessage()); 

			throw new UserNotFoundException();
		}
		catch(Exception e){
			logger.error("findUserByEmailId(String)", e); 

			throw new UserNotFoundException();
		}

		logger.trace("findUserByEmailId(String) - end"); 
		return user;
	}

	public T findCustomerByEmailId(String emailId) throws UserNotFoundException {
		Query userQuery = null;
		T user=null;
		try {
			userQuery=entityManager.createQuery("select u from Customer u where u.email=:email");
			userQuery.setParameter("email", emailId);
			user=(T) userQuery.getSingleResult();
		}catch(Exception e){
			logger.error("findUserByEmailId(String)", e); 
			throw new UserNotFoundException();
		}
		return user;
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#getEntityManager()
	 */
	public EntityManager getEntityManager() {
		
		if(entityManager!=null)return entityManager;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("RestroDB");
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#update(T)
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public T update(T t) throws PersistenceException {
		logger.trace("update(T) - start"); 

		try{
			T returnT = entityManager.merge(t);
			logger.trace("update(T) - end"); 
			return returnT;
		}catch (Exception exception){
			logger.error("update(T)", exception); 

			throw new PersistenceException(ApplicationConstants.GENERAL_EXCEPTION);
		}
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityById(java.lang.Class, int)
	 */
	public T findEntityById(Class entityName, int id)throws ApplicationException{
		logger.trace("findEntityById(Class, int) - start"); 
		try{
//			return (T) entityManager.find(entityName, id);
			Query query = entityManager.createQuery("select e from "+ entityName.getSimpleName() + " e where e.id = :id");
			query.setParameter("id", id);
			T returnT = (T) query.getSingleResult();
			logger.trace("findEntityById(Class, int) - end"); 
			return returnT;
		}catch(NoResultException noResultException){
			logger.error("findEntityById(Class, int)", noResultException); 
			throw new ApplicationException(ApplicationConstants.NO_RESULT, noResultException);
		}catch (Exception exception) {
			logger.error("findEntityById(Class, int)", exception); 

			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityByObjectKey(java.lang.Class, java.lang.Object)
	 */
	public T findEntityByObjectKey(Class entityName, Object key) throws NullKeyException{
		if(key==null)throw new NullKeyException(ApplicationConstants.NULL_KEY,"Object Key cannot be null",null);
		try{
			T returnObj=(T) entityManager.find(entityName, key);
			return returnObj;
		}catch(Exception e){
			logger.error("Error while fetching object {} based on Key : {}",entityName.getName(),e);
			return null;
		}
		
	}	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findTableEntityById(java.lang.Class, int)
	 */
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public T findTableEntityById(Class entityName, int id)throws ApplicationException{
		logger.trace("findEntityById(Class, int) - start"); 

		try{
//			return (T) entityManager.find(entityName, id);
			Query query = entityManager.createQuery("select e from "+ entityName.getSimpleName() + " e where e.id = :id");
			query.setParameter("id", id);
			T returnT = (T) query.getSingleResult();
			logger.trace("findEntityById(Class, int) - end"); 
			return returnT;
		}catch(NoResultException noResultException){
			logger.error("findEntityById(Class, int)", noResultException); 

			throw new ApplicationException(ApplicationConstants.NO_RESULT, noResultException);
		}catch (Exception exception) {
			logger.error("findEntityById(Class, int)", exception); 

			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
	}

	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#getEntityBySid(java.lang.Class, java.lang.String)
	 */
	public <T> T getEntityBySid(Class<T> clazz, String sid) throws ApplicationException {
		logger.trace("getEntityBySid(Class<T> clazz, String sid) - start");
		try{
			Query query = (Query) getEntityManager().createQuery("from "+clazz.getSimpleName()+" t where hex(t.sid) = :sid");
			query.setParameter("sid", sid);
			logger.debug("getEntityBySid(Class<T> clazz, String sid) - end"); 
			return (T) query.getSingleResult();
		}catch (NoResultException noResultException){
			logger.trace("getEntityBySid(Class<T> clazz, String sid) sid {}",sid);
			logger.error("No record found for this classs {} with this sid {}", clazz.getCanonicalName(), sid);
			throw new ApplicationException(ApplicationConstants.NO_RESULT, noResultException);
		}catch (Exception exception){
			logger.error("getEntityBySid(Class<T> clazz, String sid) ", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#getEntityBySid(java.lang.String, java.lang.String)
	 */
	public <T> T getEntityBySid(String entity, String sid) throws com.wisencrazy.common.exception.NoResultException,ApplicationException {
		logger.trace("getEntityBySid(String entity, String sid) - start");
		try{
			Query query = (Query) getEntityManager().createQuery("from "+entity+" t where hex(t.sid) = :sid");
			query.setParameter("sid", sid);
			logger.debug("getEntityBySid(String entity, String sid) ", entity, sid);
			logger.trace("getEntityBySid(String entity, String sid) - end"); 
			return (T) query.getSingleResult();
		}catch (NoResultException noResultException){
			logger.error("getEntityBySid(String entity, String sid) ", noResultException);
			throw new com.wisencrazy.common.exception.NoResultException(ApplicationConstants.NO_RESULT, noResultException);
		}catch (Exception exception){
			logger.error("getEntityBySid(String entity, String sid) ", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#remove(T)
	 */
	public void remove(T t) throws ApplicationException {
		logger.trace("remove(T t) - start");
		try{
			entityManager.remove(t);
		}catch(Exception exception){
			logger.error("remove(T t) - start", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("remove(T t) - end");
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#deleteOrphan(U, U)
	 */
	public <U, V> void deleteOrphan(U entity, U entityCheck) throws ApplicationException {
		if (entity != null && entityCheck != null) {
			try {
				Field[] entityFields = entity.getClass().getDeclaredFields();
				for (Field entityField : entityFields) {
					if (List.class.isAssignableFrom(entityField.getType())) {
						String entityCheckName = entityField.getName();
						List<V> entityChilds = null;
						try {
							if (!entityField.isAccessible()) {
								entityField.setAccessible(true);
							}
							entityChilds = (List<V>) entityField.get(entity);
							for (V entityChild : entityChilds) {
								Field entityCheckField = entityCheck.getClass().getDeclaredField(entityCheckName);
								if (!entityCheckField.isAccessible()) {
									entityCheckField.setAccessible(true);
								}
								List<V> entityCheckChilds = (List<V>) entityCheckField.get(entityCheck);
								int temp = 0;
								for (V entityCheckChild : entityCheckChilds) {
									AbsCompositeEntity entityChildBase = (AbsCompositeEntity) entityChild;
									AbsCompositeEntity entityCheckChildBase = (AbsCompositeEntity) entityCheckChild;
									if (entityChildBase.bytesToHexString().equals(
											entityCheckChildBase.bytesToHexString())) {
										temp++;
									}
								}
								if (temp == 0) {
									remove((T) entityChild);
								}
							}
						} catch (IllegalArgumentException illegalArgumentException) {
							logger.error("Error in deletOrpan for fieldName - {} is {}",entityCheckName,illegalArgumentException.getLocalizedMessage());
							throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG,illegalArgumentException);
						} catch (IllegalAccessException illegalAccessException) {
							logger.error("Error in deletOrpan for fieldName - {} is {}",entityCheckName,illegalAccessException.getLocalizedMessage());
							throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG,illegalAccessException);
						} catch (NoSuchFieldException noSuchFieldException) {
							logger.error("Error in deletOrpan for fieldName - {} is {}",entityCheckName,noSuchFieldException.getLocalizedMessage());
							throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG,noSuchFieldException);
						}
					}
				}
			} catch (Exception e) {
				logger.error("Error in deletOrpan is {}",e.getLocalizedMessage());
				throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG,e);
			}
		}
	}
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findIdBySid(java.lang.String, java.lang.String)
	 */
	public Integer findIdBySid(String parameter, String sid)throws Exception {
		Integer id = null;
		try{
			Query query =  entityManager.createQuery("select p.id from " + parameter + " p where hex(p.sid) = '" + sid + "'");
			id = (Integer) query.getSingleResult();
		}catch(NoResultException noResultException){
			logger.debug("id not found for entiy : {} with this sid : {}", parameter, sid);
			throw new Exception(ApplicationConstants.NO_RESULT);
		}catch(Exception exception){
			logger.error("findIdBySid(String parameter, String sid)", exception);
			throw new Exception(ApplicationConstants.GENERAL_EXCEPTION);
		}
		return id;
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findSidById(java.lang.String, java.lang.Integer)
	 */
	public String findSidById(String entityName, Integer id) throws ApplicationException {
		String sid = null;
		try{
			Query query =  entityManager.createQuery("select hex(p.sid) from " + entityName + " p where p.id=:id");
			query.setParameter("id", id);
			sid = (String) query.getSingleResult();
		}catch(NoResultException noResultException){
			logger.debug("sid not found for entiy : {} with this id : {}", entityName, id);
			throw new ApplicationException(ApplicationConstants.NO_RESULT);
		}catch(Exception exception){
			logger.error("findSidById(String entityName, String id)", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION);
		}
		return sid;
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findVirtualAccountSidByAgentSid(java.lang.String, java.lang.String)
	 */
	public String findVirtualAccountSidByAgentSid(String agentSid, String companySid) throws ApplicationException {
		logger.trace("findVirtualAccountSidByAgentSid(String, String) - Start");
		try{
            Query query=entityManager.createQuery("select hex(va.sid) from VirtualAccount va inner join va.user inner join va.company where hex(va.user.sid)=:agentSid and hex(va.company.sid) = :companySid");
            query.setParameter("agentSid", agentSid);
            query.setParameter("companySid", companySid);
            logger.trace("findVirtualAccountSidByAgentSid(String, String) - End");
            return (String) query.getSingleResult();			
		}catch(NoResultException noResultException){
			logger.info("findVirtualAccountSidByAgentSid(String, String) - virtual account not found with userSid {} and companySid {}", agentSid, companySid);
			return null;
		}catch(Exception exception){
			logger.error("findVirtualAccountSidByAgentSid(String, String) ", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityList(java.lang.Class)
	 */
	public <T> List<T> findEntityList(Class<T> clazz)throws ApplicationException {
		logger.info("findEntityList(Class<T>) - Start");
		try{
			Query query = entityManager.createQuery("from " + clazz.getSimpleName());
			logger.info("findEntityList(Class<T>) - End");
			return query.getResultList();
		}catch(Exception exception){
			logger.info("getting the entity : {} objects list has failed", clazz);
			logger.error("findEntityList(Class<T>) ", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
	}

	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#removeEntityBySid(java.lang.Class, java.lang.String)
	 */
	public T removeEntityBySid(Class clazz, String sid)throws ApplicationException{
		logger.trace("removeEntityBySid(String) - Start");
		T t = (T) getEntityBySid(clazz, sid);
		remove(t);
		logger.trace("removeEntityBySid(String) - End");
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#removeEntityByNamedQuery(java.lang.String, java.util.Map)
	 */
	public void removeEntityByNamedQuery(String namedQuery, Map<String, Object> parameters)throws ApplicationException{
		logger.trace("removeEntityByNamedQuery(String, Map<String, Object>) - Start");
		T t = null;
		try {
			t = findSingleByNamedQuery(namedQuery, parameters);
			entityManager.remove(t);
		} catch(ApplicationException applicationException){
			logger.error("removeEntityByNamedQuery(String, Map<String, Object>)", applicationException);
			throw applicationException;
		}catch (Exception exception) {
			logger.error("removeEntityByNamedQuery(String, Map<String, Object>)", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("removeEntityByNamedQuery(String, Map<String, Object>) - End");
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findSingleByNamedQuery(java.lang.String, java.util.Map)
	 */
	public T findSingleByNamedQuery(String queryName,
			Map<String, Object> parameters) throws ApplicationException {
		logger.info("findSingleByNamedQuery for -  {}", queryName);
		T t = null;
		try {
			Set<Map.Entry<String, Object>> rawParameters = null;
			if (queryName == null || queryName.isEmpty()) {
				logger.error("Error at findEntityListByNamedQuery - query name is empty");
				throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG);
			}
			if (parameters != null) {
				rawParameters = parameters.entrySet();
			}
			Query query = entityManager.createNamedQuery(queryName);
			for (Map.Entry<String, Object> entry : rawParameters) {
				query.setParameter(entry.getKey(), entry.getValue());
			}
			t = (T) query.getSingleResult();
		} catch (NoResultException noResultException){
			throw new ApplicationException(ApplicationConstants.NO_RESULT, noResultException);
		} catch (NonUniqueResultException nonUniqueResultException) {
			throw new ApplicationException(ApplicationConstants.NO_RESULT, nonUniqueResultException);
		} catch (Exception exception) {
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		return t;
	}

	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityListByNamedQuery(java.lang.String, java.util.Map, int)
	 */
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public List findEntityListByNamedQuery(String queryName,
			Map<String, Object> parameters, int limits)
			throws ApplicationException {
		List list = null;
		Set<Map.Entry<String, Object>> rawParameters = null;
		logger.trace("findEntityListByNamedQuery for -  {} with limits {}",
				queryName, limits);
		if (queryName == null || queryName.isEmpty()) {
			logger.error("Error at findEntityListByNamedQuery - query name is empty");
			throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG);//Query name should not be null.
		}
		if (parameters != null) {
			rawParameters = parameters.entrySet();
		}
		Query query = entityManager.createNamedQuery(queryName);
		
		if(rawParameters != null){
			for (Map.Entry<String, Object> entry : rawParameters) {
				query.setParameter(entry.getKey(), entry.getValue());
			}
		}
		if (limits > 0) {
			query.setMaxResults(limits);
		}
		try {
			list = (List<T>) query.getResultList();
		} catch (NoResultException noResultException) {
			logger.error("Error at findEntityListByNamedQuery() -error is {} for query - {} with the limits {} ", 
					noResultException.getMessage(),queryName,limits);
			throw new ApplicationException(ApplicationConstants.NO_RESULT, noResultException);
		}catch (Exception exception){
			logger.error("findEntityListByNamedQuery() -error is {}", exception.getMessage());
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception.getCause());
		}
		return list;
	}

	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityListByNamedQuery(java.lang.String, java.util.Map)
	 */
	public List findEntityListByNamedQuery(String queryName,
			Map<String, Object> parameters)
			throws ApplicationException {
		return (List<T>) findEntityListByNamedQuery(queryName, parameters, 0);
	}

	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findIdByName(java.lang.String, java.lang.String)
	 */
	public Integer findIdByName(String entityName, String name)throws ApplicationException{
		Integer id = null;
		logger.trace("findIdByName(String, String) - Start");
		try {
			Query query = entityManager.createQuery("select e.id from " + entityName + " e where e.name = :name");
			query.setParameter("name", name);
			id = (Integer) query.getSingleResult();
		} catch(NoResultException noResultException){
			logger.error("id not found for {} with name : {}", entityName, name);
			throw new ApplicationException(ApplicationConstants.NO_RESULT);
		} catch (Exception exception) {
			logger.error("findIdByName(String, String)", exception.getLocalizedMessage());
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION);
		}
		logger.trace("findIdByName(String, String) - End");
		return id;
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#getMaxMinRecord(java.lang.Integer, java.lang.Integer)
	 */
	public MaxMinRecordDTO getMaxMinRecord(Integer pageNumber,Integer recordLimit) throws ApplicationException{
		if(pageNumber==0){
			pageNumber=1;
		}else if (recordLimit==0) {
			recordLimit=ApplicationConstants.RECORD_SIZE_DEFAULT;
		}
		Integer startFrom=(pageNumber-1)*recordLimit;
		Integer startTo=recordLimit;
		MaxMinRecordDTO maxMinRecordDTO=new MaxMinRecordDTO();
		maxMinRecordDTO.setStartFrom(startFrom);
		maxMinRecordDTO.setStartTo(startTo);
		return maxMinRecordDTO;
	}	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityListByQuery(java.lang.Class, java.lang.String, java.util.Map)
	 */
	public <T> List<T> findEntityListByQuery(Class<T> t, String queryString,
			Map<String, Object> parameters)throws ApplicationException{
			logger.trace("findEntityListByQuery(Class,String, Map<String, Object>) - Start");
			List<T> list = null;
			if(CommonUtils.isEmpty(queryString)){
				throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG);//Query should not be null or empty.
			}
			try{
			Query query = entityManager.createQuery(queryString);
			if(parameters != null && parameters.size() > 0){
				List<String> keys = new ArrayList<String>(parameters.keySet());
				for (String key : keys) {
					query.setParameter(key, parameters.get(key));
				}
			}
			list = query.getResultList();
			}catch(Exception exception){
				throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);//Persistence error.
			}
			logger.trace("findEntityListByQuery(Class,String, Map<String, Object>) - End");
		return list;
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#executeFunction(java.lang.String)
	 */
	public void executeFunction(String procedure)throws ApplicationException{
		logger.trace("executeFunction(String) - Start");
		try{
			Query query = entityManager.createNativeQuery("CALL " + procedure);
			query.getResultList();
		}catch (Exception exception){
			logger.error("executeFunction(String)", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("executeFunction(String) - End");
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#executeNativeQuery(java.lang.String)
	 */
	public void executeNativeQuery(String queryString)throws ApplicationException{
		logger.trace("executeNativeQuery(String) - Start");
		try{
			Query query = entityManager.createNativeQuery(queryString);
			query.executeUpdate();
		}catch(Exception exception){
			logger.error("query excution failed {}", queryString, exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("executeNativeQuery(String) - End");
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#insertOrUpdateByNamedQuery(java.lang.String, java.util.Map)
	 */
	public void insertOrUpdateByNamedQuery(String namedQuery,
			Map<String, Object> parameters)throws ApplicationException{
		logger.trace("insertOrUpdateByNamedQuery(String, Map<String,Object>) - Start");
		try{
			Query query = entityManager.createNamedQuery(namedQuery);
			if(parameters != null && parameters.size() > 0){
				for (String key : parameters.keySet()) {
					query.setParameter(key, parameters.get(key));
				}
				query.executeUpdate();
			}
		}catch (Exception exception){
			logger.error("insertOrUpdateByNamedQuery(String, Map<String,Object>)", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("insertOrUpdateByNamedQuery(String, Map<String,Object>) - End");
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#insertOrUpdateByNativeQuery(java.lang.String, java.util.Map)
	 */
	public void insertOrUpdateByNativeQuery(String namedQuery,
			Map<String, Object> parameters)throws ApplicationException{
		logger.trace("insertOrUpdateByNamedQuery(String, Map<String,Object>) - Start");
		try{
			Query query = entityManager.createNativeQuery(namedQuery);
			if(parameters != null && parameters.size() > 0){
				for (String key : parameters.keySet()) {
					query.setParameter(key, parameters.get(key));
				}
				query.executeUpdate();
			}
		}catch (Exception exception){
			logger.error("insertOrUpdateByNamedQuery(String, Map<String,Object>)", exception);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception);
		}
		logger.trace("insertOrUpdateByNamedQuery(String, Map<String,Object>) - End");
	}
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#deleteEntityBySid(java.lang.String, java.lang.String)
	 */
	public void deleteEntityBySid(String entityName, String sid)throws ApplicationException{
		logger.trace("deleteEntityBySid(Class, String) - Start");
		Integer id = null;
		entityManager.remove(getEntityBySid(entityName, sid));
		logger.trace("deleteEntityBySid(Class, String) - End");
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityListUsingNamedQueryByPagination(java.lang.String, java.util.Map, int, int)
	 */
	public  List findEntityListUsingNamedQueryByPagination(
			String queryString, Map<String, Object> parameters, int startLimit,
			int endLimit)throws ApplicationException{
		logger.trace("findEntityListUsingNamedQueryByPagination(String, Map<String, Object>, int, int) - Start");
		List list = null;
		Set<Map.Entry<String, Object>> rawParameters = null;
		if (queryString == null || queryString.isEmpty()) {
			logger.error("Error at findEntityListByNamedQuery - query name is empty");
			throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG);//Query name should not be null.
		}
		if (parameters != null) {
			rawParameters = parameters.entrySet();
		}
		Query query = entityManager.createNamedQuery(queryString);
		
		if(rawParameters != null){
			for (Map.Entry<String, Object> entry : rawParameters) {
				query.setParameter(entry.getKey(), entry.getValue());
			}
		}
		query.setFirstResult(startLimit);
		query.setMaxResults(endLimit);
		try {
			list = (List<T>) query.getResultList();
		} catch (NoResultException noResultException) {
			logger.error("Error at findEntityListByNamedQuery() -error is {} for query - {} with the start limit {} and end limit", 
					noResultException.getMessage(),queryString, startLimit, endLimit);
			throw new ApplicationException(ApplicationConstants.NO_RESULT, noResultException);
		}catch (Exception exception){
			logger.error("findEntityListByNamedQuery() -error is {}", exception.getMessage());
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, exception.getCause());
		}
		logger.trace("findEntityListUsingNamedQueryByPagination(String, Map<String, Object>, int, int) - End");
		return list;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityListByNativeQuery(java.lang.String, java.util.Map, java.lang.Class)
	 */
	public <T> List<T> findEntityListByNativeQuery(String queryString, Map<String, Object> parameters, Class<T> clazz)throws ApplicationException{
		
		List<T> result = null;
		Query query = entityManager.createNativeQuery(queryString, clazz);
		
		if(parameters != null){
			for (String entry : parameters.keySet()) {
				query.setParameter(entry, parameters.get(entry));
			}
		}
		result = query.getResultList();
		return result;
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityListByNativeQueryByPagination(java.lang.String, java.util.Map, java.lang.Class, int, int)
	 */
	public <T> List<T> findEntityListByNativeQueryByPagination(String queryString,
			Map<String, Object> parameters, Class<T> clazz, int startLimit,
			int endLimit)throws ApplicationException{
		logger.trace("findEntityListByNativeQueryByPagination(String, Map<String, Object>, int, int) - Start");
			List<T> result = null;
			Query query = entityManager.createNativeQuery(queryString, clazz);
			
			if(parameters != null){
				for (String entry : parameters.keySet()) {
					query.setParameter(entry, parameters.get(entry));
				}
			}
			query.setFirstResult(startLimit);
			query.setMaxResults(endLimit);
			result = query.getResultList();
			logger.trace("findEntityListByNativeQueryByPagination(String, Map<String, Object>, int, int) - End");
			return result;
		
	}
	
	
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#findEntityListSizeByNativeQuery(java.lang.String, java.util.Map, java.lang.Class)
	 */
	public <T> int findEntityListSizeByNativeQuery(String queryString, Map<String, Object> parameters, Class<T> clazz)throws ApplicationException{
		List<T> result = null;
		result = findEntityListByNativeQuery(queryString, parameters, clazz);
		return result.size();
	}
	/* (non-Javadoc)
	 * @see com.wisencrazy.restaraunt.datasource.IPersistenceService#getDtoListByEntity(java.lang.Class, java.lang.Class)
	 */
	public <T, U> List<U> getDtoListByEntity(Class<T> entityClass,Class<U> dtoClass) throws ApplicationException {return null;}
	
	
}
