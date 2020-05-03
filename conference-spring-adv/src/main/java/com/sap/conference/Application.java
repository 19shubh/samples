package com.sap.conference;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sap.conference.service.SpeakerService;

public class Application {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpeakerService service = appContext.getBean(SpeakerService.class);
		System.out.println(service);
//		SpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
		SpeakerService service2 = appContext.getBean(SpeakerService.class);
		System.out.println(service2);
		appContext.close();
	}
	
}
