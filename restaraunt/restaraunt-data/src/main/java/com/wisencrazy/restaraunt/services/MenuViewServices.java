package com.wisencrazy.restaraunt.services;

import java.util.List;

import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.dto.ItemCategoryDTO;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.IncorrectArgumentException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.ItemCategory;

public class MenuViewServices {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(MenuViewServices.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
	public MenuViewServices(){
		try {
			logger.debug("Setting up profile");
			commonRepoServ=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
		} catch (ApplicationException e) {
			logger.error("Error while setting up Repo services");
			e.printStackTrace();
		}		
	}

	public List<ItemCategoryDTO> getAllItemsForRestaraunt(String restarauntSid) throws ApplicationException{
		logger.debug("Finding all items for restoSid: {}",restarauntSid);
		if(CommonUtils.isEmpty(restarauntSid))throw new IncorrectArgumentException("Invalid RestarauntSid passed");
		List<ItemCategoryDTO> items=commonRepoServ.getDtoListByNamedQuery(ItemCategory.class, ItemCategoryDTO.class, ItemCategory.FIND_BY_RESTRO_SID, QueryParameter.with("sid", restarauntSid).parameters());
		return items;
	}
	
}
