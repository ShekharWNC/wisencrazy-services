package com.dozer.mapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.dozer.CustomConverter;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.dozer.converter.EntityByteArrayToSid;
import com.dozer.converter.EnumToStringConverter;
import com.dozer.converter.SqlDateToStringConverter;
import com.dozer.converter.StringToTimestampConverter;
import com.dozer.converter.TimeStampToStringDateConverter;
import com.dozer.converter.TimestampToStringConverter;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.DateUtils;
import com.wisencrazy.common.exception.ApplicationException;

@Singleton
@Startup
public class DozerUtil {
	private final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

	@Inject
	DateUtils dateUtils;
	
	@Produces @DozerMapper
	public Mapper getDozerBeanMapper(){
		return dozerBeanMapper;
	}
	
	@PostConstruct
	public void init(){
		List<String> mappingList = new ArrayList<String>();
		mappingList.add("dozerBeanMapping.xml");
		mappingList.add("common.xml");
		mappingList.add("userHasInvitation.xml");
		mappingList.add("company.xml");
		mappingList.add("notification.xml");
		mappingList.add("providerBusiness.xml");
		mappingList.add("user.xml");
		mappingList.add("clientBusiness.xml");
		mappingList.add("provider.xml");
		mappingList.add("userinfo.xml");
		mappingList.add("consultantProfile.xml");
		mappingList.add("attachmentType.xml");
		mappingList.add("attachment.xml");
		mappingList.add("usercontact.xml");
		mappingList.add("basicInfoview.xml");
		mappingList.add("registerphonenumber.xml");
		mappingList.add("commondto.xml");
		mappingList.add("category.xml");
		mappingList.add("subcategory.xml");
		mappingList.add("item.xml");
		mappingList.add("kotdto.xml");
		mappingList.add("invoice.xml");
		mappingList.add("orders.xml");
		dozerBeanMapper.setMappingFiles(mappingList);
		Map<String, CustomConverter> customConverters = new HashMap<String, CustomConverter>();
		setCustomConverters(customConverters);
		dozerBeanMapper.setCustomConvertersWithId(customConverters);
	}
	
	private void setCustomConverters(Map<String, CustomConverter> customConverters) {
		customConverters.put("timestamptostringconv", new TimestampToStringConverter(dateUtils));
        customConverters.put("stringtotimestampconv", new StringToTimestampConverter(dateUtils));
        customConverters.put("entitytosid", new EntityByteArrayToSid());
        customConverters.put("sqldatetostringconv", new SqlDateToStringConverter(dateUtils));
        customConverters.put("enumtostring", new EnumToStringConverter());
        customConverters.put("customdateconverter", new TimeStampToStringDateConverter(dateUtils));
	}
	
	@Inject
	@DozerMapper
	Mapper mapper;
	
	public <T> T convert(Object srcObject, Class<T> destnationObj) throws ApplicationException{
		try{
		     return (T) mapper.map(srcObject, destnationObj);
		}catch(Exception exception){
			exception.printStackTrace();
			throw new ApplicationException(ApplicationConstants.DOZER_MAP_EXP, exception);
		}
		//return  convert(srcObject,destnationObj,null);
	}
	public <T> T convert(Object srcObject, Class<T> destnationObj,String mapId) throws ApplicationException{
		try{
			return (T) mapper.map(srcObject, destnationObj, mapId);
		}catch(Exception exception){
			throw new ApplicationException(ApplicationConstants.DOZER_MAP_EXP, exception);
		}
	}
	
	public <T> T convert(Object srcObject, T destObject)throws ApplicationException{
		try {
			mapper.map(srcObject, destObject);
		} catch (Exception exception) {
			throw new ApplicationException(ApplicationConstants.DOZER_MAP_EXP, exception);
		}
		return destObject;
	}
	
	public <T, U> List<T> convertList(List<U> srcObjects, Class<T> destnationObjClass) throws ApplicationException {
		return convertList(srcObjects,destnationObjClass,null);
	}

	public <T, U> List<T> convertList(List<U> srcObjects, Class<T> destnationObjClass,String mapId)
			throws ApplicationException {
		List<T> list = null;
		try {
			if (srcObjects != null) {
				list = new ArrayList<T>();
				if (mapId == null) {
					for (U srcObject : srcObjects) {
						list.add(convert(srcObject, destnationObjClass));
					}
				} else {
					for (U srcObject : srcObjects) {
						list.add(convert(srcObject, destnationObjClass, mapId));
					}
				}
			} else {
				throw new ApplicationException(ApplicationConstants.DOZER_MAP_EXP);
			}
		} catch (ApplicationException applicationException) {
			throw applicationException;
		} catch (Exception e) {
			throw new ApplicationException(ApplicationConstants.DOZER_MAP_EXP);
		}
		return list;
	}
}

