package com.wisencrazy.restaraunt.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.dto.AreaDTO;
import com.dto.CityDTO;
import com.dto.RestarauntDTO;
import com.dto.RestarauntHasReviewsDTO;
import com.dto.RestarauntHasReviewsInput;
import com.dto.RestarauntLocationViewDTO;
import com.dto.StateDTO;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.IncorrectArgumentException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.Area;
import com.wisencrazy.restaraunt.datasource.entities.entity.City;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.Restaraunt;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasReviews;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasReviewsPK;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.Timings;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntLocationView;
import com.wisencrazy.restaraunt.datasource.entities.entity.State;
import com.wisencrazy.restaraunt.rest.dto.GoogleLocationInput;
import com.wisencrazy.restaraunt.rest.dto.ManualLocationInput;

public class RestarauntSearch {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(RestarauntSearch.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
	
	public RestarauntSearch(){
		try {
			logger.debug("Setting up profile");
			commonRepoServ=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
		} catch (ApplicationException e) {
			logger.error("Error while setting up Repo services");
			e.printStackTrace();
		}		
	}

	public List<StateDTO> getStates() throws ApplicationException{
		try {
			List<StateDTO> states=commonRepoServ.getDtoListByNamedQuery(State.class, StateDTO.class, State.FIND_STATE_BY_COUNTRY_ID	, QueryParameter.with("id", 1).parameters());
			return states;
		} catch (ApplicationException e) {
			logger.error("Error while fethching States: {}",e);
			throw e;
		}
	}

	public List<AreaDTO> getAreaByCitySid(String citySid) throws ApplicationException{
		logger.debug("Fetching Area by City: {}",citySid);
		try {
			List<AreaDTO> areas=commonRepoServ.getDtoListByNamedQuery(Area.class, AreaDTO.class, Area.FIND_AREA_BY_CITY_SID, QueryParameter.with("citySid", citySid).parameters());
			return areas;
		} catch (ApplicationException e) {
			logger.error("Error while fethching States: {}",e);
			throw e;
		}
	}
	
	public List<CityDTO> getCityByStateName(String stateName) throws ApplicationException{
		logger.debug("Fetching Cities for StateName {}",stateName);
		try {
			List<CityDTO> cities=commonRepoServ.getDtoListByNamedQuery(City.class, CityDTO.class, City.FIND_CITY_BY_STATE_NAME, QueryParameter.with("stateName", stateName.trim()).parameters());
			return cities;
		} catch (ApplicationException e) {
			logger.error("Error while fethching cities for state: {}",e);
			throw e;
		}
	}
	
	public List<RestarauntLocationViewDTO> searchRestarauntNearBy(GoogleLocationInput input) throws IncorrectArgumentException,ApplicationException{
		if(input==null)throw new IncorrectArgumentException("Null Search parameter passed for nearby Search");
		if(CommonUtils.isEmpty(input.getLatitude()) || CommonUtils.isEmpty(input.getLongitude()) || CommonUtils.isEmpty(input.getDistance()) || CommonUtils.isEmpty(input.getTimings()))
			throw new IncorrectArgumentException("Invalid Search parameters passed for nearby Search");
		Timings timings=null;
		try{
			timings=Enum.valueOf(Timings.class, input.getTimings());				
		}catch(Exception e){
			throw new IncorrectArgumentException("Invalid value for Timing search passed must be BR,LU,DI");
		}
		try{
			List<RestarauntLocationView> restaraunts=commonRepoServ.findEntityListByNativeQuery(RestarauntLocationView.FIND_RESTRO_BY_DISTANCE, QueryParameter.with("latitude", input.getLatitude()).and("longitude", input.getLongitude()).and("timing", timings.name()).and("distance", input.getDistance()).parameters(), RestarauntLocationView.class);
			List<RestarauntLocationViewDTO> restarauntsDTO=dozerUtil.convertList(restaraunts, RestarauntLocationViewDTO.class);
			return restarauntsDTO;
		} catch (ApplicationException e) {
			logger.error("Error while fethching cities for state: {}",e);
			throw e;
		}
			
	}

	public List<RestarauntLocationViewDTO> searchRestarauntNearBy(ManualLocationInput input) throws IncorrectArgumentException,ApplicationException{
		if(input==null)throw new IncorrectArgumentException("Null Search parameter passed for nearby Search");
		if(CommonUtils.isEmpty(input.getAreaSid()) || CommonUtils.isEmpty(input.getTimings()))
			throw new IncorrectArgumentException("Invalid Search parameters passed for nearby Search");
		Timings timings=null;
		try{
			timings=Enum.valueOf(Timings.class, input.getTimings());				
		}catch(Exception e){
			throw new IncorrectArgumentException("Invalid value for Timing search passed must be BR,LU,DI");
		}
		try{
			List<RestarauntLocationViewDTO> restarauntsDTO=commonRepoServ.getDtoListByNamedQuery(RestarauntLocationView.class, RestarauntLocationViewDTO.class, RestarauntLocationView.FIND_BY_AREA_SID, QueryParameter.with("areaSid", input.getAreaSid()).and("timing", timings).parameters());
			return restarauntsDTO;
		} catch (ApplicationException e) {
			logger.error("Error while fethching cities for state: {}",e);
			throw e;
		}
			
	}

	public List<RestarauntHasReviewsDTO> searchpageRestarauntReview(List<RestarauntDTO> restarauntDTOs) throws IncorrectArgumentException{
		if(restarauntDTOs==null)throw new IncorrectArgumentException("Null search parameter passed");
		List<RestarauntHasReviewsDTO> restarauntReviews = new ArrayList<RestarauntHasReviewsDTO>();
		for(RestarauntDTO restarauntDTO:restarauntDTOs){
			if(!CommonUtils.isEmpty(restarauntDTO.getSid())){
				RestarauntHasReviewsDTO dto=new RestarauntHasReviewsDTO();
				//Fetch the average rating
				BigDecimal avgRating = null;
				BigInteger countRating=null;
				logger.debug("Finding Average Rating for restarauntSid: {}",restarauntDTO.getSid());
				try{
					Query avgQuery=commonRepoServ.getEntityManager().createNativeQuery(RestarauntHasReviews.FIND_RESTARAUNT_AVERAGE_RATING);
					avgQuery.setParameter("restroSid", restarauntDTO.getSid());
					Object[] result=(Object[]) avgQuery.getSingleResult();
					logger.debug("Avg Count : {}",JsonUtils.toJson(result));
					avgRating=(BigDecimal)result[0];
					countRating= (BigInteger) result[1];
					dto.setRating(avgRating.intValue());
					dto.setRatingCount(countRating.intValue());
				}catch(Exception e){
					logger.error("Error while fetching Average rating for restroSid : {}, {}",restarauntDTO.getSid(),e);					
				}
				//fetch the last review informarion
				RestarauntHasReviewsDTO hasReviewsDTO = null;
				try {
					hasReviewsDTO = commonRepoServ.getDtoListByNamedQuery(RestarauntHasReviews.class, RestarauntHasReviewsDTO.class, RestarauntHasReviews.FIND_LAST_REVIEW_RESTARAUNT, QueryParameter.with("restroSid", restarauntDTO.getSid()).parameters()).get(0);
				} catch (ApplicationException e) {
					logger.error("Error while fetching Last Review for restroSid : {}, {}",restarauntDTO.getSid(),e);
				}
				if(hasReviewsDTO!=null){
					hasReviewsDTO.setRating(avgRating.intValue());
					hasReviewsDTO.setRatingCount(countRating.intValue());
					restarauntReviews.add(hasReviewsDTO);
					dto=null;
				}else
					restarauntReviews.add(dto);
				
			}
			return restarauntReviews;
		}
		return restarauntReviews;
	}
	
	public boolean submitReview(RestarauntHasReviewsDTO restarauntHasReviewsDTO) throws IncorrectArgumentException,ApplicationException,Exception{
		logger.debug("Submitting review for DTO: {}",JsonUtils.toJson(restarauntHasReviewsDTO));
		if(restarauntHasReviewsDTO==null || CommonUtils.isEmpty(restarauntHasReviewsDTO.getCustomer().getSid()) || CommonUtils.isEmpty(restarauntHasReviewsDTO.getRestarauntSid()) || restarauntHasReviewsDTO.getRating()<=0 || restarauntHasReviewsDTO.getRating()>5)
			throw new IncorrectArgumentException("Illegal Review being submitted");
		logger.debug("Fetching Restaraunt Id By Sid: {}",restarauntHasReviewsDTO.getRestarauntSid());
		Integer restroId=0;
		try {
			restroId=commonRepoServ.findIdBySid(Restaraunt.class.getName(), restarauntHasReviewsDTO.getRestarauntSid());
		} catch (Exception e) {
			logger.error("Error while getting ID for restarauntSid : {} {}",restarauntHasReviewsDTO.getRestarauntSid(),e);
			e.printStackTrace();
			throw e;
		}
		logger.debug("Fetching Customer Id by Sid : {}",restarauntHasReviewsDTO.getCustomer());
		Integer customerId=0;
		try {
			customerId=commonRepoServ.findIdBySid(Customer.class.getName(), restarauntHasReviewsDTO.getCustomer().getSid());
		} catch (Exception e) {
			logger.error("Error while getting ID for customerSid : {} {}",restarauntHasReviewsDTO.getCustomer().getSid(),e);
			e.printStackTrace();
			throw e;
		}
		logger.debug("preparing the review entity");
		RestarauntHasReviews hasReviews=dozerUtil.convert(restarauntHasReviewsDTO, RestarauntHasReviews.class);
		hasReviews.setReviewsPK(new RestarauntHasReviewsPK(restroId,customerId));
		hasReviews.setCustomer(null);
		if(hasReviews.getTimestamp()==null)hasReviews.setTimestamp(new Timestamp(new Date().getTime()));
		logger.debug("Saving the review Entity: {}",JsonUtils.toJson(hasReviews));
		try {
			commonRepoServ.save(hasReviews);
		} catch (ApplicationException e) {
			logger.error("Error while saving review: {}",e);
			e.printStackTrace();
			throw e;
		}
		logger.debug("Review submitted successfully:");
		return true;
		
	}
	
	public List<RestarauntHasReviewsDTO> getRestarauntReviews(String restarauntSid,RestarauntHasReviewsInput input) throws ApplicationException{
		logger.debug("Getting review for restaraunt: {} with input info {}",restarauntSid,JsonUtils.toJson(input));
		if(CommonUtils.isEmpty(restarauntSid) || input==null || input.getLimit()<=0 || input.getTimestamp()==null)throw new IncorrectArgumentException("Invalid search input");
		QueryParameter parameter=QueryParameter.with("restroSid", restarauntSid);
		parameter.and("timestamp", input.getTimestamp());
		return commonRepoServ.getDtoListByNamedQueryWithLimits(RestarauntHasReviews.class, RestarauntHasReviewsDTO.class, RestarauntHasReviews.FIND_REVIEWS_RESTARAUNT, parameter.parameters(), input.getLimit());
	}
	
}
