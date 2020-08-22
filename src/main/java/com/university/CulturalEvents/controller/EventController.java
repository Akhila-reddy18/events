package com.university.CulturalEvents.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.university.CulturalEvents.dto.EventDTO;
import com.university.CulturalEvents.dto.RegistrationDTO;
import com.university.CulturalEvents.entity.Event;
import com.university.CulturalEvents.entity.registrationDetails;
import com.university.CulturalEvents.service.EventService;




@RestController
//@RequestMapping(value="/api")
public class EventController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EventService eventService;
	

	@GetMapping(value = "/events")
	public List<EventDTO> viewEvents(){
		
		return eventService.getEvents();
	}
	
	@PostMapping(value="/events/add")
	public String addEvent(@RequestBody EventDTO eventDTO) {
		return eventService.add(eventDTO);
		
	}
	@PostMapping(value ="/events/student/register")
	public String register(@RequestBody RegistrationDTO regDTO)throws Exception {
		 return eventService.registerevent(regDTO);
	}
	
		
		
		
		
		
		
	}


