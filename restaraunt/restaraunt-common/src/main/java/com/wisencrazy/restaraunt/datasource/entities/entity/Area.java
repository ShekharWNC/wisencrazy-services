package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="area")
@NamedQueries({
	@NamedQuery(name=Area.FIND_AREA_BY_CITY_SID,query="from Area a where hex(a.city.sid)=:citySid")
})
public class Area extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;
    
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.Area.";
	public static final String FIND_AREA_BY_CITY_SID = PREFIX + "findAreabyCitySid";


    @Size(min=1)
    @Column(name="area_name")
    private String areaName;

    //bi-directional many-to-one association to Country
    @ManyToOne
    @JoinColumn(name = "area_id", referencedColumnName = "id")
    private City city;

    public Area() {
    }

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}