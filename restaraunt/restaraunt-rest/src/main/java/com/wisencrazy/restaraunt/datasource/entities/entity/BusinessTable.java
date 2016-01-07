package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "business_table")
@NamedQueries({
	@NamedQuery(name = BusinessTable.FIND_TABLE_BY_COMPANY_AND_PROJECT, query = "SELECT b from BusinessTable b where b.company.sid=unhex(:companySid) and b.project.sid=unhex(:projectSid) order by b.name"),
	@NamedQuery(name=BusinessTable.FIND_TABLE_BY_AGENT,query="select b from BusinessTable b where b.virtualAccount.sid=unhex(:virtualAccountSid) and b.project.sid=unhex(:projectSid) order by b.name"),
	@NamedQuery(name=BusinessTable.FIND_AGENT_BY_TABLE,query="select b from BusinessTable b where b.sid=unhex(:tableSid)"),
	@NamedQuery(name=BusinessTable.FIND_AGENT_BY_TABLE_ID_AND_PROJECT_SID, query="select b from BusinessTable b where b.project.sid=unhex(:projectSid) and b.tableId=:tableId"),
	@NamedQuery(name=BusinessTable.FIND_AGENT_BY_TABLE_ID, query="select b from BusinessTable b where b.tableId=:tableId"),
	@NamedQuery(name=BusinessTable.FIND_CURRENT_ORDERS_BY_TABLE_SID, query="select o from BusinessTable bt join bt.orders o join o.orderstate os where os.id=:orderstateid and bt.sid=unhex(:tablesid)")
    
})
public class BusinessTable extends AbsBaseEntity {

	private static final long serialVersionUID = 5092790546798448332L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.BusinessTable.";
	public static final String FIND_TABLE_BY_COMPANY_AND_PROJECT = PREFIX
			+ "findTableByCompanyAndProject";
	public static final String FIND_TABLE_BY_AGENT = PREFIX
			+ "findTableByAgent";
	public static final String FIND_AGENT_BY_TABLE = PREFIX
			+ "findAgentByTable";
	public static final String FIND_AGENT_BY_TABLE_ID_AND_PROJECT_SID=PREFIX+ "findAgentByTableAndProject";
	public static final String FIND_AGENT_BY_TABLE_ID=PREFIX+ "findAgentByTableId";
	public static final String FIND_CURRENT_ORDERS_BY_TABLE_SID=PREFIX+ "findCurrentOrdersBytableSidAndOrdState";
    
	
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name="table_id")
	private Integer tableId;
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	@ManyToOne
	private Company company;
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	@ManyToOne
	private Project project;
	@JoinColumn(name = "virtual_account_id", referencedColumnName = "id")
	@ManyToOne
	private VirtualAccount virtualAccount;
	
	@Column(name = "status")
    private String status;
 
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "project_table_has_orders", joinColumns = {
            @JoinColumn(name = "project_table_id", referencedColumnName = "id", nullable = false)}, 
            inverseJoinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)})
	private List<Orders> orders;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public VirtualAccount getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
