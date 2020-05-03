package com.sap.conference.repository;

import java.util.ArrayList;
import java.util.List;

import com.sap.conference.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	/* (non-Javadoc)
	 * @see com.sap.repository.SpeakerRepository#findAll()
	 */
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Shubham");
		speaker.setLastName("Chander");
		
		speakers.add(speaker);
		return speakers;
	}
}
