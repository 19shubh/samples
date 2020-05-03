package com.sap.conference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sap.conference.service.SpeakerService;

public class Application {

	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		SpeakerService service = appContext.getBean(SpeakerService.class);
		
//		SpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
		appContext.close();
	}
	
}
