package com.sap.conference.service;

import java.util.List;

import com.sap.conference.model.Speaker;
import com.sap.conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	/**
	 * 
	 */
	public SpeakerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param repository
	 */
	public SpeakerServiceImpl(SpeakerRepository repository) {
		this.repository = repository;
	}

	/* (non-Javadoc)
	 * @see com.sap.service.SpeakerService#findAll()
	 */
	public List<Speaker> findAll(){
		return repository.findAll();
	}

	public void setSpeakerRepository(SpeakerRepository repository) {
		this.repository = repository;
	}
	
}
