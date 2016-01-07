package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name = "bill_template")
@NamedQueries({@NamedQuery(name=BillTemplate.GET_BILL_TEMPLATE_BY_PROJECT,query="select b from BillTemplate b where b.project.sid=unhex(:projectSid) and b.status='ENABLE'")
 })
public class BillTemplate extends AbsBaseEntity {

	private static final long serialVersionUID = 368019782397796242L;
	private static final String PREFIX="com.callcomm.eserve.persistence.entity.BillTemplate.";
	public static final String GET_BILL_TEMPLATE_BY_PROJECT=PREFIX+"getBillTemplateByProject";
	public static final String UPDATE_BILL_TEMPLATE_STATUS="update bill_template set status=:status where id=:billId";
	public enum BILL_TEMPLATE {
		ENABLE, DISABLE;
	}
    @Column(name="template_json")
	private String templateJson;
    @Column(name="status")
    @Enumerated(EnumType.STRING)
	private BILL_TEMPLATE status;
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Project project;
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Company company;

	public String getTemplateJson() {
		return templateJson;
	}

	public void setTemplateJson(String templateJson) {
		this.templateJson = templateJson;
	}

	public BILL_TEMPLATE getStatus() {
		return status;
	}

	public void setStatus(BILL_TEMPLATE status) {
		this.status = status;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
