package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "business_hour")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = BusinessHour.FIND_ALL, query = "SELECT b FROM BusinessHour b"),
        @NamedQuery(name = BusinessHour.FIND_BY_ID, query = "SELECT b FROM BusinessHour b WHERE b.id = :id"),
        @NamedQuery(name = BusinessHour.FIND_BY_WEEK_DAY, query = "SELECT b FROM BusinessHour b WHERE b.weekday = :weekday"),
        @NamedQuery(name = BusinessHour.FIND_BY_START_HR, query = "SELECT b FROM BusinessHour b WHERE b.startHr = :startHr"),
        @NamedQuery(name = BusinessHour.FIND_BY_END_HR, query = "SELECT b FROM BusinessHour b WHERE b.endHr = :endHr"),
        @NamedQuery(name = BusinessHour.FIND_BY_COMPANY_ID, query = "SELECT b FROM BusinessHour b WHERE b.companyId.id = :companyId")})
public class BusinessHour extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.BusinessHour.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_COMPANY_ID = PREFIX + "findByCompanyId";
    public static final String FIND_BY_WEEK_DAY = PREFIX + "findByWeekday";
    public static final String FIND_BY_START_HR = PREFIX + "findByStartHr";
    public static final String FIND_BY_END_HR = PREFIX + "findByEndHr";

    public static final String SUN = "SUN";
    public static final String MON = "MON";
    public static final String TUE = "TUE";
    public static final String WED = "WED";
    public static final String THU = "THU";
    public static final String FRI = "FRI";
    public static final String SAT = "SAT";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "weekday")
    private String weekday;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_hr")
    @Temporal(TemporalType.TIME)
    private Date startHr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_hr")
    @Temporal(TemporalType.TIME)
    private Date endHr;
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Company companyId;
    
    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Project project;

    public BusinessHour() {
    }

    public BusinessHour(Integer id) {
        this.id = id;
    }

    public BusinessHour(Integer id, String weekday, Date startHr, Date endHr) {
        this.id = id;
        this.weekday = weekday;
        this.startHr = startHr;
        this.endHr = endHr;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Date getStartHr() {
        return startHr;
    }

    public void setStartHr(Date startHr) {
        this.startHr = startHr;
    }

    public Date getEndHr() {
        return endHr;
    }

    public void setEndHr(Date endHr) {
        this.endHr = endHr;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BusinessHour)) {
            return false;
        }
        BusinessHour other = (BusinessHour) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.BusinessHour[ id=" + id + " ]";
    }
}
