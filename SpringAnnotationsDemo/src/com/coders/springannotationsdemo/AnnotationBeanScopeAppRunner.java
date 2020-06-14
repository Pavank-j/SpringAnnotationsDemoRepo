package com.coders.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeAppRunner {

	public static void main(String[] args) {
		// load spring config file
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// reteieving bean frm spring container
	Coach theCoach = context.getBean("tennisCoach", Coach.class);
	
	Coach bCoach = context.getBean("tennisCoach", Coach.class);
	
		// check if they are the same
	
	boolean result =(theCoach == bCoach);
		
		//calling the methods
	System.out.println(">>pointing to the same obj:  " + result);
	
	System.out.println(">>memory location for theCoach: " + theCoach);
	
	System.out.println(">>memory location for bCoach: " + bCoach);
	
		
		//close context
	context.close();

	}

}
