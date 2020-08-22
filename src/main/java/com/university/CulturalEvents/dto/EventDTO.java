package com.university.CulturalEvents.dto;

import java.sql.Date;

import com.university.CulturalEvents.entity.Event;

public class EventDTO {
	Integer eventid;
	String eventname;
	Date eventtime;
	Integer seatslimit;
	Integer registeredseats;
	
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
	public EventDTO() {
		super();
	}
	// Converts Entity into DTO
	public static EventDTO valueOf(Event event) {
		EventDTO eventDTO= new EventDTO();
		eventDTO.setEventname(event.getEventname());
		eventDTO.setEventtime(event.getEventtime());
		eventDTO.setRegisteredseats(event.getRegisteredseats());
		eventDTO.setSeatslimit(event.getSeatslimit());
		eventDTO.setEventid(event.getEventid());
		
		return eventDTO;
	}
	public Event createEntity() {
		Event e=new Event();
		e.setEventid(this.getEventid());
		e.setEventname(this.getEventname());
		e.setEventtime(this.getEventtime());
		e.setRegisteredseats(this.getRegisteredseats());
		e.setSeatslimit(this.getSeatslimit());
		
		return e;
	}
		
	
}
