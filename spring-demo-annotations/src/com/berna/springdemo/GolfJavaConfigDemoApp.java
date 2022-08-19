package com.berna.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GolfJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GolfJavaConfigDemo.class);
		

		// get the bean from spring container
		Coach theCoach = context.getBean("golfCoach", Coach.class);
		
		// call a method
		System.out.println(theCoach.getDilyWorkout());
	
	
		//call method to get the daily fortune 
		System.out.println(theCoach.getDilyFortune());
		
		// close the context  
		context.close();

	}

}
