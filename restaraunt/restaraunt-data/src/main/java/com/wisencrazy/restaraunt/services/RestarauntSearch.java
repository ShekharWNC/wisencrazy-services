package com.wisencrazy.restaraunt.services;

import java.util.List;

import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.dto.AreaDTO;
import com.dto.CityDTO;
import com.dto.CustomerDTO;
import com.dto.CustomerSignupDTO;
import com.dto.StateDTO;
import com.dto.constants.EnumConstants.SignupType;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.DuplicateEntryException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.Area;
import com.wisencrazy.restaraunt.datasource.entities.entity.City;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer.CustomerAccountStatus;
import com.wisencrazy.restaraunt.datasource.entities.entity.State;

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
			e.printStackTrace();
			logger.error("Error while setting up Repo services");
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
			List<CityDTO> cities=commonRepoServ.getDtoListByNamedQuery(City.class, CityDTO.class, City.FIND_CITY_BY_STATE_NAME, QueryParameter.with("stateName", stateName).parameters());
			return cities;
		} catch (ApplicationException e) {
			logger.error("Error while fethching cities for state: {}",e);
			throw e;
		}
	}
	
	
	
}
