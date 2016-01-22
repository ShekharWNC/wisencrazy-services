package com.wisencrazy.restaraunt.services;

import java.util.List;

import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.dto.AreaDTO;
import com.dto.CityDTO;
import com.dto.CustomerDTO;
import com.dto.CustomerSignupDTO;
import com.dto.RestarauntDTO;
import com.dto.RestarauntLocationViewDTO;
import com.dto.StateDTO;
import com.dto.constants.EnumConstants.SignupType;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.DuplicateEntryException;
import com.wisencrazy.common.exception.IncorrectArgumentException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.Area;
import com.wisencrazy.restaraunt.datasource.entities.entity.City;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.Restaraunt;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer.CustomerAccountStatus;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.Timings;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntLocationView;
import com.wisencrazy.restaraunt.datasource.entities.entity.State;
import com.wisencrazy.restaraunt.rest.dto.GoogleLocationInput;

public class RestarauntManage {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(RestarauntManage.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
	
	public RestarauntManage(){
		try {
			logger.debug("Setting up profile");
			commonRepoServ=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
		} catch (ApplicationException e) {
			logger.error("Error while setting up Repo services");
			e.printStackTrace();
		}		
	}

	public boolean createRestaraunt(RestarauntDTO restarauntDTO) throws ApplicationException{
		Restaraunt restaraunt=dozerUtil.convert(restarauntDTO, Restaraunt.class);
		Area area=commonRepoServ.getEntityBySid(Area.class, restarauntDTO.getArea().getSid());
		restaraunt.generateUuid();
		restaraunt.setArea(area);
		logger.debug("Saving Retaraunt: {}",JsonUtils.toJson(restaraunt));
		commonRepoServ.save(restaraunt);
		return false;
	}
}
