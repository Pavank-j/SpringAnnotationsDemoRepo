package com.coders.springannotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaCoach implements Coach {
	
	private JavaCoach() {
		System.out.println(">> we are inside the default constructor of JavaCoach");
	}
	
	//creating dependency injection by using the field injection
	//field injection uses a java tech called Reflection behind the scenes to create the obj
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "We need to keep practicing daily inorder to master the programming skills";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is a beautiful day to write some code........!";
	}

}
