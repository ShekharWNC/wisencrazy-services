package com.dozer.mapper;
import java.io.Serializable;
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

import com.common.exception.ApplicationException;
import com.common.utils.ApplicationConstants;
import com.common.utils.DateUtils;
import com.dozer.converter.CommonIdConverter;
import com.dozer.converter.CompanyConverter;
import com.dozer.converter.EntityByteArrayToSid;
import com.dozer.converter.EnumToStringConverter;
import com.dozer.converter.SqlDateToStringConverter;
import com.dozer.converter.StringToTimestampConverter;
import com.dozer.converter.TimeStampToStringDateConverter;
import com.dozer.converter.TimestampToStringConverter;
import com.dozer.converter.UserConverter;
import com.dozer.converter.VirtualAccountConverter;
import com.dozer.producerutils.EJBDozerProducerBean;
import com.repositoryservice.persistenceservice.IPersistenceService;

@Singleton
@Startup
public class DozerUtil {
	private final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
	@Inject @EJBDozerProducerBean
//	@EJB(lookup = "java:global/repositoryservice/repositoryservice-common/PersistenceServiceImpl!com.repositoryservice.persistenceservice.IPersistenceService")
	IPersistenceService<Serializable> persistenceService;
	
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
		mappingList.add("directoryprojectuserList.xml");
		mappingList.add("common.xml");
		mappingList.add("directoryprojectgroupList.xml");
		mappingList.add("userHasInvitation.xml");
		mappingList.add("company.xml");
		mappingList.add("notification.xml");
		mappingList.add("providerBusiness.xml");
		mappingList.add("user.xml");
		mappingList.add("clientBusiness.xml");
		mappingList.add("provider.xml");
		mappingList.add("skill.xml");
		mappingList.add("userHasSkill.xml");
		mappingList.add("employeeProfile.xml");
		mappingList.add("virtualAccount.xml");
		mappingList.add("userinfo.xml");
		mappingList.add("consultantProfile.xml");
		mappingList.add("attachmentType.xml");
		mappingList.add("attachment.xml");
		mappingList.add("event.xml");
		mappingList.add("projectScheduleHasShift.xml");
		mappingList.add("projectSchedule.xml");
		mappingList.add("project.xml");
		mappingList.add("calendar.xml");
		mappingList.add("companyName.xml");
		mappingList.add("directoryList.xml");
		mappingList.add("companybygroup.xml");
		mappingList.add("calendarHasEvent.xml");
		mappingList.add("userHasCalendar.xml");
		mappingList.add("customerProfile.xml");
		mappingList.add("usercontact.xml");
		mappingList.add("caseHasAttachmentView.xml");
		mappingList.add("customerBusinessProfilePrimaryContact.xml");
		mappingList.add("basicInfoview.xml");
		mappingList.add("customerview.xml");
		mappingList.add("customerbusinessview.xml");
		mappingList.add("customer.xml");
		mappingList.add("customerBusiness.xml");
		mappingList.add("agentbygroup.xml");
		mappingList.add("appuserHasSkill.xml");
		mappingList.add("companyrole.xml");
		mappingList.add("adminview.xml");
		mappingList.add("businessHours.xml");
		mappingList.add("userGroup.xml");
		mappingList.add("projectgroup.xml");
		mappingList.add("caseview.xml");
		mappingList.add("securityGeneralNotification.xml");
		mappingList.add("securityNotificationSend.xml");
		mappingList.add("routingRule.xml");
		mappingList.add("routingRulesGroup.xml");
		mappingList.add("audioclipLibrary.xml");
		mappingList.add("companyuser.xml");
		mappingList.add("template.xml");
		mappingList.add("adminprojectgroup.xml");
		mappingList.add("twilioSupportCountry.xml");
		mappingList.add("registerphonenumber.xml");
		mappingList.add("vWRegisteredPhoneNoHasIvrMenu.xml");
		mappingList.add("channel.xml");
		mappingList.add("commondto.xml");
		mappingList.add("usereventplaceholder.xml");
		mappingList.add("knowledgebase.xml");
		mappingList.add("category.xml");
		mappingList.add("templatecontent.xml");
		mappingList.add("knowledgebasehasarticle.xml");
		mappingList.add("subcategory.xml");
		mappingList.add("virtualaccounthasskill.xml");
		mappingList.add("projectrole.xml");
		mappingList.add("caseviewrule.xml");
		mappingList.add("directorycusotmerview.xml");
		mappingList.add("directorycusotmerbusinessview.xml");
		mappingList.add("companyprojectuser.xml");
		mappingList.add("projectuserview.xml");
		mappingList.add("agentactivity.xml");
		mappingList.add("visualConnect.xml");
		mappingList.add("appSetting.xml");
		mappingList.add("companyHasPrinter.xml");
		mappingList.add("notificationGroup.xml");
		mappingList.add("notificationGroupMembers.xml");
		mappingList.add("item.xml");
		mappingList.add("kotdto.xml");
		mappingList.add("invoice.xml");
		mappingList.add("orders.xml");
//		mappingList.add("projectcustomerchatassociationhistory.xml");
		dozerBeanMapper.setMappingFiles(mappingList);
		Map<String, CustomConverter> customConverters = new HashMap<String, CustomConverter>();
		/*customConverters.put("virtualaccount", virtualAccountConverter);
		customConverters.put("userconv", userConverter);
		customConverters.put("companyconv", companyConverter);
		customConverters.put("timestamptostringconv", timestampToStringConverter);
        customConverters.put("stringtotimestampconv", stringToTimestampConverter);
        customConverters.put("commonidconv", commonIdConverter);*/
		setCustomConverters(customConverters);
		dozerBeanMapper.setCustomConvertersWithId(customConverters);
//		return dozerBeanMapper;
	}
	
	private void setCustomConverters(Map<String, CustomConverter> customConverters) {
		customConverters.put("virtualaccount", new VirtualAccountConverter(persistenceService));
		customConverters.put("userconv", new UserConverter(persistenceService));
		customConverters.put("companyconv", new CompanyConverter(persistenceService));
		customConverters.put("timestamptostringconv", new TimestampToStringConverter(dateUtils));
        customConverters.put("stringtotimestampconv", new StringToTimestampConverter(dateUtils));
        customConverters.put("commonidconv", new CommonIdConverter(persistenceService));
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
			throw new ApplicationException(ApplicationConstants.ES_AM_PR_R_017, exception);
		}
		//return  convert(srcObject,destnationObj,null);
	}
	public <T> T convert(Object srcObject, Class<T> destnationObj,String mapId) throws ApplicationException{
		try{
			return (T) mapper.map(srcObject, destnationObj, mapId);
		}catch(Exception exception){
			throw new ApplicationException(ApplicationConstants.ES_AM_PR_R_017, exception);
		}
	}
	
	public <T> T convert(Object srcObject, T destObject)throws ApplicationException{
		try {
			mapper.map(srcObject, destObject);
		} catch (Exception exception) {
			throw new ApplicationException(ApplicationConstants.ES_AM_PR_R_017, exception);
		}
		return destObject;
	}
	
	/**
	 * A generic method to convert list of srcObject to list of destObject
	 * 
	 * @param srcObjects
	 *            - List of object to be converted.
	 * @param destnationObjClass
	 *            -class of destinationObject for conversion.
	 * @return List of destnationObj
	 * @throws ApplicationException
	 */
	public <T, U> List<T> convertList(List<U> srcObjects, Class<T> destnationObjClass) throws ApplicationException {
		return convertList(srcObjects,destnationObjClass,null);
	}

	/**
	 * A generic method to convert list of srcObject to list of destObject by
	 * using dozer-mapper ID.
	 * 
	 * @param srcObjects
	 *            - List of object to be converted.
	 * @param destnationObjClass
	 *            -class of destinationObject for conversion.
	 * @param mapId
	 *            - Dozer map Id for conversion.
	 * @return List of destnationObj
	 * @throws ApplicationException
	 */
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
				throw new ApplicationException(ApplicationConstants.ES_AM_PR_R_026);//List of object to be converted is null.
			}
		} catch (ApplicationException applicationException) {
			throw applicationException;
		} catch (Exception e) {
			throw new ApplicationException(ApplicationConstants.ES_AM_PR_R_027);//Error when converting a list in dozer service.
		}
		return list;
	}
}

