package com.sap.conference;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sap.conference.util.CalendarFactory;

@Configuration
@ComponentScan({"com.sap.conference"})
public class AppConfig {
	
	@Bean(name="calendarFactory")
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		System.out.println("In calendarFactory bean");
		factory.addDays(3);
		return factory;
	}
	
	@Bean(name="cal")
	public Calendar calendar() throws Exception {
		System.out.println("In calendar bean");
		return calFactory().getObject();
	}

/*	@Bean(name = "speakerService")
	@Scope(value= BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getCustomerService() {
//		SpeakerServiceImpl service = new SpeakerServiceImpl(getCustomerRepository());
//		service.setRepository(getCustomerRepository());
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		return service;
	}
	
	@Bean(name = "speakerRepository")
	public SpeakerRepository getCustomerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}*/
	
}
