package com.university.CulturalEvents.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.CulturalEvents.dto.EventDTO;
import com.university.CulturalEvents.entity.Event;

@Repository
@Transactional
public interface EventRepository extends JpaRepository<Event, Integer> {

	
	public Event findByeventid(int Id);
	public Event findByeventname(String ename);
	
}
