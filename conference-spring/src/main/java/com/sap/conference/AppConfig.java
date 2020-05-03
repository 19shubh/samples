package com.sap.conference;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.sap.conference"})
public class AppConfig {

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
