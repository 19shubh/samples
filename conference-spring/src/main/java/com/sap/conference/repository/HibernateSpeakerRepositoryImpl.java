package com.sap.conference.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sap.conference.model.Speaker;

@Repository("speakerRepository")
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
