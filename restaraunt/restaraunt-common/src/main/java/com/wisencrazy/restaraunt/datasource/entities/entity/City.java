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
@Table(name="city")
@NamedQueries({
	@NamedQuery(name=City.FIND_CITY_BY_STATE_ID,query="from City s where s.state.id=1"),
	@NamedQuery(name=City.FIND_CITY_BY_STATE_NAME,query="from City s where s.state.stateName=:stateName")
	})
public class City extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;
    
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.City.";
	public static final String FIND_CITY_BY_STATE_ID = PREFIX + "findCityByState";
	public static final String FIND_CITY_BY_STATE_NAME=PREFIX + "findCityByStateName";


    @Size(min=1)
    @Column(name="city_name")
    private String cityName;

    //bi-directional many-to-one association to Country
    @ManyToOne
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private State state;

    public City() {
    }

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}