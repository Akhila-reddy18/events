package com.university.CulturalEvents.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import javax.naming.InvalidNameException;
import javax.validation.Validator;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.CulturalEvents.dto.EventDTO;
import com.university.CulturalEvents.dto.RegistrationDTO;
import com.university.CulturalEvents.entity.Event;
import com.university.CulturalEvents.entity.registrationDetails;
import com.university.CulturalEvents.repository.EventRepository;
import com.university.CulturalEvents.repository.RegistryRepository;


@Service
public class EventService {
	private static final Logger logger = LoggerFactory.getLogger(EventService.class);
	@Autowired
	EventRepository eventRepo;
	
	@Autowired
	RegistryRepository regrepo;
	
	
public List<EventDTO> getEvents() {
List<EventDTO> DTOlist = new ArrayList<>();
	
	List<Event> eventlist=eventRepo.findAll();
			for(Event e :eventlist) {
				EventDTO eventDTO =EventDTO.valueOf(e);
				DTOlist.add(eventDTO);

				
			}
			return DTOlist;
	
}


public String add(EventDTO eventDTO) {
	Event e=eventRepo.findByeventid(eventDTO.getEventid());
    if(e.equals(null)) {
    	Event ee =eventDTO.createEntity();
    	eventRepo.save(ee);
    	return ("added successfully");
    }
    else {
    	return ("It is already exist");
    }
}


public String registerevent(RegistrationDTO regDTO) throws Exception{

   registrationDetails e=regrepo.findBystudentid(regDTO.getStudentid());
	Event event=eventRepo.findByeventid(regDTO.getEventid());
	String msg="Null";
	
//for (registrationDetails :elist) {
   if(e.getStudentid().equals(regDTO.getStudentid()) && e.getEventid()!=regDTO.getEventid()){
	   
		if (this.validateLimit(event)) {
			
			registrationDetails rege=regDTO.createentity();
			System.out.println("AFTER ENTITY");
			regrepo.saveAndFlush(rege);
			event.setRegisteredseats(event.getRegisteredseats()+1);
        	msg="Registered for the event";
		} else {
			msg="Maximum Seats registered";
			}
   	}
   else if(e.getStudentid().equals(regDTO.getStudentid()) && e.getEventid().equals(regDTO.getEventid())) {
   	msg= "Already registered for the event";
   }
   else {
	if (this.validateLimit(event)) {
			
			registrationDetails rege=regDTO.createentity();
			System.out.println("AFTER ENTITY");

			regrepo.saveAndFlush(rege);
			event.setRegisteredseats(event.getRegisteredseats()+1);
	
			System.out.println("AFTER SAVE");
        	msg="Registered for the event";
		}else {
			msg="Maximum Seats registered";
		}
   }
   return msg;
   }
   	

	
	
	


public boolean validateLimit(Event event) {
	 Boolean res=false;
	 if(event.getRegisteredseats() < event.getSeatslimit()) {
		 res=true;
	 }
	 
	 return res;

}

}
