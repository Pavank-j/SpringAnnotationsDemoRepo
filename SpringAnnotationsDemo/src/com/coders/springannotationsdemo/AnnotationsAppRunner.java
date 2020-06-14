package com.coders.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsAppRunner {

	public static void main(String[] args) {
		
		// read the bean config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		//get  bean from the container
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);//used the default beanID
		//Coach theCoach = context.getBean("racingCoach", Coach.class);//used the setter method 
		//Coach theCoach = context.getBean("racingCoach", Coach.class);//used the field injection 
		
		
		
		
		//call a method on a bean
		System.out.println(theCoach.getDailyWorkOut());
		
		//calling method to call fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		
		//close the context
		context.close();
	}

}
