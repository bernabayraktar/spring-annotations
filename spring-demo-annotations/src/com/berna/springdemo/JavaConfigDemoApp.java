package com.berna.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		

		// get the bean from spring container
		Coach theCoach = context.getBean("lacrosseCoach", Coach.class);
		Coach newCoach = context.getBean("swimCoach", Coach.class);
		BasketballCoach ourCoach = context.getBean("basketballCoach", BasketballCoach.class);
		

		// call a method
		System.out.println(theCoach.getDilyWorkout());
		System.out.println(newCoach.getDilyWorkout());
		
		
		//call method to get the daily fortune 
		System.out.println(theCoach.getDilyFortune());
		
		
		// call getter methods to test how to inject from properties file
		System.out.println("Our Basketball Coach's e-mail --> "+ourCoach.getEmail());
		System.out.println(ourCoach.getDilyFortune());
		

		// close the context  
		context.close();

	}

}
