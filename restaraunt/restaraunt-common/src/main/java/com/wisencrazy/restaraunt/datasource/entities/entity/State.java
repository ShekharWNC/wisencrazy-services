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
@Table(name="state")
@NamedQueries({
	@NamedQuery(name=State.FIND_STATE_BY_COUNTRY_ID,query="from State s where s.country.id=:id")
})
public class State extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;
    
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.State.";
	public static final String FIND_STATE_BY_COUNTRY_ID = PREFIX + "findStateByCountry";


    @Size(min=1)
    @Column(name="state_name")
    private String stateName;

    //bi-directional many-to-one association to Country
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    public State() {
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}