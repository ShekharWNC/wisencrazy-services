package com.wisencrazy.common;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.wisencrazy.common.exception.ApplicationException;

public class DateUtils {
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String TIMEZONE = "UTC";
    private static final String DATE_FORMAT_HD = "yyyy-MM-dd hh:mm:ss.SSS a";
	public static boolean compareTwoDates(Date expiryDate,Date currentDate){
		boolean datesStatus=false;
		if(currentDate.before(expiryDate)){
			datesStatus=true;
			}
		if(currentDate.after(expiryDate)){
			datesStatus=false;
		}
		if(currentDate.equals(expiryDate)){
			datesStatus=true;
		}
			return datesStatus;
		}
	 public static Date getCurrentDate() {
		 Date currentDate = new Date();
		 return currentDate;
	    }
	 public static Date getCurrentDateWithFiveDaysAdded(){
		 return getDateAfterNoOfDays(5);
	  }
	 
	public static Date getDateAfterNoOfDays(int noOfDays) {
		Date expiryDate = new Date();  
		    Calendar cal = Calendar.getInstance();  
		    cal.setTime(expiryDate);
		    cal.add(Calendar.DATE, noOfDays);
		    expiryDate = cal.getTime();
		    return expiryDate;
	}
	 
	@SuppressWarnings("deprecation")
	public static Timestamp convertStringToTimeStamp(String dateString){
		 return new Timestamp(new Date(dateString).getTime());
	 }
	 /**
     * Get Current date and time in UTC formate
     * @return
     */
	public static Timestamp getISTTimeStampByCurrentDate(){
		 SimpleDateFormat dateFormatGmt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		 Date date=null;
		try {
			date = dateFormatGmt.parse(dateFormatGmt.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return new Timestamp(date.getTime());
     }
	@Deprecated
	public static Timestamp getCurrentGMTTimestamp() throws ParseException{
		Calendar cal = Calendar.getInstance();
		   return new Timestamp(cal.getTimeInMillis()
		                       -cal.get(Calendar.ZONE_OFFSET)
		                       -cal.get(Calendar.DST_OFFSET));
	 }
	public static String convertTimeStampToString(Timestamp timestamp){
		DateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		return df.format(timestamp);
	}
	
	 public static DateFormat  getDateFormatByTimeZone(String dateFormat,String timeZone) throws ApplicationException{
		 DateFormat formatter= null;
		try {
			 if(!(timeZone==null) && !(timeZone==null)){
			 formatter= new SimpleDateFormat(dateFormat);
				formatter.setTimeZone(TimeZone.getTimeZone(timeZone));
				 return formatter;
			 }else{
				 throw new ApplicationException("getDateFormatByTimeZone(String dateFormat,String timeZone)------ Invalid specified timezone");
			 }
		} catch (Exception e) {
			throw new ApplicationException("Error in getDateFormatByTimeZone(String dateFormat,String timeZone)---"+e.getMessage());
		}
	 }
	 
	 public static Timestamp getDateByTimeStamp(java.util.Date date){
		 return new Timestamp(date.getTime());
	 }
	 
	 public static Timestamp getTimeStampByAddingHoursToDate(Date date, int hours)
			 throws ApplicationException{
		 String dateString = getStringDateByFormatAndTimezone(date, DATE_FORMAT_HD, TIMEZONE);
		 date = getDateByDateFormatAndTimezone(dateString, DATE_FORMAT_HD, TIMEZONE);
		 date = getDateByAddingHoursToDate(date,hours);
		 
		 return getTimestampByDate(date);
	 }
	 
	 public static Timestamp getTimeStampByAddingHoursAndMinutesToDate(Date date, int hours, int minutes)
			 throws ApplicationException{
		 String dateString = getStringDateByFormatAndTimezone(date, DATE_FORMAT_HD, TIMEZONE);
		 date = getDateByDateFormatAndTimezone(dateString, DATE_FORMAT_HD, TIMEZONE);
		 date = getDateByAddingHoursAndMinutesToDate(date,hours,minutes);
		 
		 return getTimestampByDate(date);
	 }
	 
	public static Date getDateByAddingHoursToDate(Date date, int hours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, hours);
		date = calendar.getTime();
		Date newDate = calendar.getTime();
		/*Long hourInMills = 60 * 60 * 1000L;
		Date newDate = new Date(date.getTime() + (hours * hourInMills));*/ 
		return newDate;
	}
	
	public static Date getDateByAddingHoursAndMinutesToDate(Date date, int hours, int minutes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, hours);
		calendar.add(Calendar.MINUTE, minutes);
		date = calendar.getTime();
		Date newDate = calendar.getTime();
		return newDate;
	}
	
	
	public static Date getDateByAddingMonthsToDate(Date date, int months){
		Date current =  date;
		Calendar cal = Calendar.getInstance();  
		cal.setTime(current);  
		cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH)+months));  
		current = cal.getTime();
		return current;
	}
	
	public static Date convertStringToTime(String startTime) throws ApplicationException {
		Date time = null;
		if(!CommonUtils.isEmpty(startTime)){
			SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
			try {
				time = dateFormat.parse(startTime);
			} catch (ParseException e) {
				throw new ApplicationException(ApplicationConstants.DATE_FORMAT_EXP, e);
			}
		}
		return time;
	}
	public static String getStringByDate(Date date) {
        DateFormat dateFormat = ourDateFormat();
        return dateFormat.format(date);
	}
	
	public static String getStringDateByFormatAndTimezone(Date date, String dateformat, String timezone){
		DateFormat dateFormat2 = getDateFormat(dateformat, timezone);
		return dateFormat2.format(date);
	}
	
	public static DateFormat getDateFormat(String dateformat, String timezone2) {
		DateFormat dateFormat2 = new SimpleDateFormat(dateformat);
		dateFormat2.setTimeZone(TimeZone.getTimeZone(timezone2));
		return dateFormat2;
	}
	
	public static Date getUtcDateByFormatAndTimezone(Date date, String dateFormat) throws ApplicationException{
		Date date2 = null;
		String dateString = getStringDateByFormatAndTimezone(date, dateFormat, TIMEZONE);
		DateFormat formatter = getDateFormat(dateFormat, TIMEZONE);
		try {
			date2 = formatter.parse(dateString);
		} catch (ParseException parseException) {
			throw new ApplicationException(ApplicationConstants.DATE_FORMAT_EXP, parseException);
		}
		return date2;
		
	}
	
	private static DateFormat ourDateFormat() {
	    DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
	    dateFormat.setTimeZone(TimeZone.getTimeZone(TIMEZONE));
	    return dateFormat;
	}
	// Method is being used for get before time with respect to current time.
	public static String getBeforeTimeByCurrentTime(Integer min){
		 SimpleDateFormat simpleDateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
         Calendar calStart = Calendar.getInstance();
         calStart.setLenient(true);
         calStart.setTime(new Date());
         calStart.set(Calendar.MINUTE, calStart.get(Calendar.MINUTE)-min);
         calStart.set(Calendar.SECOND, calStart.get(Calendar.SECOND));
         calStart.set(Calendar.HOUR_OF_DAY, calStart.get(Calendar.HOUR_OF_DAY));
         Date startTime=calStart.getTime();
         return simpleDateFormate.format(startTime);
	}
	//Method is being used for get the current date and time in yyyy-MM-dd HH:mm:ss formate.
	public static String getStringDateByDate(){
		 SimpleDateFormat simpleDateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
		 return simpleDateFormate.format(new Date());
	}

	public static Long getTimeStampByCurrentDate() {
		SimpleDateFormat isoFormat = new SimpleDateFormat(DATE_FORMAT);
		isoFormat.setTimeZone(TimeZone.getTimeZone(TIMEZONE));
		Date d = new Date();
		String currentUtcTime = isoFormat.format(d);
		return Timestamp.valueOf(currentUtcTime).getTime();
	}
	
	public static Timestamp getTimeStampByAddingDaysToDate(Date date, 
			int days) throws ApplicationException {
		date = getDateByAddingHoursToDate(date, days * 24);
		String dateString = getStringDateByFormatAndTimezone(date, DATE_FORMAT_HD, TIMEZONE);
		date = getDateByDateFormatAndTimezone(dateString, DATE_FORMAT_HD, TIMEZONE);
		return getTimestampByDate(date);
	}
	
	public static Timestamp getTimestampByAddingMonthsToDate(Date date, int months) throws ApplicationException{
		date = getDateByAddingMonthsToDate(date, months);
		String dateString = getStringDateByFormatAndTimezone(date, DATE_FORMAT_HD, TIMEZONE);
		date = getDateByDateFormatAndTimezone(dateString, DATE_FORMAT_HD, TIMEZONE);
		return getTimestampByDate(date);
	}
	
	public static Timestamp getTimeStampByDefaultTimezone(Date date) throws ApplicationException{
		return getTimeStampByDateWithTimeZone(date, DATE_FORMAT, TIMEZONE);
	}
	
	public static Timestamp getTimeStampByDateWithTimeZone(Date date, 
			String dateFormat, String timezone) throws ApplicationException{
		String dateString = getStringDateByFormatAndTimezone(date, dateFormat, timezone);
		return Timestamp.valueOf(dateString);
	}
	
	public static Date getDateByDateFormatAndTimezone(Date date,
			String dateFormat, String timezone) throws ApplicationException {
		String dateString =  getStringDateByFormatAndTimezone(date, dateFormat, timezone);
		date = getDateByDateFormatAndTimezone(dateString, dateFormat, timezone);
		return date;
	}
	
	public static Timestamp getTimestampByDate(Date date) {
		return new Timestamp(date.getTime());
	}
	
	public static Date getDateByDateFormatAndTimezone(String date,
			String dateFormat, String timezone) throws ApplicationException {
		SimpleDateFormat isoFormat = new SimpleDateFormat(dateFormat);
	    isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
	    Date utilDate = null;
		try {
			utilDate = isoFormat.parse(date);
		} catch (ParseException e) {
			throw new ApplicationException(ApplicationConstants.DATE_FORMAT_EXP, e);
		}
		return utilDate;
	}
	/**
	 * converts string to sql date
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Date convertStringToSQLDate(String dateString) {

		String formatDate = "";
		if (dateString != null & dateString != "")
			formatDate = convertStringToDateFormat(dateString, "dd-MM-yyyy",
					"MM/dd/yyyy");
		java.sql.Date sqldate = null;
		if (formatDate != null & formatDate != "") {
			Date date = new Date(formatDate);
			sqldate = new java.sql.Date(date.getTime());
		}
		return sqldate;
	}
	
	/**
	 * Converts the InputDateString to a user defined date format.
	 * 
	 * @param dateString
	 *            - Represents String.
	 * @param inputdateFormat
	 *            - Format of the date String.
	 * @param outputDateFormat
	 *            - User defined date format.
	 * @return User defined date format.
	 */
	public static String convertStringToDateFormat(String dateString,
			String inputdateFormat, String outputDateFormat) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				inputdateFormat);
		Date date = null;
		String formattedDate = "";
		if (dateString != null && dateString.length() != 0) {
			try {
				date = simpleDateFormat.parse(dateString);
				formattedDate = formatDate(date, outputDateFormat);
			} catch (ParseException e) {
			}
		}

		return formattedDate;
	}
	
	/**
	 * method formatDate returns date as specified date pattern
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {

		String returnString = new SimpleDateFormat(pattern).format(date).toString();
		return returnString;
	}
	
	public static Date convertStringToDate(String dateString, String dateFormat) throws ApplicationException {
		Date date = null;
		DateFormat formatter = new SimpleDateFormat(dateFormat);
		try {
			date = formatter.parse(dateString);
//			date = getDateByDateFormatAndTimezone(date, dateFormat, TIMEZONE);
		} catch (ParseException parseException) {
			throw new ApplicationException(ApplicationConstants.DATE_FORMAT_EXP, parseException);
		}
		return date;
	}
	
	public static String convertSqlDateToString(java.sql.Date sqlDate){

		java.util.Date utilDate = null;
		  if (sqlDate != null)  utilDate = new java.util.Date(sqlDate.getTime());
		  
	  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		  //to convert Date to String, use format method of SimpleDateFormat class.
		String returnString = dateFormat.format(utilDate);
		return returnString;
	}
	
	public static Date getDateByOffset(Date date, String offSet){
		if(date == null || CommonUtils.isEmpty(offSet)){
			return null;
		}
		String[] hm = offSet.split(":");
		return getDateByAddingHoursAndMinutesToDate(date, new Integer(hm[0]), new Integer(hm[1]));
	}
	
	public static java.sql.Date getSqlDateByOffset(Date date, String offSet){
		return new java.sql.Date(getDateByOffset(date, offSet).getTime());
	}
	
	public static int compareTwoTimes(Date date1, Date date2){
		Time time1 = new Time(date1.getTime());
		Time time2 = new Time(date2.getTime());
		return time1.compareTo(time2);
	}
	
	public static Date convertPreviousDateToCurrentDate(Date previousDate, Date currentDate){
		Calendar calendar = Calendar.getInstance();
		currentDate.setHours(previousDate.getHours());
		currentDate.setMinutes(previousDate.getMinutes());
		currentDate.setSeconds(previousDate.getSeconds());
		return currentDate;
	}
	/**
	 * This methd to convert the long (milliseconds) to string(date) in specified format
	 * EX:(1223154454545,HH:mm)
	 * @param time
	 * @param format
	 * @return
	 * @throws ApplicationException
	 */
	public static String convertLongToString(Long time,String format)throws ApplicationException {
		 String currentUtcTime = null;
		try {
			SimpleDateFormat isoFormat = new SimpleDateFormat(format);
	        isoFormat.setTimeZone(TimeZone.getTimeZone("ISO"));
	        Date d=new Date();
	        currentUtcTime=isoFormat.format(d);
		} catch (Exception e) {
			throw new ApplicationException(ApplicationConstants.DATE_FORMAT_EXP, e);
		}
		return currentUtcTime;
	}
	
	public static String getAWSFormatTime(Date date) throws ApplicationException{
		try {
			if(date!=null){
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
				dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
				return dateFormat.format(new Date());
			}
			return null;
		} catch (Exception e) {
			throw new ApplicationException(ApplicationConstants.DATE_FORMAT_EXP, e);
		}
	}
	public static String convertDataTOString(Timestamp timeStamp){
		Date date = new Date(timeStamp.getTime());
		SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return dt.format(date);
	}
	 /**
	   * Get Current date and time in IST formate
	   * 
	 * @return
	 */
	public static Timestamp getTimeStampByCurrentDateInISTFormat() {
		 long ts = new Date().getTime();
		    Date localTime = new Date(ts);
		    String format = "yyyy/MM/dd HH:mm:ss";
		    SimpleDateFormat sdf = new SimpleDateFormat(format);
		    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		    Date gmtTime = new Date(sdf.format(localTime));
		    Date fromGmt = new Date(gmtTime.getTime() + TimeZone.getDefault().getOffset(localTime.getTime()));
		    return new Timestamp(fromGmt.getTime());
	   }
}
