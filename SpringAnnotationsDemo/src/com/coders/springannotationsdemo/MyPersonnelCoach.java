package com.coders.springannotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class MyPersonnelCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public MyPersonnelCoach(FortuneService theFortuneService) {
	this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Should follow my protocol for trainig daily activities";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
