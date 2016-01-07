package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the call_log database table.
 *
 */
@Entity
@Table(name="call_log")
public class CallLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="connected_time")
    private Date connectedTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time")
    private Date endTime;

    private String from;

    @Column(name="recording_url")
    private String recordingUrl;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time")
    private Date startTime;

    private String to;

    @Column(name="transcript_url")
    private String transcriptUrl;

    //bi-directional many-to-one association to CallNote
    @OneToMany(mappedBy="callLog")
    private List<CallNote> callNotes;

    public CallLog() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getConnectedTime() {
        return this.connectedTime;
    }

    public void setConnectedTime(Date connectedTime) {
        this.connectedTime = connectedTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getRecordingUrl() {
        return this.recordingUrl;
    }

    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTranscriptUrl() {
        return this.transcriptUrl;
    }

    public void setTranscriptUrl(String transcriptUrl) {
        this.transcriptUrl = transcriptUrl;
    }

    public List<CallNote> getCallNotes() {
        return this.callNotes;
    }

    public void setCallNotes(List<CallNote> callNotes) {
        this.callNotes = callNotes;
    }

    public CallNote addCallNote(CallNote callNote) {
        getCallNotes().add(callNote);
        callNote.setCallLog(this);

        return callNote;
    }

    public CallNote removeCallNote(CallNote callNote) {
        getCallNotes().remove(callNote);
        callNote.setCallLog(null);

        return callNote;
    }

}