package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the company_has_holiday database table.
 * 
 */
@Entity
@Table(name="company_has_holiday")
@NamedQueries({
	@NamedQuery(name = CompanyHasHoliday.FIND_HOLIDAY_DATE_BY_NAME_YEAR, query = "select chh.compositeId.holidayDate " +
			"from CompanyHasHoliday chh where chh.holiday = :name " +
			"and chh.year = :year and chh.compositeId.companyId = " +
			"(select c.id from Company c where hex(c.sid) = :companySid)"),
	@NamedQuery(name = CompanyHasHoliday.FIND_BY_YEAR_AND_COMPANY, query = "from CompanyHasHoliday chh " +
			"where chh.year = :year and chh.compositeId.companyId = " +
			"(select c.id from Company c where hex(c.sid) = :companySid)"),
	@NamedQuery(name = CompanyHasHoliday.DELETE_BY_COMPANY_SID, query = "delete from CompanyHasHoliday chh " +
			"where hex(chh.sid) = :sid and chh.compositeId.companyId = " +
			"(select c.id from Company c where hex(c.sid) = :companySid)"),
	@NamedQuery(name = CompanyHasHoliday.VERIFY_DATE_FOR_COMPANY, query = "select hex(chh.sid) from CompanyHasHoliday chh " +
			"where chh.compositeId.holidayDate = :date and chh.year = :year " +
			"and chh.compositeId.companyId = (select c.id from Company c where hex(c.sid) = :companySid)"),
			@NamedQuery(name = CompanyHasHoliday.VERIFY_HOLIDAY_BY_DATE_AND_COMPANY_ID, query = "select chh.holiday from CompanyHasHoliday chh " +
					"where chh.compositeId.holidayDate = :date " +
					"and chh.compositeId.companyId = :id")
})
public class CompanyHasHoliday extends AbsCompositeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyHasHoliday.";
	public static final String FIND_HOLIDAY_DATE_BY_NAME_YEAR = PREFIX + "findHolidayByNameAndYear";

	public static final String FIND_BY_YEAR_AND_COMPANY = PREFIX + "findByYearAndCompany";

	public static final String DELETE_BY_COMPANY_SID = PREFIX + "deleteBySidAndCompanySid";

	public static final String VERIFY_DATE_FOR_COMPANY = PREFIX + "validateDateForCompany";
	
	public static final String VERIFY_HOLIDAY_BY_DATE_AND_COMPANY_ID = PREFIX + "validateHolidayByDateAndCompanyId";

	@EmbeddedId
	private CompanyHasHolidayPK compositeId;

	@ManyToOne
	@JoinColumn(name="updated_by", referencedColumnName = "id")
	private Appuser updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;
	
	private String year;

	private String holiday;

	public CompanyHasHoliday() {
	}

	public CompanyHasHolidayPK getCompositeId() {
		return this.compositeId;
	}

	public void setCompositeId(CompanyHasHolidayPK compositeId) {
		this.compositeId = compositeId;
	}

	public String getHoliday() {
		return this.holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	
	public Appuser getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Appuser updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}
}