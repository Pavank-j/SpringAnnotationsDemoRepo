package com.coders.springannotationsdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonnelConfigAppRunner{

	public static void main(String[] args) throws Exception{


		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("personnelConfig.class");
		
		Coach theCoach = context.getBean("myPersonnelCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
