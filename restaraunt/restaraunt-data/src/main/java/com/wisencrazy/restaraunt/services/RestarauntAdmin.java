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

public class RestarauntAdmin {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(RestarauntAdmin.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
		
}
