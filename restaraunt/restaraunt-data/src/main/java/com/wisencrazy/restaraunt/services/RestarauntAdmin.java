package com.wisencrazy.restaraunt.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityTransaction;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.DuplicateEntryException;
import com.wisencrazy.common.exception.IncorrectArgumentException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.Area;
import com.wisencrazy.restaraunt.datasource.entities.entity.City;
import com.wisencrazy.restaraunt.datasource.entities.entity.Item;
import com.wisencrazy.restaraunt.datasource.entities.entity.ItemCategory;
import com.wisencrazy.restaraunt.datasource.entities.entity.Restaraunt;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimingsPK;
import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.Timings;

public class RestarauntAdmin {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(RestarauntAdmin.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
	private Map<String, String> mapRestroSids;
	
	private Map<String, String> mapICSids;
	
	public RestarauntAdmin(){
		try {
			logger.debug("Setting up profile");
			commonRepoServ=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
			mapRestroSids=new HashMap<String, String>();
			mapICSids=new HashMap<String, String>();
		} catch (ApplicationException e) {
			logger.error("Error while setting up Repo services");
			e.printStackTrace();
		}		
	}
	
	public boolean addAreas(String filePath) throws IOException, IncorrectArgumentException{
		
		for(int i=0;i<getTotalNumberOfSheetInWorkbook(filePath);i++){
			Sheet sheet=getSheetObject(filePath, i);
			logger.debug("Processing Sheet : {}",sheet.getSheetName());
			//check if the sheet is null
			if(sheet==null)
				throw new IncorrectArgumentException();
			int rowCount=getLastNumberOfPhisycalRowFromSheet(sheet);
			logger.debug("RowCount : {}",rowCount);
			//Ignoring the first row as it the header
			for(int r=2;r<=rowCount;r++){
				logger.debug("Processing rowNum: {}",r);
				//iterate thru the rows and prepare the list of data				
				Row row=sheet.getRow(r);
				if(row==null)continue;
				Area area=new Area();
				area.setAreaName(row.getCell(0).getStringCellValue());
				Double cityId=row.getCell(1).getNumericCellValue();
				logger.debug("Finding City by ID {} for area ",cityId.intValue());
				City city=null;
				try {
					city = (City) commonRepoServ.findEntityById(City.class, cityId.intValue());
					logger.debug("Found City ID {} for area ",cityId.intValue());
				} catch (ApplicationException e) {
					logger.error("Error while fetching city by id : {}",cityId);
					logger.warn("Ignoring area for : {} in row number {}",area.getAreaName(),r+1);
					continue;
				}
				area.setCity(city);
				area.generateUuid();
				logger.info("Saving Area : {}",JsonUtils.toJson(area));
				try {
					commonRepoServ.save(area);
					logger.debug("Area ID: {}",area.getId());
				} catch (DuplicateEntryException e) {
					logger.error("Error while saving area {}",area.getAreaName());
					logger.warn("Ignoring area for : {} in row number {}",area.getAreaName(),r+1);
					continue;
				} catch (ApplicationException e) {
					logger.error("Error while saving area {}",area.getAreaName());
					logger.warn("Ignoring area for : {} in row number {}",area.getAreaName(),r+1);
					continue;
				}
			}
		}
		return true;
	}
	

	public boolean importRestarauntData(String fileName) throws IncorrectArgumentException, IOException{
		
		//loop thru the sheets
		for(int i=0;i<getTotalNumberOfSheetInWorkbook(fileName);i++){
			Sheet sheet=getSheetObject(fileName, i);
			logger.debug("Processing Sheet : {}",sheet.getSheetName());
			//check if the sheet is null
			if(sheet==null)
				throw new IncorrectArgumentException();
			switch (i) {
			case 0:
				//process restaraunts
				addRestaraunts(sheet);
				break;
			case 1:
				//process restaraunt timings
				addRestroTimings(sheet);
				break;	
			case 2:
				//process restaraunt item category
				addItemCategory(sheet);
				break;
			case 3:
				//process restaraunt items
				addItemsForCategory(sheet);
				break;	
			default:

				break;
			}
			
		}
		return true;		
	}
	
	private void addRestaraunts(Sheet restroSheet){
		
		int rowCount=getLastNumberOfPhisycalRowFromSheet(restroSheet);
		logger.debug("RowCount for {} : {}",restroSheet.getSheetName(),rowCount);
		//Skipping the first 2 row as it the header
		for(int r=1;r<rowCount;r++){
			logger.debug("Processing rowNum: {}",r);
			//iterate thru the rows and prepare the list of data				
			Row row=restroSheet.getRow(r);
			if(row==null)continue;
			//Set the restaraunt details
			//verifying name
			String restroName="";
			String restroExcelId="";
			try{
				restroName=getStringCellValueFromRow(row, 1);		
				restroExcelId=String.valueOf(getDoubleCellValueFromRow(row, 0));
			}catch(NullPointerException ne){
				continue;
			}
			Restaraunt restaraunt=new Restaraunt();
			restaraunt.setActive(true);
			restaraunt.setAddress(getStringCellValueFromRow(row, 6));
			restaraunt.setCostFor2(getDoubleCellValueFromRow(row, 10).intValue());
			restaraunt.setCreatedDate(new Timestamp(new Date().getTime()));
			restaraunt.setDeliveryCharge(getDoubleCellValueFromRow(row, 14).intValue());
			restaraunt.setDeliveryTime(getDoubleCellValueFromRow(row, 12).intValue());
			restaraunt.setDescription(getStringCellValueFromRow(row, 3));
			restaraunt.setEmail(getStringCellValueFromRow(row, 2));
			restaraunt.setLatitude(String.valueOf(getDoubleCellValueFromRow(row, 8)));
			restaraunt.setLongitude(String.valueOf(getDoubleCellValueFromRow(row, 9)));
			restaraunt.setMinDelivery(getDoubleCellValueFromRow(row, 13).intValue());
			restaraunt.setName(restroName);
			restaraunt.setPhotoUrl(getStringCellValueFromRow(row, 4));
			restaraunt.setPrimaryContact(String.valueOf(getDoubleCellValueFromRow(row, 5)));
			restaraunt.setTaxes(getDoubleCellValueFromRow(row, 15));
			restaraunt.setPin(String.valueOf(getDoubleCellValueFromRow(row, 7)));
			restaraunt.generateUuid();
			Double areaId=row.getCell(11).getNumericCellValue();
			restaraunt.setAreaId(areaId.intValue());			
			
			logger.debug("Finding Area by ID {} for restaraunt ",areaId.intValue());
			
			Area area=null;
			try {
				area = (Area) commonRepoServ.findEntityById(Area.class, areaId.intValue());
				restaraunt.setArea(area);
				logger.debug("Found City ID {} for area ",areaId.intValue());
				mapRestroSids.put(restroExcelId, restaraunt.bytesToHexString());
			} catch (ApplicationException e) {
				logger.error("Error while fetching area by id : {}",areaId);
				logger.warn("Ignoring restaraunt for : {} in row number {}",restaraunt.getName(),r+1);
				continue;
			}
			
			logger.info("Saving restaraunt : {}",JsonUtils.toJson(restaraunt));
			try {
				commonRepoServ.save(restaraunt);
				logger.debug("restaraunt ID: {}",restaraunt.getId());
				
			} catch (DuplicateEntryException e) {
				logger.error("Error while saving restaraunt {}",restaraunt.getName());
				logger.warn("Ignoring restaraunt for : {} in row number {}",restaraunt,r);
				continue;
			} catch (ApplicationException e) {
				logger.error("Error while saving restaraunt {}",restaraunt.getName());
				logger.warn("Ignoring restaraunt for : {} in row number {}",restaraunt,r);
				continue;
			}
		}			
	}
	
	private void addRestroTimings(Sheet timingSheet){
		
		int rowCount=getLastNumberOfPhisycalRowFromSheet(timingSheet);
		logger.debug("RowCount for {} : {}",timingSheet.getSheetName(),rowCount);
		//Skipping the first 2 row as it the header
		for(int r=1;r<rowCount;r++){
			logger.debug("Processing rowNum: {}",r);
			//iterate thru the rows and prepare the list of data				
			Row row=timingSheet.getRow(r);
			if(row==null)continue;
			//Set the restaraunt details
			//verifying name
			//verifying name
			String restroExcelId="";
			try{
				restroExcelId=String.valueOf(getDoubleCellValueFromRow(row, 0));
			}catch(NullPointerException ne){
				continue;
			}
			String restroSid=mapRestroSids.get(restroExcelId);
			if(CommonUtils.isEmpty(restroSid)){
				logger.warn("Ignoring Inserting restroSid {} has timings",restroExcelId);
			}

			logger.debug("Processing restaraunt has timing for sid : {}",restroSid);
			RestarauntHasTimings hasTimings=new RestarauntHasTimings();
			RestarauntHasTimingsPK hasTimingsPK=new RestarauntHasTimingsPK();

			try {
				int restarauntId=commonRepoServ.findIdBySid(Restaraunt.class.getName(), restroSid);
				hasTimingsPK.setTiming(Enum.valueOf(Timings.class, getStringCellValueFromRow(row, 1)));
				hasTimingsPK.setRestarauntId(restarauntId);
				hasTimings.setPhotoUrl(getStringCellValueFromRow(row, 2));
				hasTimings.setTimingsPK(hasTimingsPK);
				logger.debug("Found restro ID {} for excelId+Sid map ",restroSid);
			} catch (ApplicationException e) {
				logger.error("Error while fetching restro by sid : {}, {}",restroSid,e);
				logger.warn("Ignoring restaraunt timings for : {} in row number {}",r+1);
				continue;
			} catch (Exception e) {
				logger.error("Error while fetching restro by sid : {}, {}",restroSid,e);
				logger.warn("Ignoring restaraunt timings for : {} in row number {}",r+1);
				continue;
			}
			
			logger.info("Saving restaraunt Timings : {}",JsonUtils.toJson(hasTimings));
			try {
				commonRepoServ.save(hasTimings);
				logger.debug("restaraunt has timings saved ID: {}");
			} catch (DuplicateEntryException e) {
				logger.error("Error while saving restarauntTiming {}",mapRestroSids.get(restroExcelId));
				logger.warn("Ignoring restarauntTiming for : {} in row number {}",mapRestroSids.get(restroExcelId),r);
				continue;
			} catch (ApplicationException e) {
				logger.error("Error while saving restarauntTiming {}",mapRestroSids.get(restroExcelId));
				logger.warn("Ignoring restarauntTiming for : {} in row number {}",mapRestroSids.get(restroExcelId),r);
				continue;
			}
		}			
		
	}
	
	private void addItemCategory(Sheet icSheet){
		int rowCount=getLastNumberOfPhisycalRowFromSheet(icSheet);
		logger.debug("RowCount for {} : {}",icSheet.getSheetName(),rowCount);
		//Skipping the first 2 row as it the header
		for(int r=1;r<rowCount;r++){
			logger.debug("Processing rowNum: {}",r);
			//iterate thru the rows and prepare the list of data				
			Row row=icSheet.getRow(r);
			if(row==null)continue;
			//verifying name
			String restroExcelId="";
			try{
				restroExcelId=String.valueOf(getDoubleCellValueFromRow(row, 0));
			}catch(NullPointerException ne){
				continue;
			}
			String restroSid=mapRestroSids.get(restroExcelId);
			if(CommonUtils.isEmpty(restroSid)){
				logger.warn("Ignoring Inserting restroSid {} has timings",restroExcelId);
				continue;
			}
			String categoryXLId=String.valueOf(getDoubleCellValueFromRow(row, 1));

			logger.debug("Processing restaraunt IC for sid : {}",restroSid);
			ItemCategory itemCategory=new ItemCategory();
			

			try {
				Restaraunt restaraunt=commonRepoServ.getEntityBySid(Restaraunt.class.getName(), restroSid);
				itemCategory.setNm(getStringCellValueFromRow(row, 2));
				itemCategory.setRestaraunt(restaraunt);
				itemCategory.generateUuid();
				logger.debug("Found restro ID {} for excelId+Sid map ",restroSid);
			} catch (ApplicationException e) {
				logger.error("Error while fetching restro by sid : {}, {}",restroSid,e);
				logger.warn("Ignoring item category in excel cat number {}",categoryXLId);
				continue;
			} catch (Exception e) {
				logger.error("Error while fetching restro by sid : {}, {}",restroSid,e);
				logger.warn("Ignoring item category in excel cat number {}",categoryXLId);
				continue;
			}
			
			logger.info("Saving restaraunt IC : {}",JsonUtils.toJson(itemCategory));
			try {
				commonRepoServ.save(itemCategory);
				logger.debug("IC saved ID: {}");
				mapICSids.put(categoryXLId, itemCategory.bytesToHexString());
			} catch (DuplicateEntryException e) {
				logger.error("Error while saving IC for restaraunt {}",mapRestroSids.get(restroExcelId));
				logger.warn("Ignoring IC for : {} in row number {}",mapRestroSids.get(restroExcelId),categoryXLId);
				continue;
			} catch (ApplicationException e) {
				logger.error("Error while saving restarauntTiming {}",mapRestroSids.get(restroExcelId));
				logger.warn("Ignoring restarauntTiming for : {} in row number {}",mapRestroSids.get(restroExcelId),r);
				continue;
			}
		}			
		
		
	}
	
	
	private void addItemsForCategory(Sheet itemSheet){
		int rowCount=getLastNumberOfPhisycalRowFromSheet(itemSheet);
		logger.debug("RowCount for {} : {}",itemSheet.getSheetName(),rowCount);
		//Skipping the first 2 row as it the header
		for(int r=1;r<rowCount;r++){
			logger.debug("Processing rowNum: {}",r);
			//iterate thru the rows and prepare the list of data				
			Row row=itemSheet.getRow(r);
			if(row==null)continue;
			//verifying name
			String categoryXLId="";
			try{
				categoryXLId=String.valueOf(getDoubleCellValueFromRow(row, 0));
			}catch(NullPointerException ne){
				continue;
			}
			String icSid=mapICSids.get(categoryXLId);
			if(CommonUtils.isEmpty(icSid)){
				logger.warn("Ignoring Inserting IC {} ",categoryXLId);
				continue;
			}

			logger.debug("Processing restaraunt Items  for ic sid : {}",icSid);
			Item item=new Item();
			item.generateUuid();

			try {
				ItemCategory ic=commonRepoServ.getEntityBySid(ItemCategory.class.getName(), icSid);
				item.setNm(getStringCellValueFromRow(row, 2));
				item.setPrice(getDoubleCellValueFromRow(row, 4).floatValue());
				item.setItemCategory(ic);
				item.setVeg(getStringCellValueFromRow(row, 6).equalsIgnoreCase("N"));
				logger.debug("Found ic ID {} for excelId+Sid map ",icSid);
			} catch (ApplicationException e) {
				logger.error("Error while fetching ic by sid : {}, {}",icSid,e);
				logger.warn("Ignoring item category in excel item number {} and ic {}",getDoubleCellValueFromRow(row, 1).intValue(),categoryXLId);
				continue;
			} catch (Exception e) {
				logger.error("Error while fetching ic by sid : {}, {}",icSid,e);
				logger.warn("Ignoring item category in excel item number {} and ic {}",getDoubleCellValueFromRow(row, 1).intValue(),categoryXLId);
				continue;
			}
			
			logger.info("Saving  IC  item: {}",JsonUtils.toJson(item));
			try {
				commonRepoServ.save(item);
				logger.debug("Item saved ID: {}");
			} catch (DuplicateEntryException e) {
				logger.error("Error while saving Item for IC {}",icSid);
				logger.warn("Ignoring item category in excel item number {} and ic {}",getDoubleCellValueFromRow(row, 1).intValue(),categoryXLId);
				continue;
			} catch (ApplicationException e) {
				logger.error("Error while saving Item for IC {}",icSid);
				logger.warn("Ignoring item category in excel item number {} and ic {}",getDoubleCellValueFromRow(row, 1).intValue(),categoryXLId);
				continue;
			}
		}					
	}
	
	private void addAreaDetails(List<Area> areas) throws ApplicationException{
		if(areas==null || areas.size()<=0)
			throw new IncorrectArgumentException("Areas cannot be null");
		for(Area area:areas){
			logger.debug("Inserting are: {}",JsonUtils.toJson(area));
			area.generateUuid();
			commonRepoServ.persist(area);
			logger.debug("Area {} saved : ",area.getAreaName());
		}
	}
	
	private Integer getTotalNumberOfSheetInWorkbook(String filePath) throws IOException{
		FileInputStream file = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(file);
		int totalNoOfSheet=workbook.getNumberOfSheets();
		if(file!=null)
			file.close();
//		file.close();
		return totalNoOfSheet;
	}
		
	// To get the new Sheet object 
	private Sheet getSheetObject(String filePath,int index) throws IOException{
		FileInputStream file = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet=workbook.getSheetAt(index);
        if(file!=null)
        	file.close();
//		((FileInputStream) workbook).close();
        return sheet;
	}
	
	// To get the last number of physical row
	public Integer getLastNumberOfPhisycalRowFromSheet(Sheet sheet){
		return sheet.getPhysicalNumberOfRows();
	}
	
	private String getStringCellValueFromRow(Row row,int cellNumber){
		return row.getCell(cellNumber).getStringCellValue().trim();
	}
	private Double getDoubleCellValueFromRow(Row row,int cellNumber){
		return row.getCell(cellNumber).getNumericCellValue();
	}
}
