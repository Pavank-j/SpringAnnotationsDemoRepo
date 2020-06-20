package com.coders.springannotationsdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.coders.springannotationsdemo")
public class personnelConfig {
	
	@Bean
	public FortuneService myFortuneService() {
		return new MyFortuneService();
	}

	@Bean
	public Coach myPersonnelCoach() {
		MyPersonnelCoach myPersonnelCoach = new MyPersonnelCoach(myFortuneService());
		return myPersonnelCoach;
	}
}
