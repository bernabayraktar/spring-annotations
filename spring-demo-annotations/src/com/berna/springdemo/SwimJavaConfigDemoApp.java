package com.berna.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		

		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method
		System.out.println(theCoach.getDilyWorkout());
	
	
		//call method to get the daily fortune 
		System.out.println(theCoach.getDilyFortune());
		
		
		// call getter methods to test how to inject from properties file
		System.out.println("email: "+ theCoach.getEmail());
		System.out.println("team: "+ theCoach.getTeam());
	

		// close the context  
		context.close();

	}

}
