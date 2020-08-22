package com.university.CulturalEvents.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.CulturalEvents.dto.EventDTO;
import com.university.CulturalEvents.dto.RegistrationDTO;
import com.university.CulturalEvents.entity.Event;
import com.university.CulturalEvents.entity.registrationDetails;


@Repository

public interface RegistryRepository extends JpaRepository<registrationDetails, Integer> {

	
	public registrationDetails findBystudentid(int Id);
	public List<registrationDetails> findAllBystudentid(int id);
	
	public void save(RegistrationDTO reg);
	//public Event findByeventname(String ename);

	
}
