package com.dto.utils;

import java.io.IOException;
import java.util.Properties;

public class DtoMappingUtils {
	
	private static Properties properties;
	
	private static DtoMappingUtils dtoMappingUtils; 
	
	private DtoMappingUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static DtoMappingUtils getInstance(){
		if(dtoMappingUtils == null){
			dtoMappingUtils = new DtoMappingUtils();
		}
		return dtoMappingUtils;
	}
	
	private Properties getProperties(){
		if(properties == null){
			properties = new Properties();
			try {
				properties.load(DtoMappingUtils.class.getClassLoader().getResourceAsStream("dtoentitymapping.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties;
	}
	
	public String getEntityClass(String dtoName){
		if(dtoName != null && !dtoName.isEmpty()){
			if(getProperties().containsKey(dtoName)){
				return getProperties().getProperty(dtoName);
			}
		}
		return dtoName.replace("DTO", "");
	}

}
