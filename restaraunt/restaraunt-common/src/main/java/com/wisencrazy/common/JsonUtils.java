package com.wisencrazy.common;


import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class JsonUtils {
	private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

	private static final ObjectMapper jsonMapper = new ObjectMapper();
	
	public static String toJson(Object object) {
		try {
			return jsonMapper.writeValueAsString(object);
		}
		catch (Exception e) {
			return null;
		}
	}

	public static <T> T fromJson(String json, Class<T> clazz) {
		try {
			return jsonMapper.readValue(json, clazz);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static <T> T convertMapToObject(Object objToConvert,Class<T> returnType){
		String strMapJson=new Gson().toJson(objToConvert);
		return fromJson(strMapJson, returnType);
	}
	
	public static Map<String, Object> convertObjectToMap(Object src){
		Gson myGson = new Gson();
		JsonObject jsonObject = (JsonObject) myGson.toJsonTree(src);
    	
        Type type = new TypeToken<Map<String, Object>>() {}.getType();

		return myGson.fromJson(jsonObject.getAsJsonObject(), type);
	}
	public static Map<String, Object> convertStringToMap(String jsonString){
		if(!CommonUtils.isEmpty(jsonString)){
			Type type = new TypeToken<Map<String, Object>>(){}.getType();
			return new Gson().fromJson(jsonString, type);
		}
		return null;
	}

	public static <T> List<T> convertObjectToList(JsonObject jsonObject, T type) {
		List<T> objects = null;
		if(jsonObject != null){
			Gson gson = new Gson();
			objects = gson.fromJson(jsonObject, new TypeToken<List<T>>(){}.getType());
		}
		return objects;
	}

	
}
