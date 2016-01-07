package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 4/10/13
 * Time: 5:18 PM
 */
@Entity
@Table(name = "case_field")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseField.FIND_ALL, query = "SELECT c FROM CaseField c"),
        @NamedQuery(name = CaseField.FIND_BY_ID, query = "SELECT c FROM CaseField c WHERE c.id = :id"),
        @NamedQuery(name = CaseField.FIND_BY_NAME, query = "SELECT c FROM CaseField c WHERE c.name = :name"),
        @NamedQuery(name = CaseField.FIND_BY_IS_CUSTOM, query = "SELECT c FROM CaseField c WHERE c.isCustom = :isCustom"),
        @NamedQuery(name = CaseField.FIND_BY_IS_ACTIVE, query = "SELECT c FROM CaseField c WHERE c.isActive = :isActive"),
        @NamedQuery(name = CaseField.FIND_BY_PROJ_ID, query = "SELECT c FROM CaseField c WHERE c.project.id = :projectId"),
        @NamedQuery(name = CaseField.FIND_SID_BY_NAME_AND_PROJ_SID, query = "SELECT hex(c.sid) FROM CaseField c WHERE c.name = :name and hex(c.project.sid) = :projectSid"),
        @NamedQuery(name = CaseField.FIND_ID_BY_NAME_AND_PROJ_SID, query = "SELECT c.id FROM CaseField c WHERE c.name = :name and hex(c.project.sid) = :projectSid"),
        @NamedQuery(name = CaseField.FIND_BY_PROJ_SID, query = "SELECT c FROM CaseField c WHERE hex(c.project.sid) = :projectSid"),
        @NamedQuery(name = CaseField.FIND_ID_BY_NAME_AND_PROJ_ID, query = "SELECT c.id FROM CaseField c WHERE c.name = :name and c.project.id = :projectId"),
})
public class CaseField extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseField.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_BY_IS_CUSTOM = PREFIX + "findByIsCustom";
    public static final String FIND_BY_IS_ACTIVE = PREFIX + "findByIsActive";
    public static final String FIND_BY_PROJ_ID = PREFIX + "findByProjectId";
    public static final String FIND_BY_PROJ_SID = PREFIX + "findByProjectSid";
    public static final String FIND_SID_BY_NAME_AND_PROJ_SID = PREFIX + "findSidByNameAndProjectSid";
    public static final String FIND_ID_BY_NAME_AND_PROJ_SID = PREFIX + "findIdByNameAndProjectSid";
    public static final String FIND_ID_BY_NAME_AND_PROJ_ID = PREFIX + "findIdByNameAndProjectId";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "mapped_field_name")
	private String mappedFieldName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_custom", nullable = false)
    private boolean isCustom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
    @JoinColumn(name = "case_field_type_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private CustomFieldType caseFieldType;
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Project project;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_required", nullable = false)
    private boolean isRequired;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseFieldId")
    private List<CaseFieldOption> caseFieldOptionList;

    public CaseField() {
    }

    public CaseField(Integer id) {
        this.id = id;
    }

    public CaseField(Integer id, String name, boolean isCustom, boolean isActive) {
        this.id = id;
        this.name = name;
        this.isCustom = isCustom;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMappedFieldName() {
		return mappedFieldName;
	}

	public void setMappedFieldName(String mappedFieldName) {
		this.mappedFieldName = mappedFieldName;
	}

	public boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(boolean isCustom) {
        this.isCustom = isCustom;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public CustomFieldType getCaseFieldType() {
        return caseFieldType;
    }

    public void setCaseFieldType(CustomFieldType caseFieldType) {
        this.caseFieldType = caseFieldType;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    @XmlTransient
    public List<CaseFieldOption> getCaseFieldOptionList() {
        return caseFieldOptionList;
    }

    public void setCaseFieldOptionList(List<CaseFieldOption> caseFieldOptionList) {
        this.caseFieldOptionList = caseFieldOptionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaseField)) {
            return false;
        }
        CaseField other = (CaseField) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CaseField[ id=" + id + " ]";
    }

}
