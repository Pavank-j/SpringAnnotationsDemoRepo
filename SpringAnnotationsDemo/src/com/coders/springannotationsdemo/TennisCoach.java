package com.coders.springannotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")//beanID
@Component//using default beanID"tennisCoach
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	
	public TennisCoach(FortuneService thefortuneService) {
		System.out.println(">>We are inside the TennisCoach..............!");
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// 
		
		return "Practise your backend volley!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
