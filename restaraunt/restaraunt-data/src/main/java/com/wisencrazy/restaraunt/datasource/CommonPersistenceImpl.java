package com.wisencrazy.restaraunt.datasource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dozer.mapper.DozerUtil;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.exception.ApplicationException;
public abstract class CommonPersistenceImpl extends	AbsPersistenceService<Serializable>{
	
	public CommonPersistenceImpl() throws ApplicationException {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Inject 
	protected DozerUtil mapper;
	
	
	private static final Logger logger = LoggerFactory.getLogger(CommonPersistenceImpl.class);
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public <T> T findDtoBySid(Class<T> dtoName, String entityName, String sid, String mapId)throws  ApplicationException {
		logger.trace("findDtoBySid(Class<T> dtoName, String entityName, String sid, String mapId) - Start");
		Object appuser = super.getEntityBySid(entityName, sid);
		logger.trace("findDtoBySid(Class<T> dtoName, String entityName, String sid, String mapId) - Start");
		return  (T)mapper.convert(appuser, dtoName, mapId);
	}
	
	public <T,U> List<U> getDtoListByNamedQuery(Class<T> entityClass, Class<U> dtoClass, 
			String queryName, Map<String, Object> parameters)throws ApplicationException{
		logger.trace("getDtoListByNamedQuery(Class,Class,String,Map<String,Object>) - Start");
		List<T> entities =null;
		List<U> dtos = null;
		entities = findEntityListByNamedQuery(queryName, parameters);
		if(entities == null || entities.size() == 0){
			throw new ApplicationException(ApplicationConstants.DOZER_MAP_EXP); //No result found exception.
		}
		dtos = mapper.convertList(entities, dtoClass);
		logger.trace("getDtoListByNamedQuery(Class,Class,String,Map<String,Object>) - End");

		return dtos;
	}
	
	
	public <T,U> List<U> getDtoListByNamedQueryByMap(Class<T> entityClass, Class<U> dtoClass, 
			String queryName, Map<String, Object> parameters, String mapId)throws ApplicationException{
		logger.trace("getDtoListByNamedQueryByMap(Class,Class,String,Map<String,Object>, String) - Start");
		List<T> entities =null;
		List<U> dtos = null;
		entities = findEntityListByNamedQuery(queryName, parameters);
		if(entities == null || entities.size() == 0){
			throw new ApplicationException(ApplicationConstants.NO_RESULT); //No result found exception.
		}
		dtos = mapper.convertList(entities, dtoClass, mapId);
		logger.trace("getDtoListByNamedQueryByMap(Class,Class,String,Map<String,Object>, String) - End");
		return dtos;
	}
	
	
	public <T, U> U getDtoByNamedQuery(Class<T> entityClass, Class<U> dtoClass,
			String namedQuery, Map<String, Object> parameters)
			throws ApplicationException {
		logger.trace("getDtoByNamedQuery(Class, Class, String, Map<String, Object>) - Start");
		T t = null;
		U dtoObject = null;
		t = (T) findSingleByNamedQuery(namedQuery, parameters);
		dtoObject = mapper.convert(t, dtoClass);
		logger.trace("getDtoByNamedQuery(Class, Class, String, Map<String, Object>) - End");
		return dtoObject;
	}
	
	
	public <T, U> U getDtoByNamedQueryByMap(Class<T> entityClass,
			Class<U> dtoClass, String namedQuery,
			Map<String, Object> parameters, String dozermap)
			throws ApplicationException {
		logger.trace("getDtoByNamedQueryByMap(Class<T>, Class<U>, String, Map<String,Object>, String) - Start");
		T t = null;
		U dtoObject = null;
		t = (T) findSingleByNamedQuery(namedQuery, parameters);
		dtoObject = mapper.convert(t, dtoClass, dozermap);
		logger.trace("getDtoByNamedQueryByMap(Class<T>, Class<U>, String, Map<String,Object>, String) - End");
		return dtoObject;
	}

	
	public String findSidById(String entityName, Integer id) throws ApplicationException {
		// TODO Auto-generated method stub
		return super.findSidById(entityName, id);
	}
	
	
	public <T, U> List<U> getDtoListByEntity(Class<T> entityClass,Class<U> dtoClass) throws ApplicationException {
		List<U> dtoList = null;
		try {
			List<T> entityList = findEntityList(entityClass);
			if (entityList == null && entityList.size() == 0) {
				throw new ApplicationException(ApplicationConstants.NO_RESULT);

			}
			dtoList = mapper.convertList(entityList, dtoClass);
		}catch(ApplicationException a){
		      throw a;	
		}catch (Exception e) {
			logger.error("While getting the dto list, throwing exception",e);
		}
		return dtoList;
	}
		
}

