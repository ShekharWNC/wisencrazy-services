package com.dto.persistence;


public interface IDtoPersistence{
	public Integer findIdBySid(String parameter, String sid)throws Exception;
	
	public <T> T getEntityBySid(String entity, String sid) throws Exception;
}
