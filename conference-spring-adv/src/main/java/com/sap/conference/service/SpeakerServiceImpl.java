package com.sap.conference.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sap.conference.model.Speaker;
import com.sap.conference.repository.SpeakerRepository;

@Service("speakerService")
/*Run with -Dspring.profiles.active*/
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {
	
	@Autowired
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
	}
	
	/**
	 * @param repository
	 */
	public SpeakerServiceImpl(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl args constructor");
		this.repository = repository;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("post constructor method");
	}

	/* (non-Javadoc)
	 * @see com.sap.service.SpeakerService#findAll()
	 */
	public List<Speaker> findAll(){
		return repository.findAll();
	}

	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl setter");
		this.repository = repository;
	}
	
}
