package com.university.CulturalEvents.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="registration")
public class registrationDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer registrationid;
	Integer studentid;
	Integer eventid;
	String eventname;
	
	public Integer getRegistrationid() {
		return registrationid;
	}
	public void setRegistrationid(Integer registrationid) {
		this.registrationid = registrationid;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getEventid() {
		return eventid;
	}
	public void setEventid(Integer eventid) {
		this.eventid = eventid;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	
	
}
	
