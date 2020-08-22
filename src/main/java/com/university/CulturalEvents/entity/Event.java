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

@Entity
@Table(name="event")
public class Event{
	
	@Id
	Integer eventid;
	String eventname;
	Date eventtime;
	Integer seatslimit;
	Integer registeredseats;
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
	public Date getEventtime() {
		return eventtime;
	}
	public void setEventtime(Date eventtime) {
		this.eventtime = eventtime;
	}
	public Integer getSeatslimit() {
		return seatslimit;
	}
	public void setSeatslimit(Integer seatslimit) {
		this.seatslimit = seatslimit;
	}
	public Integer getRegisteredseats() {
		return registeredseats;
	}
	public void setRegisteredseats(Integer registeredseats) {
		this.registeredseats = registeredseats;
	}
	
	
	
}
	
