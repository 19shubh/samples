package com.sap.conference;

import com.sap.conference.service.SpeakerService;
import com.sap.conference.service.SpeakerServiceImpl;

public class Application {

	public static void main(String args[]) {
		SpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
	}
	
}
