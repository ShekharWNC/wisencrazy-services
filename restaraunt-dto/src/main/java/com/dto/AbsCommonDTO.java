package com.dto;
import java.io.Serializable;

import javax.naming.InitialContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dto.persistence.IDtoPersistence;
import com.dto.utils.DtoMappingUtils;

// TODO: Auto-generated Javadoc

/**
 * The Class AbsUUID.
 */
public abstract class AbsCommonDTO extends AbstractCommonDTO implements Serializable {
	
	private static final Logger logger = LoggerFactory.getLogger(AbsCommonDTO.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3180384114708349674L;

	/** The id. */
	public Integer id;

	public AbsCommonDTO(){
		try {
			if (dtoPersistence == null) {
				Object obj = new InitialContext().lookup("java:global/repositoryservice/repositoryservice-ejb/DtoPersistenceImpl!com.dto.persistence.IDtoPersistence");
				if(obj instanceof IDtoPersistence){
					dtoPersistence = (com.dto.persistence.IDtoPersistence) obj;
				}
			}
		} catch (Exception e) {
			logger.error("Error at AbsCommonDTO - {} is {}", this.getClass().getSimpleName(),e.getMessage());
		}
	}
	
	public Integer populateIdBySid(){
		Integer id = null;
		try {
			if(sid != null && !sid.isEmpty()){
				id = dtoPersistence.findIdBySid(DtoMappingUtils.getInstance().getEntityClass(this.getClass().getSimpleName()), sid);
			}
		} catch (Exception e) {
			logger.error("Error at populateIdBySid - {} is {}", this.getClass().getSimpleName(),e.getMessage());
		}
		return id;
	}
	
	public Integer populateIdByEntityNameAndSid(String entityClassName){
		Integer id = null;
		try {
			if(sid != null && !sid.isEmpty()){
				id = dtoPersistence.findIdBySid(entityClassName, sid);
			}
		} catch (Exception exception) {
			
		}
		return id;
	}
	
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
