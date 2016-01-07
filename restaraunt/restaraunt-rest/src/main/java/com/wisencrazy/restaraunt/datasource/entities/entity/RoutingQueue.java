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
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the routing_queue database table.
 * 
 */
@Entity
@Table(name="routing_queue")
@NamedQueries({
    @NamedQuery(name = RoutingQueue.FIND_BY_ID, query = "SELECT rq FROM RoutingQueue rq WHERE rq.id = :id"),
    @NamedQuery(name = RoutingQueue.FIND_BY_SID, query = "SELECT rq FROM RoutingQueue rq WHERE hex(rq.sid) = :sid"),
    @NamedQuery(name = RoutingQueue.FIND_DEFAULT_FOR_PROJECT_BY_ID, query = "SELECT rq FROM RoutingQueue rq WHERE rq.project.id = :projectId and rq.defaultQueue=true"),
    @NamedQuery(name = RoutingQueue.FIND_DEFAULT_QUEUE_SID_BY_PROJECT_SID, query = "SELECT hex(rq.sid) FROM RoutingQueue rq WHERE hex(rq.project.sid) = :projectSid and rq.defaultQueue=true"),
    @NamedQuery(name = RoutingQueue.FIND_DEFAULT_FOR_PROJECT_BY_SID, query = "SELECT rq FROM RoutingQueue rq WHERE hex(rq.project.sid) = :projectSid and rq.defaultQueue=true"),
	@NamedQuery(name = RoutingQueue.IS_DEFAULT_QUEUE_BY_SID, query = "SELECT rq.defaultQueue FROM RoutingQueue rq WHERE hex(rq.sid) = :sid"),
	@NamedQuery(name = RoutingQueue.FIND_BY_NAME,query = "SELECT rq FROM RoutingQueue rq WHERE hex(rq.project.sid) = :projectSid and rq.name = :name")})
public class RoutingQueue extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;
	
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RoutingQueue.";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySId";
    public static final String FIND_DEFAULT_FOR_PROJECT_BY_SID=PREFIX+"findDefaultForProjectBySid";
    public static final String FIND_DEFAULT_FOR_PROJECT_BY_ID=PREFIX+"findDefaultForProjectById";
	public static final String FIND_BY_NAME = PREFIX + "findByName";
	public static final String FIND_DEFAULT_QUEUE_SID_BY_PROJECT_SID = PREFIX + "findDefaultQueueSidByProjectSid";
	public static final String IS_DEFAULT_QUEUE_BY_SID = PREFIX + "isDefaultQueueBySid";

	@Column(name="call_limit")
	private int callLimit;

	@Column(name="chat_limit")
	private int chatLimit;

	@Column(name="description")
	private String description;

	@Column(name="name")
	private String name;

	@Column(name="default_queue")
	private boolean defaultQueue;
	
	@Column(name="status")
	private String status;

	@Column(name="timeout")
	private Integer timeout;

    @JoinTable(name = "routing_queue_has_channel", joinColumns = {
            @JoinColumn(name = "routing_queue_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "channel_id", referencedColumnName = "id")})
    @ManyToMany
    private List<Channel> channels;
    
	@ManyToOne
	@JoinColumn(name="template_id")
	private Template template;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	private Project project;
	
	@OneToMany(mappedBy="routingQueue", cascade={CascadeType.ALL},orphanRemoval=true)
	private List<RoutingQueueCriteriaAction> routingQueueCriteriaActions;
    
	@JoinTable(name = "routing_queue_has_recipient", 
			joinColumns = { @JoinColumn(name = "routing_queue_id", referencedColumnName = "id") },
			inverseJoinColumns = { @JoinColumn(name = "recipient_id", referencedColumnName = "id") })
	@ManyToMany
	private List<Recipient> recipients;

	public RoutingQueue() {
	}


	public int getCallLimit() {
		return this.callLimit;
	}

	public void setCallLimit(int callLimit) {
		this.callLimit = callLimit;
	}

	public int getChatLimit() {
		return this.chatLimit;
	}

	public void setChatLimit(int chatLimit) {
		this.chatLimit = chatLimit;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public boolean isDefaultQueue() {
		return defaultQueue;
	}


	public void setDefaultQueue(boolean defaultQueue) {
		this.defaultQueue = defaultQueue;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public List<Channel> getChannels() {
		return channels;
	}


	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	public List<RoutingQueueCriteriaAction> getRoutingQueueCriteriaActions() {
		return routingQueueCriteriaActions;
	}


	public void setRoutingQueueCriteriaActions(
			List<RoutingQueueCriteriaAction> routingQueueCriteriaActions) {
		this.routingQueueCriteriaActions = routingQueueCriteriaActions;
	}

	public List<Recipient> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<Recipient> recipients) {
		this.recipients = recipients;
	}

}