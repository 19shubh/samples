package com.sap.conference.service;

import java.util.List;

import com.sap.conference.model.Speaker;
import com.sap.conference.repository.HibernateSpeakerRepositoryImpl;
import com.sap.conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.sap.service.SpeakerService#findAll()
	 */
	public List<Speaker> findAll(){
		return repository.findAll();
	}
	
}
