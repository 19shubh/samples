package com.sap.conference.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.sap.conference.model.Speaker;

@Repository("speakerRepository")
/*Run with -Dspring.profiles.active*/
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	@Autowired
	private Calendar cal;
	
	/* (non-Javadoc)
	 * @see com.sap.repository.SpeakerRepository#findAll()
	 */
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Shubham");
		speaker.setLastName("Chander");
		
		System.out.println(cal.getTime());
		
		speakers.add(speaker);
		return speakers;
	}
}
