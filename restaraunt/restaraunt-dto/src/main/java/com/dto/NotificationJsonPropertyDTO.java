package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationJsonPropertyDTO<T> extends AbsCommonDTO implements Serializable {
    /**
     *
     */
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 8001167133072185605L;
	/**
     *
     */
    private String type;
    private String displayType;
    private String status;
    private String priority;
    private String timestamp;
    private BehaviorDTO behavior;
    private T content;

    public NotificationJsonPropertyDTO() {
    }


    public NotificationJsonPropertyDTO(String type, String displayType,
            String timestamp, String status, String priority,
            BehaviorDTO behavior, T content) {
        super();
        this.type = type;
        this.displayType = displayType;
        this.timestamp = timestamp;
        this.status = status;
        this.priority = priority;
        this.behavior = behavior;
        this.content = content;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public BehaviorDTO getBehavior() {
        return behavior;
    }

    public void setBehavior(BehaviorDTO behavior) {
        this.behavior = behavior;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getPriority() {
        return priority;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }

}