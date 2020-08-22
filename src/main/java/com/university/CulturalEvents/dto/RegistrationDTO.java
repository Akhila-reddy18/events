package com.university.CulturalEvents.dto;

import com.university.CulturalEvents.entity.registrationDetails;

public class RegistrationDTO {
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
	public registrationDetails createentity() {
		registrationDetails regdetails=new registrationDetails();
		regdetails.setRegistrationid(this.getRegistrationid());
		regdetails.setEventid(this.getEventid());
		regdetails.setEventname(this.getEventname());
		regdetails.setStudentid(this.getStudentid());
		return regdetails;
	}

	
}
